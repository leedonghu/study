package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q7562 {
	static int[] dx = {-2,-2,-1,1,-1,1,2,2};
	static int[] dy = {1,-1,2,2,-2,-2,1,-1};
	static int[][] map;
	static boolean[][] check;
	static int startX, startY, endX, endY;
	static int k;
	static Queue<int[]> q;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			k = Integer.parseInt(br.readLine());
			map = new int[k][k];
			check = new boolean[k][k];
			q = new LinkedList<>();
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			startX = Integer.parseInt(st.nextToken());
			startY = Integer.parseInt(st.nextToken());
				
			st = new StringTokenizer(br.readLine());
			endX = Integer.parseInt(st.nextToken());
			endY = Integer.parseInt(st.nextToken());
			bfs(startX, startY);
				
			System.out.println(map[endX][endY]);
			
		}
	}
	
	static void bfs(int x, int y) {
		check[x][y] = true;
		q.add(new int[] {x,y});
		
		while(!q.isEmpty()) {
			int[] a = q.poll();
			if(a[0] == endX && a[1] == endY) {
				break;
			}
			
			for(int i=0; i<8; i++) {
				int nx = a[0] + dx[i];
				int ny = a[1] + dy[i];
				
				if(nx >=0 && ny >= 0 && nx <k && ny < k) {
					if( !check[nx][ny] ) {
						q.add(new int[] {nx, ny});
						check[nx][ny] = true;
						map[nx][ny] = map[a[0]][a[1]] + 1;
					}
				}
			}
		}
	}
}
