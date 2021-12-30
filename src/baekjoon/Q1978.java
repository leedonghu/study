package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1978 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int cnt = 0;
		
		while(st.hasMoreTokens()) {
			int n = Integer.parseInt(st.nextToken());
			boolean check = true;
			if(n == 1) {
				continue;
			}
			for(int i=2; i*i <= n; i++) {
				if(n%i == 0) {
					check = false;
					break;
				}
			}
			if(check == true) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
	}
	

}
