package algorithm.recursiveAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
	static int factorial(int n) {
		if(n > 0) {
			return n * factorial(n-1);
		}else {
			return 1;
		}
	}
	
	static int factorial2(int n) {
		int fac = 1;
		if(n > 0) {
			for(int i=1; i<=n; i++) {
				fac *= i;
			}
			return fac;
		}else {
			return 1;
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("정수를 입력하세요 :");
		int x = Integer.parseInt(br.readLine());
		
		System.out.println(x + "의 팩토리얼은 " + factorial2(x) + "입니다.");
	}
}
