package programmers;

import java.util.Arrays;

public class k_number {
	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2,5,3}, {4,4,1}, {1,7,3}};
		for(int i=0; i<commands.length; i++) {
			System.out.println(solution(array, commands)[i]);
		}
	}
	
	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		
		for(int i=0; i<commands.length; i++) {
			int[] copy = Arrays.copyOfRange(array, commands[i][0] -1, commands[i][1]); //commands의 원소를 index로 하는 배열 생성
			Arrays.sort(copy); //정렬
			
			answer[i] = copy[commands[i][2] -1];
		}
		
		return answer;
	}
}
