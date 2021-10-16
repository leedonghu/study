package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10952 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int a = 1;
		int b = 1;
		
		while(a != 0 && b != 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			if(a != 0 && b != 0) {
				
				sb.append(a+b).append("\n");
			}
		}
		
		System.out.println(sb.toString());
	}
}
