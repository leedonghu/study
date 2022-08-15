package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1697 {
	static int n;
	static int k;
	static int[] visited = new int[100001];
	static Queue<Integer> q;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		bfs(n);
		System.out.println(visited[k]);
	}
	
	static void bfs(int n) {
		q = new LinkedList<>();
		q.offer(n);
		int x = 0;
		visited[n] = 0;
		
		while(!q.isEmpty()) {
			x = q.poll();
			
			if(x == k) {
				return;
			}
			//방문하지 않은 곳 중에서
			//x-1의 인덱스를 1증가
			if(x-1 >= 0 && visited[x-1] == 0) {
				
				visited[x-1] = visited[x] + 1;
				q.offer(x-1);
			}
			//x+1의 인덱스를 1증가
			if(x+1 <= 100000 && visited[x+1] == 0) {
				
				visited[x+1] = visited[x] + 1;
				q.offer(x+1);
			}
			//2x의 인덱스를 1증가
			if(2*x <= 100000 && visited[2*x] == 0) {
				
				visited[2*x] = visited[x] + 1;
				q.offer(2*x);
			}
		}
	}
}
