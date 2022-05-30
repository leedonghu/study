package programmers;

public class StringTreating {
	public static void main(String[] args) {
		String s = "a234";
		System.out.println(solution(s));
	}
	
	static boolean solution(String s) {
		char[] arr = s.toCharArray();
		boolean answer = true;
		if(s.length() == 4 || s.length() == 6) {
			for(int i=0; i<arr.length; i++) {
				if(arr[i]>= 48 && arr[i]<= 57) {
					answer = true;
				}else {
					answer = false;
					break;
				}
			}
		}else {
			answer =false;
		}
		
		return answer;
		
		
	}
}
