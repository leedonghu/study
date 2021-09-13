package study.ch1_1;

import java.util.Scanner;

public class Code09 {
	public static void main(String[] args) {
		
		//입력받은 정수 중복 쌍 찾기
		//1, 1, 3, 4, 5 -> (1,2), (3,1), (4,1), (5,1) -> 리턴 1, 1이 2개있음
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int [] data = new int[n];
		
		for(int i=0; i<n; i++) {
			data[i] = kb.nextInt();
		}
		kb.close();
		
		
		
		int count = 0;
		
		for(int i=0; i<n; i++) {
			for(int j = i+1; j<n ;j++) { //j가 i+1부터 시작하는 이유 중복제거 :data[0] == data[1] ,data[1]==data[0]
				if(data[i] == data[j]) {
					count++;
				}
			}
		}
		System.out.println(count);
		
	}
}
