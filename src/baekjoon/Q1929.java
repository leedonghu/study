package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1929 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		for(int i=m; i<=n; i++) {
			boolean check = true;
			if(i == 1) {
				continue;
			}
			for(int j=2; j*j <= i; j++) {
				if(i%j == 0) {
					check = false;
					break;
				}
			}
			if(check == true) {
				sb.append(i).append("\n");
			}
		}
		
		System.out.println(sb.toString());
		br.close();
		
	}
}
