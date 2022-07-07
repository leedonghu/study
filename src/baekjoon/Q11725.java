package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q11725 {
	
	static int[][] node;
	static int[] answer;
	static Queue<int[]> q;
	static List<int[]> list;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		answer = new int[n];
		for(int i=0; i<n-1; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			list.add(new int[] {a, b});
		}
		
//		bfs(1);
		for(int i=1; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
	}
	
//	static void bfs(int n) {
//		q = new LinkedList<>();
//		for(int[] a : list) {
//			q.add(a);
//		}
//
//		while(!q.isEmpty()) {
//			int[] arr = q.peek();
//			
//			for(int i=0; i<node.length; i++) {
//				System.out.println(i);
//				if(arr[0] == n) {
//					answer[node[i][1] - 1] = key;
//					q.add(node[i][1]);
//					
//				}else if(arr[1] == n) {
//					answer[node[i][0] - 1] = key;
//					q.add(node[i][0]);
//				}
//			}
//		}
//	}
}
