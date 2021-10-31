package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10250 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int test = Integer.parseInt(br.readLine());
		
		for(int i=0; i<test; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int h = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			
			int countH = n % h;
			int countW = (n / h);
			
			if(countH == 0) {
				sb.append(h * 100 + countW).append("\n");
			}else {
				sb.append(countH * 100 + countW + 1).append("\n");
			}
		}
		
		System.out.println(sb.toString());
	}
}
