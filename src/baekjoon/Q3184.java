package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q3184 {
	static char[][] map;
	static boolean[][] check;
	static int r;
	static int c;
	static int[] dx = {0,0,-1,1};
	static int[] dy = {1,-1,0,0};
	static Queue<int[]> q;
	static int sheep;
	static int wolf;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		
		map = new char[r][c];
		check = new boolean[r][c];
		
		for(int i=0; i<r; i++) {
			String s = br.readLine();
			for(int j=0; j<c; j++) {
				map[i][j] = s.charAt(j);
				if(s.charAt(j) == '#') {
					check[i][j] = true;
				}
			}
		}
		
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				if(!check[i][j]) {
					
					bfs(i, j);
				}
			}
		}
		System.out.println(sheep + " " + wolf);
	}
	
	static void bfs(int x, int y) {
		q = new LinkedList<>();
		q.offer(new int[] {x,y});
		check[x][y] = true;
		int s = 0;
		int w = 0;
		
		if(map[x][y] == 'o') {
			s++;
		}else if(map[x][y] == 'v') {
			w++;
		}
		
		while(!q.isEmpty()) {
			int[] a = q.poll();
//			System.out.println(a[0] + " " + a[1]);
			
			for(int i=0; i<4; i++) {
				int nx = a[0] + dx[i];
				int ny = a[1] + dy[i];
				
				if(nx <0 || ny <0 || nx >=r || ny >= c || map[nx][ny] == '#') continue;
				
				if(!check[nx][ny]) {
					check[nx][ny] = true;
					q.offer(new int[] {nx, ny});
					if(map[nx][ny] == 'o') {
						s++;
					}else if(map[nx][ny] == 'v') {
						w++;
					}
				}
			}
		}
//		System.out.println(s + " " + w);
		if(s > w) {
			sheep += s;
		}else {
			wolf += w;
		}
	}
}
