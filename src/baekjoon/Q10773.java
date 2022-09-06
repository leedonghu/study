package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q10773 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> st = new Stack<>();
		
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(br.readLine());
			if(num == 0) {
				st.pop();
			}else {
				
				st.add(num);
			}
		}
		
		int answer = 0;
		while(!st.isEmpty()) {
			int t = st.pop();
			answer += t;
		}
		
		System.out.println(answer);
	}
}
