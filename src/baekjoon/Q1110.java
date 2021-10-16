package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1110 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int n = Integer.parseInt(br.readLine());
		int first = n;
		int cnt = 0;
		
		
		do {
			if(n < 10) {
				n = n+n;
				cnt++;
			}else {
				
				int calc = n/10 + n%10;
				
				n = (n%10)*10 + calc%10;
				cnt++;
			}
		} while(n != first); //do-while문을 이용
		
		System.out.println(cnt);
	}
}
