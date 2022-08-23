package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q25494 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int cnt = 0;
			for(int j=1; j<=a; j++) {
				for(int k=1; k<=b; k++) {
					for(int t=1; t<=c; t++) {
						if((j%k)==(k%t) && (k%t) == (t%j)) {
							cnt++;
						}
					}
				}
			}
			System.out.println(cnt);
		}
	}
}
