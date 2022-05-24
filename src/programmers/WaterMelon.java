package programmers;

public class WaterMelon {
	public static void main(String[] args) {
		int n = 3;
		System.out.println(solution(n));
	}
	
	static String solution(int n) {
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=n; i++) {
			if(i%2 != 0) {
				sb.append("수");
			}else {
				sb.append("박");
			}
		}
		
		return sb.toString();
	}
}
