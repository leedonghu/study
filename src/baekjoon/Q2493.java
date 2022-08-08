package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q2493 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		int[] arr = new int[n+1];
		Stack<Top> stack = new Stack<>();
		for(int i=1; i<=n; i++) {
			int heigh = Integer.parseInt(st.nextToken());
			
			while(!stack.isEmpty()) {
				if(stack.peek().heigh > heigh) {
					sb.append(stack.peek().idx + " ");
				}
				stack.pop();
			}
			
			if(stack.isEmpty()) sb.append(0 + " ");
			
			stack.push(new Top(heigh, i));
		}
		
		System.out.println(sb);
		
		
	}
}

class Top{
	int heigh;
	int idx;
	
	public Top(int heigh, int idx) {
		this.heigh = heigh;
		this.idx = idx;
	}
}
