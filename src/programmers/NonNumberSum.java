package programmers;

public class NonNumberSum {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,6,7,8,0};
		System.out.println(solution(numbers));
	}
	
	public static int solution(int[] numbers) {
		int sum = 0;
		for(int i=0; i<numbers.length; i++) {
			sum += numbers[i];
		}
		return 45 - sum;
	}
}
