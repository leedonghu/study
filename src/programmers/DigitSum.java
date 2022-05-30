package programmers;

public class DigitSum {
	public static void main(String[] args) {
		int n = 987;
		System.out.println(solution(n));
	}
	
	static int solution(int n) {
		String str = String.valueOf(n);
		char[] arr = str.toCharArray();
		int answer = 0;
		for(int i=0; i<str.length(); i++) {
			answer += Integer.parseInt(String.valueOf(arr[i]));
		}
		return answer;
	}
}
