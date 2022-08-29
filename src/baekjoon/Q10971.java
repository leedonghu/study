package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10971 {
	static int n;
	static boolean[] check;
	static int[][] map;
	static int min = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		map = new int[n+1][n+1];
		
		for(int i=1; i<=n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int j=1; j<=n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		check = new boolean[n+1];
		for(int i=1; i<=n; i++) {
			check[i] = true;
			dfs(i,i,0,0);
			check[i] = false;
			
		}
		
		System.out.println(min);
	}
	
	static void dfs(int start, int now, int sum, int cnt) {
		if(cnt == n-1) {
			if(map[now][start] != 0) {
				sum += map[now][start];
				min = Math.min(min, sum);
			}
			return;
		}
		
		for(int i=1; i<=n; i++) {
			if(!check[i] && map[now][i] != 0) {
				check[i] = true;
				dfs(start, i, sum + map[now][i] , cnt+1);
				check[i] = false;
			}
		}
	}
}
