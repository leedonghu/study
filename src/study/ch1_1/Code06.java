package study.ch1_1;

import java.util.Scanner;

public class Code06 {
	
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] data = new int[n];
		
		for(int i=0; i<data.length; i++) {
			data[i]= kb.nextInt();
		}
		
		kb.close();
		
		int sum = 0;
		int max = data[0];
		
		for(int i=0; i<data.length; i++) {
			sum += data[i];
			if(data[i]> max) {
				max = data[i];
			}
		}
		
		System.out.println(sum);
		System.out.println(max);
		
	}
}
