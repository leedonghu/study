package programmers;

public class StrangeString {
	public static void main(String[] args) {
		String str = "try hello world";
		System.out.println(solution(str));
	}
	
	static String solution(String str) {
		StringBuilder sb = new StringBuilder();
		int j =0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == ' ') {
				sb.append(' ');
				j = 0;
				
			}else if(j % 2 == 0) {
				sb.append(String.valueOf(str.charAt(i)).toUpperCase());
				j++;
			}else if(j % 2 != 0) {
				sb.append(String.valueOf(str.charAt(i)).toLowerCase());
				j++;
			}
			
		}
		return sb.toString();
	}
}
