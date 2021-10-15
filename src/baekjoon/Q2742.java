package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Q2742 {
	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
//		
//		int n = Integer.parseInt(br.readLine());
//		for(int i=n; i >= 1; i--) {
//			sb.append(i).append("\n");
//		}
//		
//		System.out.println(sb.toString());
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=n; i>=1; i--) {
			System.out.println(i);
		}
		sc.close();
	}
}
