package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2583 {
	static int[] dx = {0,0,-1,1};
	static int[] dy = {1,-1,0,0};
	static int[][] map;
	static boolean[][] check;
	static int m;
	static int n;
	static int k;
	static Queue<int[]> q;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		map = new int[m][n];
		check = new boolean[m][n];
		int place = 0;
		List<Integer> list = new ArrayList<>();
		
		for(int i=0; i<k; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			for(int j=y1; j<y2; j++) {
				for(int t=x1; t<x2; t++) {
					map[j][t] = 1;
				}
			}
		}
		
		for(int i=0;i<m ;i++) {
			for(int j=0; j<n; j++) {
				if(!check[i][j] && map[i][j] == 0) {
					int cnt = bfs(i,j);
					list.add(cnt);
					place++;
				}
			}
		}
		
		
		Collections.sort(list);
		System.out.println(place);
		for(int x : list) {
			System.out.print(x + " ");
		}
	}
	
	static int bfs(int x, int y) {
		q = new LinkedList<>();
		q.add(new int[] {x,y});
		check[x][y] = true;
		int cnt = 1;
		
		while(!q.isEmpty()) {
			int[] a = q.poll();
			
			for(int i=0; i<4; i++) {
				int nx = a[0] + dx[i];
				int ny = a[1] + dy[i];
				
				if(nx>=0 && ny>=0 && nx<m && ny <n) {
					if(!check[nx][ny] && map[nx][ny] == 0) {
						q.add(new int[] {nx, ny});
						check[nx][ny] = true;
						cnt++;
					}
				}
			}
		}
		
		return cnt;
	}
}
