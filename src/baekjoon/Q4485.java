package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q4485 {
	static int[][] map;
	static int[][] dist;
	
	static int[]dx = {-1,0,1,0};
	static int[]dy = {0,1,0,-1};
	static int n;
	static class Node implements Comparable<Node>{
		int x;
		int y;
		int value;
		
		public Node(int x, int y, int value) {
			this.x = x;
			this.y = y;
			this.value = value;
		}
		
		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			return this.value - o.value;
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = 1;
		while(true) {
			n = Integer.parseInt(br.readLine());
			if(n == 0) {
				break;
			}
			
			map = new int[n][n];
			dist = new int[n][n];
			
			
			for(int i=0; i<n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				for(int j=0; j<n; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
					dist[i][j] = Integer.MAX_VALUE;
				}
			}
			solution(0,0,map[0][0]);
			System.out.println("Problem "+t+": "+dist[n-1][n-1]);
			t++;
		}
		
	}
	
	static void solution(int x, int y, int value) {
		PriorityQueue<Node> pq = new PriorityQueue<Node>();
		pq.add(new Node(x,y,value));
		dist[0][0] = map[0][0];
		
		while(!pq.isEmpty()) {
			Node node = pq.poll();
			
			
			
			
			for(int i=0; i<4; i++) {
				int nx = node.x + dx[i];
				int ny = node.y + dy[i];
				
				if(nx>=0 && ny>=0 && nx<n && ny <n) {
					if(dist[nx][ny] > dist[node.x][node.y] + map[nx][ny]) {
						
						dist[nx][ny] = dist[node.x][node.y] + map[nx][ny]; 
						pq.add(new Node(nx,ny,dist[nx][ny]));
					}
				}
			}
		}
			
	}
}
