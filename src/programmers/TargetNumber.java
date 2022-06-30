package programmers;



public class TargetNumber {
	static int answer = 0;
	
	static void dfs(int[] numbers, int depth, int target, int sum) {
		System.out.println("depth: " + depth +" sum :"+sum);
		if(depth == numbers.length) {
			if(target == sum) {
				answer++;
			}
		}else {
			System.out.println("up"+sum+" " + depth);
			dfs(numbers, depth+1, target, sum + numbers[depth]);
			System.out.println("down"+sum+" " + depth);
			dfs(numbers, depth+1, target, sum - numbers[depth]);
		}
	}
	
	static int solution(int[] numbers, int target) {
		dfs(numbers, 0, target, 0);
		
		return answer;
	}
	
	public static void main(String[] args) {
		int[] numbers = {1,1,1,1,1};
		int target = 1;
		System.out.println(solution(numbers, target));
	}
}
