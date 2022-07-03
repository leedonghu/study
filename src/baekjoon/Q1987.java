package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1987 {
	static int[] dx = {0,0,-1,1};
	static int[] dy = {-1,1,0,0};
	static int[][] map;
	static boolean[] check;
	static int ans = 0;
	static int r, c;
	
	
	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//		
//		r = Integer.parseInt(st.nextToken());
//		c = Integer.parseInt(st.nextToken());
//		
//		map = new char[r][c];
//		check = new boolean[26];
//		
//		for(int i =0; i<r; i++) {
//			String s = br.readLine();
//			for(int j=0; j<c; j++) {
//				map[i][j] = s.charAt(j);
//				System.out.println(map[i][j] - 65);
//			}
//		}
//		
//		dfs(0,0,0);
//		
//		System.out.println(ans);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		map = new int[r][c];
		check = new boolean[26];
		for (int i = 0; i < r; i++) {
			String str = br.readLine();
			for (int j = 0; j < c; j++) {
				map[i][j] = str.charAt(j) - 'A';
			}
		}

		dfs(0, 0, 0);
		// (0,0)부터 시작하며, 현재 이동한 위치는 0회

		System.out.println(ans);
	}
	
	static void dfs(int m, int n, int cnt) {
		if(check[map[m][n]]) {
			ans = Math.max(ans, cnt);
			return;
		}else {
			
			check[map[m][n]] = true;
			
			for(int i=0; i<4; i++) {
				int nx = m + dx[i];
				int ny = n + dy[i];
				
				if(nx>=0 && ny >= 0 &&  nx < r && ny < c) {
					
						dfs(nx,ny,cnt+1);
					
				}
			}
			// ?????
			check[map[m][n]] = false;
		}
		
	}
//	public static void dfs(int x, int y, int count) {
//		if (check[map[x][y]]) { // 0,0에 저장된 알파벳이 이미 한번 방문한 알파벳이라면,
//			ans = Math.max(ans, count); // 정답을 갱신해준다.
//			return; // 조건에 만족하므로 리턴.
//		} else {
//			check[map[x][y]] = true;
//			for (int i = 0; i < 4; i++) {
//				int cx = x + dx[i];
//				int cy = y + dy[i];
//
//				if (cx >= 0 && cy >= 0 && cx < r && cy < c) {
//					dfs(cx, cy, count + 1);
//				}
//
//			}
//
//			check[map[x][y]] = false;
//
//		}
//	}
}
