package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1149 {
	static int[][] map;
	static int[][] cost;
	static int answer;
	static int n;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		map = new int[n][3];
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			map[i][0] = a;
			map[i][1] = b;
			map[i][2] = c;
		}
		cost[0][0] = map[0][0];
		cost[0][1] = map[0][1];
		cost[0][2] = map[0][2];
		
//		Math.min(a, b)
		
		System.out.println(answer);
	}
	
	
}
