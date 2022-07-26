package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q18108 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int gap = 2541 - 1998;
		int a = Integer.parseInt(br.readLine());
		System.out.println(a - gap);
	}
}
