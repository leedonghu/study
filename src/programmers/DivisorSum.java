package programmers;

public class DivisorSum {
	public static void main(String[] args) {
		int n = 5;
		System.out.println(solution(n));
	}
	
	static int solution(int n) {
		int answer = n;
		for(int i=1; i<=n/2 ; i++) {
			if(n%i == 0) {
				answer += i;
			}
		}
		
		return answer;
	}
}
