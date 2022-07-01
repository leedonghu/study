package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1012 {
	static int[][] map;
	static boolean[][] checked;
	static int[] dx = {0,0,-1,1};
	static int[] dy = {1,-1,0,0};
	static int m;
	static int n;
	static int k;
	
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		int t1 = 0;
		
		while(t1 < test) {
			StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
			m = Integer.parseInt(st1.nextToken());
			n = Integer.parseInt(st1.nextToken());
			k = Integer.parseInt(st1.nextToken());
			
			map = new int[m][n]; 
			checked = new boolean[m][n];
			
			int t2 = 0;
			while(t2<k) {
				StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
				int x = Integer.parseInt(st2.nextToken());
				int y = Integer.parseInt(st2.nextToken());
				
				map[x][y] = 1;
				t2++;
			}
			
			int answer = 0;
			for(int i=0; i<m; i++) {
				for(int j=0; j<n; j++) {
					if(map[i][j] == 1 && !checked[i][j]) {
						answer++;
						dfs(i,j, m, n);
					}
				}
			}
			System.out.println(answer);
			t1++;
		}
		
	}
	
	static void dfs(int x, int y, int m, int n) {
		checked[x][y] = true;
		
		for(int i=0; i<4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx >=0 && ny >=0 && nx <m && ny < n) {
				if(map[nx][ny] == 1 && !checked[nx][ny]) {
					dfs(nx, ny, m, n);
				}
			}
		}
	}
}	
