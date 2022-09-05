package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q1874 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Stack<Integer> st = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		int start = 0;
		int t = 0;
		while(t != n) {
			int value = Integer.parseInt(br.readLine());
			
			if(value > start) {
				for(int i=start+1; i<=value; i++) { //value 까지 stack에 push
					st.add(i);
					sb.append("+").append("\n");
				}
				start = value; //오름차순 유지
			}else if(st.peek() != value) {
				System.out.println("NO");
				return;
			}
			
			st.pop();
			sb.append("-").append("\n");
			t++;
		}
		
		System.out.println(sb);
		
	}
}
