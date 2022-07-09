package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q14716 {
	static int[][] map;
	static boolean[][] check;
	static int m;
	static int n;
	static int answer = 0;
	static int[] dx = {0,0,-1,1,-1,1,-1,1};
	static int[] dy = {1,-1,0,0,1,1,-1,-1};
	static Queue<int[]> q;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
		m = Integer.parseInt(st1.nextToken());
		n = Integer.parseInt(st1.nextToken());
		
		map = new int[m][n];
		check = new boolean[m][n];
		for(int i=0; i<m; i++) {
			st1 = new StringTokenizer(br.readLine(), " ");
			for(int j=0 ;j<n; j++) {
				map[i][j] = Integer.parseInt(st1.nextToken());
			}
		}
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(!check[i][j] && map[i][j] == 1) {
					
					bfs(i, j);
				}
			}
		}
		
		System.out.println(answer);
	}
	
	static void bfs(int x, int y) {
		q = new LinkedList<>();
		check[x][y] = true;
		q.add(new int[] {x, y});
		
		while(!q.isEmpty()) {
			int[] a = q.poll();
			
			for(int i=0; i<dx.length; i++) {
				int nx = a[0] + dx[i];
				int ny = a[1] + dy[i];
				
				if(nx >=0 && ny >= 0 && nx <m && ny <n) {
					if(!check[nx][ny] && map[nx][ny] == 1) {
						check[nx][ny] = true;
						q.add(new int[] {nx, ny});
					}
				}
			}
		}
		
		answer++;
	}
}
