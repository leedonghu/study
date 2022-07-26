package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10827 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int answer = 1;
		for(int i =1; i<=a; i++) {
			answer = answer*i;
		}
		System.out.println(answer);
	}
	
	
}
