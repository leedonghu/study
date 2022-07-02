package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11724 {
	static int[][] map;
	static boolean[] check;
	static int N;
	static int M;
	static int answer = 0;
	
	static void dfs(int i) {
		check[i] = true;
		
		for(int t=1; t<=N;t++) {
			if(!check[t] && map[i][t] == 1) {
				dfs(t);
			}
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st1.nextToken());
		M = Integer.parseInt(st1.nextToken());
		map = new int[N+1][N+1];
		check = new boolean[N+1];
		
		for(int i=0; i<M; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
			int u = Integer.parseInt(st2.nextToken());
			int v = Integer.parseInt(st2.nextToken());
			map[u][v] = 1;
			map[v][u] = 1;
			
		}
		
		for(int i=1; i<=N; i++) {
			if(!check[i]) {
				answer++;
				dfs(i);
			}
		}
		
		System.out.println(answer);
	}
}
