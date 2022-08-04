package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2231 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int min = 0;
		for(int i=0; i<n; i++) {
			int number = i;
			int sum = 0;
			while(number != 0) {
				sum += number % 10;
				number /= 10;
			}
			
			if(i+sum == n) {
				min = i;
				break;
			}
		}
		
		System.out.println(min);
	}
}
