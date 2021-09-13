package programmers;

public class Homework01 {
	public static void main(String[] args) {
		System.out.println(solution("01040304499"));
		System.out.println(solution("1111111111111"));
	}
	
	public static String solution(String phone_number) {
		//받은 문자열의 뒷자리 4자리를 제외하고 나머지를 *로 바꿈
		//1.문자열의 길이를 찾는다
		//2. 0부터n-3 까지의 문자열과 n-4부터 끝까지 분자열 분리
		//3. for문을 0부터 n-3까지 돌려 *문자열 생성
		//4. *문자열과 n-3이후의 문자열 결합
		
		int strLength = phone_number.length();
		String frontStr = "";
		String backStr = phone_number.substring(strLength - 4);
		
		for(int i=0; i<strLength -4; i++ ) {
			frontStr += "*";
		}
		
		String answer = frontStr + backStr;
		
		return answer;
	}
}

