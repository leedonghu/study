package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11047 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int price = Integer.parseInt(st.nextToken());
		int[] value = new int[n]; 
		
		for(int i=0; i<n; i++) {
			value[i] = Integer.parseInt(br.readLine());
		}
		int cnt = 0;
		for(int i=n-1; i>=0; i--) {
			int t = value[i];
			
			while(price >= t) {
				
				price -= t;
				cnt++;
			}
			
		}
		
		System.out.println(cnt);
	}
}
