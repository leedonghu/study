package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1436 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int t = 1;
		int start = 666;
		while(n != t) {
			start++;
			String str= String.valueOf(start);
			if(str.contains("666")) t++;
		}
		
		System.out.println(start);
	}
}
