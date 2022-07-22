package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1916 {
	static int n;
	static int m;
	static int[] price;
	static boolean[] check;
	static List<Node>[] list;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		m = Integer.parseInt(br.readLine());
		price = new int[n+1];
		check = new boolean[n+1];
		list = new ArrayList[n+1];
		for(int i=1; i<=n; i++) {
			list[i] = new ArrayList<>();
			price[i] = Integer.MAX_VALUE;
		}
		StringTokenizer st;
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());
			
			list[from].add(new Node(to, cost));
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());
		dijkstra(start);
		System.out.println(price[end]);
		
	}
	
	static void dijkstra(int start) {
		Queue<Node> q= new PriorityQueue<Node>();
		q.offer(new Node(start, 0));
		price[start] = 0;
		
		while(!q.isEmpty()) {
			Node node = q.poll();
			int to = node.to;
			if(check[to]) continue;
			check[to] = true;
			for(Node next : list[to]) {
				if(price[next.to] >= price[to] + next.cost) {
					price[next.to] = price[to] + next.cost;
					q.add(new Node(next.to, price[next.to]));
				}
			}
		}
	}
	
	
	}
class Node implements Comparable<Node>{
	int from;
	int to;
	int cost;
	
	public Node(int to, int cost) {
		this.to = to;
		this.cost = cost;
	}
	
	@Override
	public int compareTo(Node o) {
		// TODO Auto-generated method stub
		return this.cost - o.cost;
	}
}
