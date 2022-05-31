package programmers;

public class StringSortMyMethod_un {
	public static void main(String[] args) {
		String[] strings = {"sun", "bed", "car"};
		solution(strings, 1);
		
	}
	
	static String[] solution(String[] strings, int n) {
		for(int i=0; i<strings.length-1; i++) {
			for(int j=strings.length-1; j>i; j--) {
				if(strings[j-1].charAt(n) > strings[j].charAt(n)) {
					String tmp = strings[j-1];
					strings[j-1] = strings[j];
					strings[j] = tmp;
				}
			}
		}
		
		for(int i=0; i<strings.length; i++) {
			System.out.println(strings[i]);
		}
		return strings;
	}
}
