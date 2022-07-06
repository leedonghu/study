package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2206 {
	static int[] dx = {0,0,-1,1};
	static int[] dy = {1,-1,0,0};
	static int[][] map;
	static int n;
	static int m;
	static Queue<int[]> q;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		map = new int[n][m];
		for(int i=0; i<n; i++) {
			String s = br.readLine();
			for(int j=0; j<m; j++) {
				map[i][j] = s.charAt(j) - '0';
			}
		}
		
		
		q = new LinkedList<>();
		q.add(new int[] {0,0});
		bfs();
		System.out.println(map[n-1][m-1]);
	}
	
	static void bfs() {
		int[] a  = q.poll();
		if(a[0] == n-1 && a[1] == m-1) {
			return;
		}
		
		for(int i=0; i<4; i++) {
			int nx = a[0] + dx[i];
			int ny = a[1] + dy[i];
			
			if(nx >=0 && ny >= 0 && nx < n && ny < m) {
				if(map[nx][ny] == 0) {
					map[nx][ny] = map[a[0]][a[1]] + 1;
					q.add(new int[] {nx, ny});
				}
			}
		}
	}
}
