package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2739 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int x = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=9; i++) {
			sb.append(x).append(" ").append("*").append(" ").append(i).append(" ").append("=").append(" ").append(x*i).append("\n");
		}
		
		System.out.println(sb.toString());
	}
}
