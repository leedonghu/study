package programmers;

public class FirstStep2 {
	//원하는 제품을 모두 할일받을 수 있는 회원등록 날짜의 총 일수를 리턴 불가능하면 0
	static int solution(String[] want, int[] number, String[] discount) {
		int answer = 0;
		for(int k=0; k<discount.length; k++) {
			for(int i=0; i<want.length; i++) {
				int cnt = 0;
				for(int j=k; j<discount.length; j++) {
					if(want[i].equals(discount[j])) {
						cnt++;
					}
					if(number[i] <= cnt) {
						break;
					}
				}
				if(cnt < number[i]) {
					break;
				}else {
					answer++;
				}
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		String[] want = {"banana", "apple", "rice", "pork", "pot"};
		int[] number = {3,2,2,2,1};
		String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
		System.out.println(solution(want, number, discount));
	}
}
