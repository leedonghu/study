package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumDivisor {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		sb.append(solution(n));
		System.out.println(sb.toString());
	}
	
	public static int solution(int n) {
		
		int sum = 0;
		for(int i=1; i<=n; i++) {
			if(n%i == 0) {
				sum += i;
			}
		}
		
		return sum;
	}
}
