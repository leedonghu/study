package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q25592 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int t = 1;
		while(n>=t) {
			n -= t;
			t++;
			
		}
		t = t-1;
		
		
		if(t % 2 != 0) {
			System.out.println(n+" "+t);
			System.out.println(0);
		}else if(t%2 == 0) {
			System.out.println(n+" "+t);
			System.out.println(t+1-n);
		}
	}
}
