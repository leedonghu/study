package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2292 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(n);
		int next = 1;
		int prev = 1;
		int t = 0;
		
		while(true) {
			prev = next;
			next += (6*t);
			t++;
			if(n>= prev && n<= next) {
				break;
			}
		}
		
		System.out.println(t);
	}
}
