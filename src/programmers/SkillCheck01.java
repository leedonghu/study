package programmers;

public class SkillCheck01 {
	public static void main(String[] args) {
		int x = -4;
		int n = 5;
		
		long[] answer = solution(x, n);
		for(int i=0; i<n; i++) {
			System.out.println(answer[i]);
		}
	}
	
	public static long[] solution(int x, int n) {
		long[] answer = new long[n];
        
        long t;
        for(int i=0; i<n; i++){
            t = x*(i+1);
            answer[i] = t;
            
        }
        return answer;
	}
}
