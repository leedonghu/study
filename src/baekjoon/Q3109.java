package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q3109 {
	static char[][] map;
	static boolean[][] check;
	static int[] dx = {1,0,-1};
	static int[] dy = {1,1,1};
	static int cnt = 0;
	static int n, m;
	static boolean flag;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		map = new char[n][m];
		check = new boolean[n][m];
		
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			for(int j=0; j<m; j++) {
				map[i][j] = str.charAt(j);
				
			}
		}
		
		for(int i=0; i<n; i++) {
			flag = false;
			check[i][0] = true;
			solve(i,0);
		}
		System.out.println(cnt);
	}
	
	static void dfs(int x, int y) {
		if(y == m-1) {
			flag =true;
			cnt++;
			return;
		}
		
		for(int i=0; i<dx.length; i++) {
			int newX = x+dx[i];
			int newY = y+dy[i];
			
			if(newX>=0 && newY>=0 && newX<n && newY<m) {
				if(!check[newX][newY] && map[newX][newY] == '.') {
					check[newX][newY] = true;
					dfs(newX, newY);
					if(flag) return;
				}
			}
		}
		
	}
	
	static void solve(int x, int y) {
		if (y == m-1) {
			flag = true;
			cnt++;
			return;
		}
		for (int i = 0; i < 3; i++) {
			int xx = x + dx[i];
			int yy = y + dy[i];
			if (xx < 0 || xx >= n || yy < 0 || yy >= m) continue;
			if (check[xx][yy] || map[xx][yy] == 'x') continue;
			check[xx][yy] = true;
			solve(xx, yy);
			if (flag) return;
		}
	}
}
