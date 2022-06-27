package programmers;

import java.util.Stack;

public class StockPrice {
	static int[] solution(int[] prices) {
		int length = prices.length;
		int[] answer = new int[length];
		
		for(int i=0; i<prices.length; i++) {
			for(int j=i+1; j<prices.length; j++) {
				answer[i]++;
				if(prices[i] > prices[j]) {
					break;
				}
			}
		}
		
		return answer;
	}
	
	static int[] solution2(int[] prices) {
		int[] answer = new int[prices.length];
		Stack<Integer> stack = new Stack();
		
		for(int i=0; i<prices.length; i++) {
			while(!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
				System.out.println(i);
				System.out.println(stack.peek());
				answer[stack.peek()] = i - stack.peek();
				stack.pop();
			}
			stack.push(i);
		}
		
		//끝까지 가격이 떨어지지 않는 값
		while(!stack.isEmpty()) {
			answer[stack.peek()] = prices.length - stack.peek() - 1;
			stack.pop();
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		int[] prices = {1, 2, 3, 2, 3};
		
		int[] answer = solution(prices);
		int[] answer2 = solution2(prices);
		for(int i=0; i<answer.length; i++) {
//			System.out.println(answer[i]);
			System.out.println(answer2[i]);
		}
		
	}
}
