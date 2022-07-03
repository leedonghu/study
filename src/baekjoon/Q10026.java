package baekjoon;

import java.util.Scanner;

public class Q10026 {
	static int[] dx = {0,0,-1,1};
	static int[] dy = {-1,1,0,0};
	static int answer1 = 0;
	static int answer2 = 0;
	static char[][] map1;
	static char[][] map2;
	static boolean[][] check1;
	static boolean[][] check2;
	static int n;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		map1 = new char[n][n];
		map2 = new char[n][n];
		check1 = new boolean[n][n];
		check2 = new boolean[n][n];
		
		for(int i=0; i<n; i++) {
			String s = sc.next();
			for(int j=0; j<s.length(); j++) {
				map1[i][j] = s.charAt(j);
				if(s.charAt(j) == 'G') {
					map2[i][j] = 'R';
				}else {
					map2[i][j] = s.charAt(j);
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(!check1[i][j]) {
					answer1++;
					dfs1(i,j);
				}
				
				if(!check2[i][j]) {
					answer2++;
					dfs2(i,j);
				}
			}
		}
		
		System.out.println(answer1 + " " + answer2);
	}
	
	static void dfs1(int i, int j) {
		check1[i][j] = true;
		char tmp = map1[i][j];
		
		for(int t=0; t<4; t++) {
			int nx = i + dx[t];
			int ny = j + dy[t];
			
			if(nx>=0 && ny >= 0 && nx < n && ny <n ) {
				if(!check1[nx][ny] && tmp == map1[nx][ny]) {
					dfs1(nx, ny);
				}
			}
		}
	}
	
	static void dfs2(int i, int j) {
		check2[i][j] = true;
		char tmp = map2[i][j];
		
		for(int t=0; t<4; t++) {
			int nx = i + dx[t];
			int ny = j + dy[t];
			
			if(nx>=0 && ny >= 0 && nx < n && ny <n ) {
				if(!check2[nx][ny] && tmp == map2[nx][ny]) {
					dfs2(nx, ny);
				}
			}
		}
	}
}
