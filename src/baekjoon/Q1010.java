package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1010 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			System.out.printf("%.0f\n", combi(n,m));
		}
		
		
	}
	
	static double combi(double n , double m) {
		double a = 1;
		double b = 1;
		
		for(double i=m; i>m-n; i--) {
			a = a*i;
		}
		
		for(double i=n; i>0; i--) {
			b = b*i;
		}
		
		return a/b;
	}
}
