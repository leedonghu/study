package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q3187 {
	static char[][] map;
	static boolean[][] check;
	static int r;
	static int c;
	static int[] dx = {0,0,-1,1};
	static int[] dy = {1,-1,0,0};
	static Queue<int[]> q;
	
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
			}
		}
		int wolf = 0;
		int sheep = 0;
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				if(!check[i][j] && map[i][j] != '#') {
					int[] a = bfs(i, j);
					wolf += a[0];
					sheep += a[1];
				}
			}
		}
		
		System.out.println(sheep + " " + wolf);
		
	}
	
	static int[] bfs(int x, int y) {
		q = new LinkedList<>();
		check[x][y] = true;
		q.add(new int[] {x,y});
		
		int wolf = 0;
		int sheep = 0;
		
		while(!q.isEmpty()) {
			int[] a = q.poll();
			if(map[a[0]][a[1]] == 'v') {
				wolf++;
			}else if(map[a[0]][a[1]] == 'k') {
				sheep++;
			}
			
			for(int i=0; i<4; i++) {
				int nx = a[0] + dx[i];
				int ny = a[1] + dy[i];
				
				if(nx >= 0 && ny >= 0 && nx < r && ny <c) {
					if(!check[nx][ny] && map[nx][ny] != '#') {
						q.add(new int[] {nx, ny});
						check[nx][ny] = true;
					}
				}
			}
		}
		
		if(wolf >= sheep) {
			sheep = 0;
		}else {
			wolf = 0;
		}
		
		return new int[] {wolf, sheep};
	}
	
}
