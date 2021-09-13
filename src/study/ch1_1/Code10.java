package study.ch1_1;

import java.util.Scanner;

public class Code10 {
	public static void main(String[] args) {
		
		//배열에서 연속정 정수의 합이 최대가 되는 프로그램
		//[1,2,3,4,-5,-6,7,8] 다 더하는 것보다 7과 8만 더하는것이 최대값
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] data = new int[n];
		for(int i=0; i<n;i++) {
			data[i] = kb.nextInt();
		}
		kb.close();
		
		int maxNum = 0;
//		for(int i=0; i<n; i++) {
//			for(int j=i; j<n; j++) {
//				//add data[i] ..... data[j]
//				//if sum > max
//				//    max = sum
//				
//				int sum = 0;
//				for(int k=i; k<j; k++) {
//					sum += data[k];
//					
//				}
//				
//				if(sum > maxNum) {
//					maxNum = sum;
//				}
//			}
//		}
		
		for(int i=0; i<n; i++) {
			int sum = 0;
			for(int j=i; j<n; j++) {
				
				sum += data[j];
					
				if(sum > maxNum) {
					maxNum = sum;
				}
			}
		}
		
		System.out.println(maxNum);
		
	}
}
