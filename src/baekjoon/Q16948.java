package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q16948 {
	static int[][] map;
	static boolean[][] check;
	static int[] dx = {-2,-2,0,0,2,2};
	static int[] dy = {-1,1,-2,2,-1,1};
	static int n;
	static int answer;
	static Queue<int[]> q;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		map = new int[n][n];
		check = new boolean[n][n];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int x1 = Integer.parseInt(st.nextToken());
		int y1 = Integer.parseInt(st.nextToken());
		int x2 = Integer.parseInt(st.nextToken());
		int y2 = Integer.parseInt(st.nextToken());
		
		bfs(x1, y1, x2, y2);
			
		
		
	}
	
	static void bfs(int x1, int y1, int x2, int y2) {
		q = new LinkedList<>();
		check[x1][y1] = true;
		q.add(new int[] {x1,y1,0});
		int cnt = 0;
		while(!q.isEmpty()) {
			int[] a = q.poll();
			
			if(a[0] == x2 && a[1] == y2) {
				System.out.println(a[2]);
				return;
			}
			for(int i=0; i<dx.length; i++) {
				int nx = a[0] + dx[i];
				int ny = a[1] + dy[i];
				
				
				
				if(nx>=0 && ny>=0 && nx < n && ny < n) {
					if(!check[nx][ny]) {
						check[nx][ny] = true;
						q.add(new int[] {nx, ny, a[2] +1});
						
					}
				}
			}
			
		}
		
		System.out.println(-1);
	}
}
