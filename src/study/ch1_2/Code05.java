package study.ch1_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code05 {
	//변수를 밖으로 빼놓아서 사용
	static String[] name = new String[1000];
	static String[] number = new String[1000];
	static int n = 0;
	
	public static void main(String[] args) {
		
		//file에서 받은 이름을 알파벳순으로 정렬
		
		String fileName = "input.txt";
		Scanner inFile;
		
		
		try {
			inFile = new Scanner(new File(fileName));
			
			while(inFile.hasNext()) { //file의 크기를 모르기 때문에 while문 사용
				name[n] = inFile.next();
				number[n] = inFile.next();
				n++;
			}
			
			inFile.close();

			for(int i=0; i<n; i++) {
				System.out.print(name[i]+" ");
				System.out.println(number[i]);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		bubbleSort();
		System.out.println("--------------");
		for(int i=0; i<n; i++) {
			System.out.print(name[i]+" ");
			System.out.println(number[i]);
		}
		
	}
	
	
	private static void bubbleSort(){
		System.out.println("bubbleSort");
		for(int i=n-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				
				if(name[j].compareTo(name[j+1]) > 0) { //name[j]가 name[j+1]보다 크면 0보다 큰 수 리턴
					
					String tmp = name[j];
					name[j] = name[j+1];
					name[j+1] = tmp;
					
					tmp = number[j];
					number[j]= number[j+1];
					number[j+1] = tmp;
					
				}
			}
		}
	}
}
