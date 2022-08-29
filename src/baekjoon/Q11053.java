package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q11053 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr= new int[n];
		int[] dp = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<n; i++) {
			int start = arr[i];
			int cnt = 1;
			for(int j=i+1; j<n; j++) {
				if(start < arr[j]) {
					start = arr[j];
					cnt++;
				}
			}
			dp[i] = cnt;
		}
		
//		Arrays.sort(dp);
		for(int i=0; i<n; i++) {
			System.out.println(dp[i]);
		}
		System.out.println(dp[n-1]);
	}
}
