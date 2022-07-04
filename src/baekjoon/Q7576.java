package baekjoon;




import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Q7576 {
	static int[][] map;
	static boolean[][] check;
	static int[] dx = {0,0,-1,1};
	static int[] dy = {-1,1,0,0};
	static int n;
	static int m;
	
	static Queue<int[]> q;
	
	public static void main(String[] args)  {
		

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();
		
		map = new int[m][n];
		check = new boolean[m][n];
		
		q = new LinkedList<>();

		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				int a = sc.nextInt();
				
					
				if(a == 1) {
					q.add(new int[] {i, j});
					check[i][j] = true;
					
				}
				map[i][j] = a;
			}
		}
		sc.close();
		System.out.println(bfs());
		
	}
	
	static int bfs() {
		
		
		while(!q.isEmpty()) {
			int[] now = q.poll();
			int nowX = now[0];
			int nowY = now[1];
			
			
			for(int i=0; i<4; i++) {
				int nx = nowX + dx[i];
				int ny = nowY + dy[i];
				
				if(ny >=0 && nx >=0 && nx < n && ny <m) {
					if(!check[nx][ny] && map[nx][ny] == 0) {
						q.add(new int[] {nx, ny});
						map[nx][ny] = map[nowX][nowY] + 1;
						
						check[nx][ny] = true;
					}
				}
			}
		}
		
		int result = Integer.MIN_VALUE;
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(map[i][j] == 0) {
					return -1;
				}
				result = Math.max(result, map[i][j]);
			}
		}
		
		if(result == 1) {
			return 0;
		}else {
			return result -1;
		}
	}
}
