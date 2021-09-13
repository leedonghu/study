package study.ch1_2;

import java.util.Scanner;

public class Code01 {
	public static void main(String[] args) {
		//입력받은 a, b를 a의 b 제곱으로 계산하는 프로그램
		//메소드 사용
		
		Scanner kb = new Scanner(System.in);
		int a = kb.nextInt();
		int b = kb.nextInt();
		
		int result = power(a, b);
		System.out.println(result);
		
		kb.close();
				
	}
	
	static int power(int n, int m){
		
		int prod = 1;
		for(int i=0; i<m; i++) { //m번 곱함
			prod *= n; //n을 -> n의 m제곱
		}
		
		return prod;
	}
}
