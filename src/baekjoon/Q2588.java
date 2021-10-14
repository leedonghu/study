package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Q2588 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		
		
		int A = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int B = Integer.parseInt(str);
		System.out.println(str);
		
		for(int i=str.length(); i>0; i--) {
			sb.append(A*Integer.parseInt(str.substring(i-1, i))).append("\n");
		}

		sb.append(A*B).append("\n");
		
		System.out.println(sb.toString());
		
	}
}
