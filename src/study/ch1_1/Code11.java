package study.ch1_1;

import java.util.Scanner;

public class Code11 {
	public static void main(String[] args) {
		//배열에서 연속된 수로 이루어진 소수들 중에서 최댓값 출력하는 프로그램
		//[1, 3, 5] -> 135 -> 소수인지 검사 -> 최댓값인지 검사
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int[] data = new int[n];
		
		for(int i=0; i<n;i++) {
			data[i] = kb.nextInt();
		}
		
		kb.close();
		
		int max = 0;
		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
				
				
				//정수로 환산
				int val = 0;
				for(int k=i; k<=j; k++) {
					val = val * 10 + data[k]; // [1,3,5] -> val = 0 -> 0*10 + 1 -> 1*10 + 3-> 13*10 +5 ->135
					
				}
				
				//소수확인
				boolean isPrime = true;
				for(int k=2; k*k <= val && isPrime; k++) {
					if(val % k ==0) {
						isPrime = false;
					}
				}
				
				//최댓값
				//소수이면서 최댓값일때
				if(isPrime && val > max && val > 1) { // 1은 소수가 아니기 때문에
					max = val;
				}
			}
		}
		
		if(max > 0) {
			System.out.println(max);
		}else {
			System.out.println("no prime number");
		}
	}
}
