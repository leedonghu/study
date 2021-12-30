package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1011 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int test = Integer.parseInt(br.readLine());
		
		for(int i=0; i<test; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int answer = solution(a, b);
			sb.append(answer).append("\n");
		}
		
		System.out.println(sb.toString());
		
		br.close();
		
		
		
	}
	
	static int solution(int a, int b) {
		
		int distance = b - a;
		int max = (int)Math.sqrt(distance); //소수점 버림
		
		if(max == Math.sqrt(distance)) {
			return (2*max) -1;
		}else if(distance <= (max*max) + max) {
			return (2*max);
		}else {
			return (2*max) + 1;
		}
	}
}
