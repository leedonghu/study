package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q16236 {
	static int[] dx = {0,-1,0,1};
	static int[] dy = {1,0,-1,0};
	static int[][]map;
	static Queue<int[]> q;
	static int n;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		map = new int[n][n];
		
		int x = 0;
		int y = 0;
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int j=0; j<n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if(map[i][j] == 9) {
					x = i;
					y = j;
				}
			}
		}
		
		bfs(x,y);
	}
	
	static void bfs(int a, int b) {
		int size = 2;
		int eat = size;
		q = new LinkedList<>();
		q.offer(new int[] {a,b,0});
		
		while(!q.isEmpty()) {
			int[] arr = q.poll();
			
			
			for(int i=0; i<4; i++) {
				int nx = arr[0] + dx[i];
				int ny = arr[1] + dy[i];
				
				if(nx>=0 && ny >=0 && nx<n&& ny<n) {
					if(map[nx][ny] == 0) {
						q.offer(new int[] {nx, ny, arr[2]+1});
					}else if(map[nx][ny] < size) {
						eat--;
						q.offer(new int[] {nx, ny, arr[2]+1});
						if(eat == 0) {
							size++;
							eat = size;
						}
					}
				}
			}
		}
	}
}
