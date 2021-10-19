package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1065 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(solution(n));
	}
	
	public static int solution(int n) {
		int count = 0;
		for(int i=1; i<=n; i++) {
			if(i<100) {
				count++;
				System.out.println(i);
			}else {
				int a = i /100 ;
				System.out.println(a);
				int b = (i/10) % 10;
				System.out.println(b);
				int c = (i % 100) % 10;
				System.out.println(c);
				if(a-b == b-c ) {
					count++;
					System.out.println(i);
				}
			}
		}
		
		return count;
	}
}
