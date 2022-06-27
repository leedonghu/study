package programmers;

public class H_index {
	static int solution(int[] citations) {
		int length = citations.length;
		for(int i=0; i<citations.length; i++) {
			
			int ex = 0;
			for(int j=citations.length-1; j>i; j--) {
				if(citations[j-1] > citations[j]) {
					int tmp = citations[j-1];
					citations[j-1] = citations[j];
					citations[j] = tmp;
					ex++;
				}
			}
			if(ex == 0) {
				break;
			}
		}
		int answer = 0;
		for(int i=0; i<citations.length; i++) {
			int h = length - i;
			if(citations[i] >= h) {
				answer = h;
				break;
			}
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		int[] citations = {3, 0, 6, 1, 5};
		System.out.println(solution(citations));
	}
}
