package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q6118 {
	static int[][] map;
	static boolean[] check;
	static int[] answer;
	static int cnt = 0;
	static int n;
	static int m;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		map = new int[n+1][n+1];
		check = new boolean[n+1];
		
		for(int i = 0; i<m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			map[a][b] = 1;
			map[b][a] = 1;
		}
		
		for(int i=1; i<n; i++) {
			dfs(i);
		}
	}
	
	static void dfs(int x) {
		check[x] = true;
		
		for(int i=1; i<n; i++) {
			if(!check[i] && map[x][i] == 1) {
				dfs(i);
			}
		}
	}
}
