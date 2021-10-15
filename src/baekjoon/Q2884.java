package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2884 {
	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		if(m>45) {
			sb.append(h).append(" ").append(m-45);
		}else {
			if(h<=1) {
				sb.append(23).append(" ").append(60-45+m);
			}else {
				
				sb.append(h-1).append(" ").append(60-45+m);
			}
		}
		
		System.out.println(sb.toString());
	}


}
