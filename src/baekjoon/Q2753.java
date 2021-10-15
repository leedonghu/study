package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2753 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int year = Integer.parseInt(br.readLine());
		
		if(((year % 4) == 0 && (year % 100) != 0) || year % 400 == 0) {
			sb.append("1");
		}else {
			sb.append("0");
		}
		
		System.out.println(sb.toString());
	}
}
