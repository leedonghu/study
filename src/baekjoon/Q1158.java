package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1158 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		Queue<Integer> q = new LinkedList<>();
		for(int i=1; i<=n; i++) {
			q.offer(i);
		}
		
		sb.append("<");
		int i =1;
		while(q.size() != 1) {
			
			int x = q.poll();
			
			if(i%k != 0) {
				q.offer(x);
				
			}else {
				sb.append(x+", ");
			}
			i++;
			
		}
		sb.append(q.peek() +">");
		System.out.println(sb);
	}
}
