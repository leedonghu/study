package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q10828 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Stack<String> stack = new Stack<>();
		for(int i=0; i<n; i++) {
			String command = br.readLine();
			String[] arr = command.split(" ");
			if(arr[0].equals("push")) {
				stack.add(arr[1]);
			}else if(arr[0].equals("top")) {
				if(stack.size() == 0) {
					System.out.println(-1);
				}else {
					System.out.println(stack.peek());
				}
			}else if(arr[0].equals("size")) {
				System.out.println(stack.size());
			}else if(arr[0].equals("empty")) {
				System.out.println(stack.isEmpty() == true ? 1 : 0);
			}else if(arr[0].equals("pop")) {
				System.out.println(stack.isEmpty() == true ? -1 : stack.pop());
			}
		}
	}
}
