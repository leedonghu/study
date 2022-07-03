package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2468 {
	static int[] dx = {0,0,-1,1};
	static int[] dy = {-1,1,0,0};
	static int max1 = 0;
	static int max2 = 0;
	static int n;
	static int[][] map;
	static boolean[][] check;
	
	public static void main(String[] args) throws IOException {
//		Scanner sc = new Scanner(System.in);
//		n = sc.nextInt();
//		map = new int[n][n];
//		for(int i=0; i<n; i++) {
//			for(int j=0; j<n; j++) {
//				int k = sc.nextInt();
//				if(k > max1) {
//					max1 = k;
//				}
//				map[i][j] = k;
//			}
//		}
//		
//		int k = 1;
//		while(k <= max1) {
//			int cnt = 0;
//			check = new boolean[n][n];
//			for(int i=0; i<n; i++) {
//				for(int j=0; j<n;j++) {
//					if(!check[i][j] && map[i][j] < k) {
//						cnt++;
//						dfs(i,j,k);
//					}
//				}
//			}
//			System.out.println(cnt);
//			if(cnt > max2) {
//				max2 = cnt;
//			}
//			k++;
//		}
//		
//		System.out.println(max2);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		map = new int[n][n];
		
		int maxHeight=0;
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if(map[i][j] > maxHeight) {
					maxHeight =map[i][j];
				}
			}
		}
		
		int max =0;
		// 1. 모든 지역 탐색
		for(int height=0; height<maxHeight+1; height++) {
			check = new boolean[n][n];
			int cnt=0;
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					// 2. 안전 영역 탐지
					if(!check[i][j] && map[i][j] > height){
						cnt+=dfs1(i,j,height); // 해당 안전영역 탐색 시작
					}
					
				}
			}
			max = Math.max(max, cnt);
		}
		System.out.println(max);
	}
	
	
	static void dfs(int n, int m, int k) {
		check[n][m] = true;
		
		for(int i=0; i<4; i++) {
			int nx = n + dx[i];
			int ny = m + dy[i];
			
			if(nx >=0 && ny >=0 && nx< n && ny < n) {
				if(map[nx][ny] > k && !check[nx][ny]) {
					dfs(nx, ny, k);
				}
			}
		}
	}
	
	static int dfs1(int x, int y, int height) {
		check[x][y] = true;
		for(int i=0; i<4; i++) {
			int nx = x +dx[i];
			int ny = y +dy[i];
			
			if(nx<0 || ny<0 || nx>n-1 || ny >n-1) continue;
			if(check[nx][ny]) continue;
			if(map[nx][ny]> height) {
				dfs(nx,ny, height);
			}
		}
		return 1;
	}
}
