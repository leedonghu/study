package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1260 {
	static int[][] map;
	static boolean[] check;
	static StringBuilder sb;
	static int n;
	static int m;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		int start = Integer.parseInt(st.nextToken());

		map = new int[n+1][n+1];
		check = new boolean[n+1];
		sb = new StringBuilder();
		for(int i=0; i<m; i++){
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			map[a][b] = map[b][a] = 1;
		}

		dfs(start);
		check = new boolean[n+1];
		sb.append("\n");
		bfs(start);
		System.out.println(sb.toString());
	}

	static void dfs(int start){
		check[start] = true;
		sb.append(start).append(" ");
		for(int i=1; i<=n; i++){
			if(map[start][i] == 1 && check[i] == false){
				dfs(i);
			}
		}
	}

	static void bfs(int start){
		Queue<Integer> q = new LinkedList<>();
		q.offer(start);
		check[start] = true;
		sb.append(start).append(" ");
		while(!q.isEmpty()){
			int t = q.poll();

			for(int i=1; i<=n; i++){
				if(map[t][i] == 1 && check[i] == false){
					
					q.offer(i);
					check[i] = true;
					sb.append(i).append(" ");
				}
			}
		}
	}
}
