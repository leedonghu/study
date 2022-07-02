package baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class Q4963 {
	static int[][] map;
	static boolean[][] check;
	static int[] dx = {0,0,-1,1,-1,1,1,-1};
	static int[] dy = {1,-1,0,0,-1,-1,1,1};
	static int w;
	static int h;
	static int answer = 0;
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			
			w = sc.nextInt();
			h = sc.nextInt();
			if(w == 0 && h == 0) {
				break;
			}
			map = new int[h][w];
			check = new boolean[h][w];
			
			for(int i=0; i<h; i++) {
				
				for(int j=0; j<w; j++) {
					
					map[i][j] = sc.nextInt();
				}
			}
			
			for(int i=0; i<h; i++) {
				for(int j = 0; j<w; j++) {
					if(!check[i][j] && map[i][j] == 1) {
						answer++;
						dfs(i, j);
					}
				}
			}
			System.out.println(answer);
			answer = 0;
		}
		
		sc.close();
	}
	
	static void dfs(int i, int j) {
		check[i][j] = true;
		
		for(int t=0; t<8; t++) {
			int nx = i+dx[t];
			int ny = j+dy[t];
			if(nx >=0 && ny >= 0 && nx <h && ny <w) {
				
				if(!check[nx][ny] && map[nx][ny] == 1  ) {
					dfs(nx, ny);
				}
			}
		}
	}
}
