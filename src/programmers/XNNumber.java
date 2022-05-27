package programmers;

public class XNNumber {
	public static void main(String[] args) {
		int x = -4;
		int n = 2;
		solution(x, n);
	}
	
	static long[] solution(int x, int n) {
		
		long[] answer = new long[n];
		long num = x;
		int t = 1;
		while(t <= n) {
			answer[t-1] = num * t;
			t++;
		}
		
		for(int i=0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
		
		return answer;
	}
}
