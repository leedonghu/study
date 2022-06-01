package programmers;

public class Remainder1 {
	public static void main(String[] args) {
		int n = 11;
		System.out.println(solution(n));
	}
	
	static int solution(int n) {
		int answer = 0;
		if(n % 2==0) {
			for(int i=1; i<n; i+=2) {
				if(n % i == 1) {
					answer = i;
					break;
				}
			}
		}else {
			for(int i=2; i<n; i+=2) {
				if(n % i == 1) {
					answer = i;
					break;
				}
			}
		}
		
		return answer;
	}
}
