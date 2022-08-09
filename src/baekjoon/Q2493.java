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
		
		Stack<Top> stack = new Stack<>();
		for(int i=1; i<=n; i++) {
			int heigh = Integer.parseInt(st.nextToken()); //현재 탑의 높이
			
			while(!stack.isEmpty()) {
				if(stack.peek().heigh < heigh) { //이전 탑의 높이가 현재 탑의 높이보다 작으면 
					stack.pop();  //필요 없으므로 pop
				}else { //이전 탑의 높이가 현재 탑의 높이보다 크면
					sb.append(stack.peek().idx + " "); //이전 탑의 idx출력
					break;
				}
			}
			if(stack.isEmpty()) { //수신할 탑이 없음
				sb.append(0 + " ");
			}
			stack.push(new Top(heigh, i)); //다음 탑과 비교하기 위해 현재 탑 push
			
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
