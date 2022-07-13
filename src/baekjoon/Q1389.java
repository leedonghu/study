package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1389 {
	static int[][] map;
	static boolean[] check;
	static int N;
	static int M;
	static Queue<int[]> q;
	static int count = Integer.MAX_VALUE;
	static int answer;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N+1][N+1];
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			map[x][y] = 1;
			map[y][x] = 1;
		}
		
		for(int i=1; i<=N; i++) {
			bfs(i);
		}
		
		System.out.println(answer);
	}
	
	static void bfs(int start) {
		check = new boolean[N+1];
		check[start] = true;
		q = new LinkedList<>();
		q.offer(new int[] {start, 0});
		int cnt = 0;
		
		while(!q.isEmpty()) {
			int[] arr = q.poll();
			int x = arr[0];
			int y = arr[1];
			cnt += arr[1];
			for(int i =1; i<=N; i++) {
				if(map[x][i] == 1 && !check[i]) {
					q.offer(new int[] {i, arr[1] + 1});
					check[i] = true;
				}
			}
		}
		
		if(cnt < count) {
			count = cnt;
			answer = start;
		}
	}
}
