package algorithm.recursiveAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecQ1 {
	
	static int factorial(int n) {
		int answer = 1;
		if(n > 0) {
			for(int i=1; i<=n; i++) {
				answer *= i;
				
			}
		}
		return answer;
		
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("정수를 입력하세요 :");
		int n = Integer.parseInt(br.readLine());
		System.out.println(n+"의 팩토리얼은 " + factorial(n) + "입니다");
	}
}
