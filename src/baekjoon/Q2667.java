package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2667 {
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {1, -1, 0, 0};
	static int[] aparts = new int[25*25];
	static int n;
	static boolean[][] visited = new boolean[25][25];
	static int[][] map = new int[25][25];
	static int apartNum = 0;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		map = new int[n][n];
		visited = new boolean[n][n];
		
		for(int i=0; i<n; i++) {
			String input = br.readLine();
			for(int j=0; j<n; j++) {
				map[i][j] = input.charAt(j)-'0';
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(map[i][j] == 1 && !visited[i][j]) {
					apartNum++;
					dfs(i, j);
				}
			}
		
		}
		
		Arrays.sort(aparts);
		System.out.println(apartNum);
		
		for(int i=0; i<aparts.length; i++) {
			if(aparts[i] != 0) {
				System.out.println(aparts[i]);
			}
		}
	}
	
	static void dfs(int x, int y) {
		visited[x][y] = true;
		aparts[apartNum]++;
		
		//동서남북
		for(int i=0; i<4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			//x y가 범위안에 있고
			if(nx >= 0 && ny >= 0 && nx < n && ny < n) {
				//방문한적이 없을때 
				if(map[nx][ny] == 1 && !visited[nx][ny]) {
					dfs(nx, ny); //이동
				}
			}
		}
	}
}
