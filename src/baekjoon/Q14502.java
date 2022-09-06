package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q14502 {
	static int[][] map;
	static int[][] copy;
	static int[][] virusMap;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,1,0,-1};
	static Queue<int[]> q;
	static int n, m;
	static int ans = -1;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		map = new int[n][m];
		copy = new int[n][m];
		virusMap = new int[n][m];
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0; j<m; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				copy[i][j] = map[i][j];
			}
		}
		
		wall(0);
		System.out.println(ans);
	}
	
	static void wall(int cnt) {
		if(cnt == 3) {
			virus();
			safe();
			return;
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(copy[i][j] == 0) {
					copy[i][j] = 1;
					wall(cnt+1);
					copy[i][j] = 0;
				}
			}
		}
	}
	
	static void virus() {
		q = new LinkedList<>();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				virusMap[i][j] = copy[i][j];
				if(virusMap[i][j] == 2) {
					q.offer(new int[] {i,j});
				}
			}
		}
		
		while(!q.isEmpty()) {
			int[] arr = q.poll();
			
			int x = arr[0];
			int y = arr[1];
			
			for(int i=0; i<4; i++) {
				int nx = x+dx[i];
				int ny = y+dy[i];
				
				if(nx>=0 && ny>=0 && nx<n && ny <m) {
					if(virusMap[nx][ny] == 0) {
						virusMap[nx][ny] = 2;
						q.offer(new int[] {nx,ny});
					}
				}
			}
		}
		
	}
	
	static void safe() {
		int cnt = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(virusMap[i][j] == 0) {
					cnt++;
				}
			}
		}
		
		ans = Math.max(cnt, ans);
	}
}
