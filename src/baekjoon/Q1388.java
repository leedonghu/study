package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1388 {
	static char[][] map;
	static boolean[][] check;
	static int[] dx = {0,0,1,-1};
	static int[] dy = {1,-1,0,0};
	
	static int n;
	static int m;
	static Queue<int[]> q;
	static int answer;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		map = new char[n][m];
		check = new boolean[n][m];
		q = new LinkedList<>();
		for(int i=0; i<n; i++) {
			String s = br.readLine();
			for(int j=0; j<m; j++) {
				map[i][j] =s.charAt(j);
			}
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(!check[i][j]) {
					
					bfs(i,j);
					answer++;
				}
			}
		}
		System.out.println(answer);
	}
	
	static void bfs(int a, int b) {
		check[a][b] = true;
		
		q.offer(new int[] {a,b});
		
		while(!q.isEmpty()) {
			int[] arr = q.poll();
			int x = arr[0];
			int y = arr[1];
			
			for(int i=0; i<4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				
				if(nx<0 || ny<0 || nx>=n || ny>=m) continue;
				
				if(map[nx][ny] == '-') {
					if(map[x][y] == map[x][ny] && !check[x][ny]) { //가로만 이동
						q.offer(new int[] {x,ny});
						check[x][ny] = true;
					}
				}else {
					if(map[x][y] == map[nx][y] && !check[nx][y]) {
						q.offer(new int[] {nx,y});
						check[nx][y] = true;
					}
				}
			}
		}
	}
}
