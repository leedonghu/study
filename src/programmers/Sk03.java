package programmers;

import java.util.Arrays;

public class Sk03 {
	public static void main(String[] args) {
		String[] plans = {"100 1 3", "500 4", "2000 5"};
		String[] clients = {"300 3 5", "1500 1", "100 1 3", "50 1 2"};
		int n = 5;
		int[] answer =solution(n, plans, clients);
		
		for(int i=0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
		//String[] plans = {"100 1 3", "500 4", "2000 5"};
		//String[] clients = {"300 3 5", "1500 1", "100 1 3", "50 1 2"};
		//{3,3,1,0}
		//{1,2,0}
	}
	
	static int[] solution(int n, String[] plans, String[] clients) {
		int[] answer = new int[clients.length];
		int[][] arr01 = new int[clients.length][];
		int[][] arr02 = new int[plans.length][];
 		
		for(int i=0; i<arr01.length; i++) {
			String[] split = clients[i].split(" ");
			
			arr01[i] = Arrays.asList(split).stream().mapToInt(Integer::parseInt).toArray();
			
		}
		
		for(int i=0; i<arr02.length; i++) {
			String[] split = plans[i].split(" ");
			arr02[i] = Arrays.asList(split).stream().mapToInt(Integer::parseInt).toArray();
		}
		
		for(int i=0; i<arr01.length; i++) {
			int min = arr01[i][0];
			boolean check = true;
			int t =0;
			for(int j=0; j<arr02.length; j++) {
				
			}
			
			if(check) {
				answer[i] = t;
			}
		}
		
		
		
		return answer;
	}
}
