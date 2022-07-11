package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Q2665 {
	static int[][] map;
	static int[][] check;
	static int[] dx = {0,0,-1,1};
	static int[] dy = {1,-1,0,0};
	static int n;
	static int answer = Integer.MIN_VALUE;
	static Queue<int[]> q;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		map = new int[n][n];
		check = new int[n][n]; //최소값을 저장
		for(int i=0; i<n; i++) {
			String s = br.readLine();
			for(int j=0; j<n; j++) {
				if(s.charAt(j) == '1') {
					map[i][j] = 1;
					check[i][j] = Integer.MAX_VALUE;
				}else {
					map[i][j] = 0;
					check[i][j] = Integer.MAX_VALUE;
				}
				
			}
		}
		
		bfs();
		System.out.println(check[n-1][n-1]);
		
	}
	
	static void bfs() {
		q = new LinkedList<>();
		q.add(new int[] {0, 0});
		check[0][0] = 0;
		
		while(!q.isEmpty()) {
			int[] arr = q.poll();
			
			
			for(int i=0; i<4; i++) {
				int nx = arr[0] + dx[i];
				int ny = arr[1] + dy[i];
				
				if(nx<0 || ny <0 || nx >= n || ny >= n) {
					continue;
				}
				
				if(check[nx][ny] <= check[arr[0]][arr[1]]) { //옮긴 값에 저 작은 값이 있다면 이동하지 않음
					continue;
				}
				
				if(map[nx][ny] == 1) {
					q.add(new int[] {nx, ny});
					check[nx][ny] = check[arr[0]][arr[1]];
				}else {
					q.add(new int[] {nx, ny});
					check[nx][ny] = check[arr[0]][arr[1]] + 1; //벽일때 +1
				}
			}
		}
	}
}
