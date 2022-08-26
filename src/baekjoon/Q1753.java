package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q1753 {
	static int[] dist;
	static ArrayList<Node>[] list;
	static int V, E;
	static class Node implements Comparable<Node>{
		int id, cost;
		public Node(int id, int cost) {
			this.id = id;
			this.cost = cost;
		}
		@Override
		public int compareTo(Node o) {
			
			return this.cost - o.cost;
		}
		
		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		V = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());
		int start = Integer.parseInt(br.readLine());
		dist = new int[V+1];
		for(int i=1; i<=V; i++) {
			dist[i] = Integer.MAX_VALUE;
		}
		
		list = new ArrayList[V+1];
		for(int i=1; i<=V; i++) {
			list[i] = new ArrayList<Node>();
		}
		
		for(int i=1; i<=E; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			
			list[u].add(new Node(v,w));
		}
		
		dijkstra(start);
		
		StringBuilder sb = new StringBuilder();
		for(int i =1; i<=V; i++) {
			if(dist[i] == Integer.MAX_VALUE) {
				sb.append("INF\n");
			}else {
				sb.append(dist[i]+"\n");
			}
		}
		
		System.out.println(sb);
		
//		int[][] map = new int[v+1][v+1];
//		for(int i=1; i<=v; i++) {
//			for(int j=1; j<=v; j++) {
//				if(i!=j) {
//					map[i][j] = 11;
//				}
//			}
//		}
//		
//		for(int i=0; i<e; i++) {
//			st = new StringTokenizer(br.readLine(), " ");
//			int a = Integer.parseInt(st.nextToken());
//			int b = Integer.parseInt(st.nextToken());
//			int c = Integer.parseInt(st.nextToken());
//			map[a][b] = c;
//			
//		}
//		
//		for(int i=1; i<=v; i++) {
//			for(int j=1; j<=v; j++) {
//				for(int k=1; k<=v; k++) {
//					if(map[j][k] > map[j][i] + map[i][k]) {
//						map[j][k] = map[j][i] +map[i][k];
//					}
//				}
//			}
//		}
//		
//		for(int i=1; i<=v; i++) {
//			int x = map[start][i];
//			if(x == 11) {
//				System.out.println("INF");
//			}else {
//				System.out.println(map[start][i]);
//			}
//		}
		
		
	}
	
	static void dijkstra(int start) {
		PriorityQueue<Node> pq = new PriorityQueue<Node>();
		dist[start] = 0;
		pq.add(new Node(start, 0));
		boolean[] check = new boolean[V+1];
		
		while(!pq.isEmpty()) {
			Node node = pq.poll();
			if(check[node.id]) continue;
			check[node.id] = true;
			for(Node n : list[node.id]) {
				if(dist[n.id] > dist[node.id] + n.cost) {
					dist[n.id] = dist[node.id] + n.cost;
					pq.add(new Node(n.id, dist[n.id]));
				}
			}
			
//			//더큰 가중치로 도착
//			if(node.cost > dist[node.id]) continue;
//			
//			//현재 위치에 연결된 간선 탐색
//			int len = list[node.id].size();
//			for(int i=0; i<len; i++) {
//				Node next = (Node)list[node.id].get(i);
//				
//				//코스트가 더 적을때만 pq에 넣기
//				if(dist[next.id] > node.cost+ next.cost) {
//					dist[next.id] = node.cost+ next.cost;
//					pq.add(new Node(next.id, dist[next.id]));
//				}
//			}
		}
	}
}
