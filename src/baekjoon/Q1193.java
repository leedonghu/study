package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1193 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int now = 1;
		
		int sum = 0;
		int prevSum = 0;
		
		while(true) {
			if(n<=sum) {
				break;
			}
			prevSum = sum;
			sum += now; 
			now++;
			
		}
		int up=0;
		int down = 0;
		if((now - 1)%2 == 0) {
			
			up = 1;
			down = now -1;
			
			for(int i=0; i<n-prevSum -1; i++) {
				up++;
				down--;
			}
		}else {
			up = now -1;
			down = 1;
			for(int i=0; i<n-prevSum -1; i++) {
				up--;
				down++;
			}
		}
		sb.append(up).append("/").append(down);
		System.out.println(prevSum);
		System.out.println(now);
		System.out.println(sum);
		System.out.println(sb.toString());
	}
}
