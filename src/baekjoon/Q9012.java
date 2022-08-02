package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q9012 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n; i++) {
			Stack<Character> s = new Stack<Character>();
			String str = br.readLine();
			for(int j=0;j<str.length(); j++) {
				char c = str.charAt(j);
				if(c == '(') {
					s.add(c);
				}else {
					//시작에 ) 괄호가 오면 안됨
					if(s.size() == 0) {
						s.add(c);
						break;
					}else {
						s.pop();
					}
				}
			}
			if(s.isEmpty()) {
				sb.append("YES").append("\n");
			}else {
				sb.append("NO").append("\n");
			}
		}
		
		System.out.println(sb);
	}
}
