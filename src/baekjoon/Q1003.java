package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q1003 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = 0;
		
		int t = Integer.parseInt(br.readLine());
		
		while(n<t) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int p = Integer.parseInt(st.nextToken());
		
			sb.append(printOneZero(p)).append("\n");
			n++;
		}
		System.out.println(sb);
		
	}
	
	private static String printOneZero(int n) {
		int[]one = new int[n+1];
		int[]zero = new int[n+1];
		
		for(int i=0; i<=n; i++) {
			if(i==0) {
				one[i] = 0;
				zero[i] = 1;
			}else if(i==1) {
				one[i] = 1;
				zero[i] = 0;
			}else {
				one[i] = one[i-1] + one[i-2];
				zero[i] =zero[i-1]+ zero[i-2];
			}
		}
		return zero[n] + " " + one[n];
	}


}
