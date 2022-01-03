package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4948 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = -1;
		
		while(n != 0) {
			n = Integer.parseInt(br.readLine());
			if(n != 0) {
				int answer = solution(n);
				sb.append(answer).append("\n");
			}
		}
		System.out.println(sb.toString());
	}
	
	public static int solution(int n) {
		
		int cnt = 0;
		for(int i=n+1; i<=2*n; i++) {
			boolean check = true;
			if(i == 1) {
				continue;
			}
			for(int j=2; j*j<=i; j++) {
				if(i%j == 0) {
					check = false;
					break;
				}
			}
			if(check == true) {
				cnt++;
			}
		}
		return cnt;
	}
}
