package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1463 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		int answer = solution(num);
		System.out.println(answer);
	}
	
	static int solution(int num) {
		
		int a = num;
		while(true) {
			
			int b = 1;
			
			while(a != 0) {
				b *= a%10;
				a = a/10;
				
			}
			
			a = b;
			if(b < 10) {
				break;
			}
		}
		
		return a;
	}
}
