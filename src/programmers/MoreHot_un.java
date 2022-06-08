package programmers;

import java.util.Arrays;

public class MoreHot_un {
	public static void main(String[] args) {
		int[] scoville = {1, 2, 3, 9, 10, 12};
		int k = 7;
		System.out.println(solution(scoville, k));
		}
	
	static int solution(int[] scoville, int k) {
//		int n = scoville.length;
//		for(int i=0; i<n-1; i++) {
//			for(int j=n-1; j>n; j--) {
//				if(scoville[j-1] > scoville[j]) {
//					int tmp = scoville[j-1];
//					scoville[j-1] = scoville[j];
//					scoville[j] = tmp;
//				}
//			}
//		}
//		
//		int min = scoville[0];
//		
//		int i = 0;
//		while(min<=k) {
//			scoville[i+1] = scoville[i] + (scoville[i+1] * 2);
//			min = scoville[i+1];
//			i++;
//			
//		}
		
		Arrays.sort(scoville);
		
		int min = scoville[0];
		
		
		return 0;
	}
}
