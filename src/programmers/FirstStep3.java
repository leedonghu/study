package programmers;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class FirstStep3 {
	static int solution(int[] order) {
		Queue<Integer> q = new LinkedList<>();
		Stack<Integer> s = new Stack<>();
		for(int i=1; i<=order.length; i++) {
			q.offer(i);
		}
		
		
		while(!q.isEmpty()) {
			
			int a = q.peek();
			if(a != order[0]) {
				s.add(a);
				q.poll();
			}else {
				break;
			}
		}
		int cnt = 0;
		for(int i=0; i<order.length; i++) {
			int x = 0;
			int y = 0;
			if(!q.isEmpty()) {
				x = q.peek();
			}
			if(!s.isEmpty()) {
				y = s.peek();
			}
			if(order[i] == x) {
				cnt++;
				q.poll();
			}else if(y == order[i]) {
				s.pop();
				cnt++;
			}else {
				break;
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		int[] order = {5,4,3,2,1};
		System.out.println(solution(order));
	}
}
