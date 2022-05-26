package programmers;

public class CaesarCipher {
	public static void main(String[] args) {
		String s = "AB";
		int n = 1;
		System.out.println(solution(s, n));
	}
	
	static String solution(String s, int n) {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == 32) {
				sb.append(" ");
			}else if(s.charAt(i)<= 90 && s.charAt(i)+n >90 ) {
				char a = (char)(64 + ((s.charAt(i) + n) - 90));
				sb.append(a);
			}else if(s.charAt(i)<=122 && s.charAt(i)+n >122) {
				char a = (char)(96+((s.charAt(i)+n) - 122));
				sb.append(a);
			}else {
				sb.append((char)(s.charAt(i)+n));
			}
		}
		
		return sb.toString();
	}
}
