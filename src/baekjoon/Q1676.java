package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1676 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int two = 0;
		int five = 0;
		
		for(int i=1; i<=n; i++) {
			int t = i;
			
			while(t % 2 == 0) {
				two++;
				t /= 2;
			}
			
			while(t%5 == 0) {
				five++;
				t /= 5;
			}
		}
		
		System.out.println(two > five ? five : two);
	}
}
