package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10430 {
	public static void main(String[] args) throws IOException {
		
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		sb.append((A+B)%C).append("\n");
		sb.append(((A%C)+(B%C))%C).append("\n");
		sb.append((A*B)%C).append("\n");
		sb.append(((A%C)*(B%C))%C).append("\n");
		
		System.out.println(sb.toString());
	}
}
