package programmers;

public class CompressionString {
	public static void main(String[] args) {
		String str = "abcabcabcabcdededededede";
		solution(str);
		
	}
	
	static int solution(String str) {
		System.out.println(str.length()/2);
		for(int i=str.length()/2; i>=0; i--) {
			
			String sub = str.substring(0, i);
			
			int lastIndex = str.lastIndexOf(sub);
			if(i != 0 && lastIndex != 0) {
				System.out.println("sub:" + sub);
				System.out.println(lastIndex);
				break;
			}
		}
		return 0;
	}
}
