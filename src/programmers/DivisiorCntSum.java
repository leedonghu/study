package programmers;

public class DivisiorCntSum {
	public static void main(String[] args) {
		int left = 24;
		int right = 27;
		System.out.println(solution(left, right));
	}
	
	static int solution(int left, int right) {
		
		int result = 0;
		for(int i= left; i<=right; i++) {
			int cnt = 0;
			for(int j=1; j<=i; j++) {
				if(i % j ==0) {
					cnt++;
				}
			}
			
			if(cnt % 2 == 0) {
				result += i;
			}else {
				result -= i;
			}
		}
		
		return result;
	}
}
