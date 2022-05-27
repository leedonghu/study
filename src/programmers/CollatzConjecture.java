package programmers;

public class CollatzConjecture {
	public static void main(String[] args) {
		int n = 626331;
		System.out.println(solution(n));
	}
	
	static int solution(int n) {
		long num = n;
		int cnt = 0;
		while(num != 1 ) {
			if(num%2==0) {
				num /= 2;
			}else {
				num = (num*3) +1;
			}
			
			if(cnt == 500) {
				cnt = -1;
				break;
			}
			cnt++;
		}
		return cnt;
	}
}
