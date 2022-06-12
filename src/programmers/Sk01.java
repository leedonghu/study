package programmers;

public class Sk01 {
	public static void main(String[] args) {
		int[] p = {2,5,3,1,4};
//		for(int i=0; i<p.length; i++) {
//			System.out.println(solution(p)[i]);
//		}
		solution(p);
	}
	
	static int[] solution(int[] p) {
		int[] answer = new int[p.length];
		
		for(int i=0; i<p.length; i++) {
			int min = p[i];
			int k =i;
			for(int j=i; j<p.length; j++) {
				if(p[j] < min) {
					min = p[j];
					k = j;
				}
			}
			if(i != k) {
				System.out.println(i);
				System.out.println(k);
				System.out.println("----------");
				int tmp = p[i];
				p[i] = p[k];
				p[k] = tmp;
				answer[i]++;
				answer[k]++;
			}
			
			
		}
		
		for(int i=0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
		
		
		
		return answer;
		
	}
}
