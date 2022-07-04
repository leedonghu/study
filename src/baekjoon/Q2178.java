package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2178 {
	static int[][] map;
	static boolean[][] check;
	static int[] dx = {0,0,-1,1};
	static int[] dy = {-1,1,0,0};
	static int n;
	static int m;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		map = new int[n][m];
		check = new boolean[n][m];
		
		for(int i=0; i<n; i++) {
			String s = br.readLine();
			for(int j=0; j<m; j++) {
				map[i][j] = s.charAt(j) - '0';
			}
		}
		
		check[0][0] = true;
		bfs(0, 0);
		System.out.println(map[n-1][m-1]);
		
		
		
	}
	
	static void bfs(int x, int y) {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {x,y});
		
		while(!q.isEmpty()) {
			int[] now = q.poll();
			int nowX = now[0];
			int nowY = now[1];
			
			for(int i=0; i<4; i++) {
				int nx = nowX + dx[i];
				int ny = nowY + dy[i];
				
				if(ny >=0 && nx >=0 && nx < n && ny <m) {
					if(!check[nx][ny] && map[nx][ny] == 1) {
						q.add(new int[] {nx, ny});
						map[nx][ny] = map[nowX][nowY] + 1;
						check[nx][ny] = true;
					}
				}
			}
		}
	}
}
