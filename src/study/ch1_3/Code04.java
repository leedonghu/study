package study.ch1_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Code04 {
	//string 기본 메소드
	//equals
	//compareTo: int 리턴 str1.compareTo(str2) str1이 크면 양수 리턴 
	//length
	//charAt: 특정문자 리턴 char ch = str.charAt(2)
	//indexOf: 지정한 문자의 위치 검색
	//substring
	
	static String[] words = new String[100000];
	static int[] count = new int[100000]; //각 단어의 등장 횟수
	static int n = 0;
	
	public static void main(String[] args) {
		
		//인덱스 메이커
		//1.파일을 읽음
		//2.단어가 몇번 나오는지 출력, 인덱스로 만듦
		//3.인덱스파일에 저장
		
		Scanner kb = new Scanner(System.in);
		
		while(true) { //사용자가 그만둘때까지 무한 루프
			
			System.out.println("$ ");
			String command = kb.next();
			if(command.equals("read")) {
				
				String fileName = kb.next();
				makeIndex(fileName);
				
			}else if(command.equals("find")) {
				
				String str = kb.next();
				int index = findWord(str);
				if(index > -1) {
					System.out.println("the word " + words[index] + "appears " + count[index] + "times");
				}else {
					System.out.println("the word " + str + " does`n appears " );
				}
				
			}else if(command.equals("save")) {
				String fileName = kb.next();
				saveAs(fileName);
			}else if(command.equals("exit")) {
				break;
			}
		}
		kb.close();
		
		for(int i=0; i<n; i++) {
			System.out.println(words[i]+","+count[i]);
		}
	}
	
	static void makeIndex(String fileName) {
		
		try {
			Scanner inputFile = new Scanner(new File(fileName));
			
			while(inputFile.hasNext()) {
				String str = inputFile.next();
				
				String trimmed = trimming(str);
				if(trimmed != null) {
					String t = trimmed.toLowerCase();
					addWord(t); //읽은 문자열이 이미 있던 문자열인지 확인, 있으면 count증가 없으면 배열에 추가
					
				}
				
			}
			
			inputFile.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
	}
	
	static String trimming(String str) {
		//단어 앞뒤에 붙은 특수문자 제거
		//앞과 뒤에서 탐색
		int i = 0;
		int j = str.length() -1;
		while(i<=str.length() -1 && !Character.isLetter(str.charAt(i))) { //i번째 글자가 문자가 아닐때 !(str.charAt(i) >= 'a' && str.charAt(i) <='z')
			i++;
		}
		while(j>=0 && !Character.isLetter(str.charAt(j))) { 
			j--;
		}
		
		if(i > j) {
			return null;
		}
		String trimmed = str.substring(i, j+1);
		
		return trimmed;
	}

	static void addWord(String str) {
		
		int index = findWord(str); // 못찾으면 -1
		
		if(index != -1) { //exist
			count[index]++;
			
		}else { //not found
			int i = n-1;//뒤에서부터 검사하는것이 효율적, 알파벳순으로 삽입
			for(; i>=0 && words[i].compareToIgnoreCase(str) >0;) {
				words[i+1] = words[i];
				count[i+1] = count[i];
				i--;
			}
			words[i+1] = str;
			count[i+1] = 1;
			n++;
		}
	}
	
	static int findWord(String str) {
		for(int i=0; i<n; i++) {
			if(words[i].equals(str)) {
				return i;
			}
			
		}
		return -1;
	}
	
	static void saveAs(String fileName) {
		try {
			PrintWriter out = new PrintWriter(new FileWriter(fileName));
			for(int i=0; i<n; i++) {
				out.println(words[i]+ " " + count[i]);
			}
			
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
	}
}
