package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1157 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] arr = new int[26];
		String str = br.readLine();
		String upperStr = str.toUpperCase(); //대문자로 만듦
		
		for(int i=0; i<upperStr.length(); i++) { //각문자가 몇번 나오는지 배열에 저장
			int asc = upperStr.charAt(i);
			arr[asc-65]++;
			
		}
		
		int max = arr[0];
		int count = 0; //최대값 횟수 체크
		int ascNum = 0; //마지막에 문자로 변환하기위해 최대값 index저장
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) { //최대값 찾기
				max = arr[i];
				
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == max) { //최대값 횟수 체크
				count++;
				ascNum = i; //최대값 index
				
			}
		}
		
		if(count>=2) { //count가 2 이상이면 가장 많이 등장한 문자가 여러개라는 뜻
			sb.append("?");
		}else {
			char a = (char)(ascNum + 65); //문자로 변환
			
			sb.append(a);
		}
		
		System.out.println(sb.toString());
	}
}
