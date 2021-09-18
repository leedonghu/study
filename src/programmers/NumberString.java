package programmers;

public class NumberString {
	static String[] en = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
	static String[] number = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
	
	
	public static void main(String[] args) {
		System.out.println(solution("onetwo"));
	}
	
	public static int solution(String s) {
		for(int i=0; i<en.length; i++) {
			s = s.replaceAll(en[i], number[i]);
		}
		
		
		return Integer.parseInt(s);
	}
}
