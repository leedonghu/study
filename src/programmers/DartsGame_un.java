package programmers;

public class DartsGame_un {
	public static void main(String[] args) {
		char a = 49;
		char b = 48;
		System.out.println(String.valueOf(a)+b);
	}
	
	static int solution(String dartResult) {
		int[] result = new int[3];
		String s = "";
		for(int i=0; i<dartResult.length(); i++) {
			char a = dartResult.charAt(i);
			if(a >= 48 && a<= 57) {
				s += String.valueOf(a);
			}
		}
		return 0;
	}
}
