package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q15686 {
	static int[] dx = {0,1,1,1,0,-1,-1,-1};
	static int[] dy = {1,1,0,-1,-1,-1,0,1};
	static Queue<int[]> q;
	static boolean[][]check;
	static int[][] map;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		map = new int[n+1][n+1];
		check = new boolean[n+1][n+1];
		List<Chicken> list = new ArrayList<>();
		for(int i=1; i<=n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=1; j<=n; j++) {
				if(Integer.parseInt(st.nextToken()) == 2) {
					list.add(new Chicken(i,j));
				}
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(Chicken c : list) {
			bfs(c.x, c.y);
		}
	}
	
	static int bfs(int a, int b) {
		q = new LinkedList<>();
		check[a][b] =true;
		q.offer(new int[] {a,b});
		
		while()
	}
}

class Chicken{
	int x;
	int y;
	
	public Chicken(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
