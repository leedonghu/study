package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q11725 {
	
	static int[][] node;
	static int[] answer;
	static Queue<Integer> q;
	static List<List<Integer>> list;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		answer = new int[n+1];
		list = new ArrayList<>();
		for(int i=0; i<=n ;i++) {
			list.add(new ArrayList<>());
		}
		for(int i=0; i<n-1; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			list.get(a).add(b);
			list.get(b).add(a);
		}
		
		q = new LinkedList<>();
		boolean[] check = new boolean[n+1];
		
		q.offer(1);
		check[1] = true;
		
		while(!q.isEmpty()) {
			int v = q.poll();
			for(int next : list.get(v)) {
				if(!check[next]) {
					check[next] = true;
					answer[next] = v;
					q.offer(next);
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=2; i<answer.length; i++) {
			sb.append(answer[i]).append("\n");
		}
		
		System.out.println(sb);
	}
	
	
}
