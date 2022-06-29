package programmers;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Carpet {
	static int[] solution(int brown, int yellow) {
		int[] answer = new int[2];
		Map<Integer, Integer> map = new HashMap<>();
		int k=0;
		for(int i=1; i<=yellow; i++) {
			if(yellow % i == 0) {
				map.put(k, i);
				k++;
			}
		}
		System.out.println("k" +k);
		
		for(int i=0; i<=k; i++) {
			int height = map.get(i);
//			System.out.println(height);
			int width = map.get(k-i-1);
//			System.out.println(width);
			if(height != width) {
				int sum = (height*2) + (width*2) + 4;
				if(sum == brown) {
					answer[0] = width + 2;
					answer[1] = height + 2;
					break;
				}
			}else {
				int sum = height * 4 + 4;
				if(sum == brown) {
					
					answer[0] = width + 2;
					answer[1] = height + 2;
					break;
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		int brown = 8;
		int yellow = 1;
		for(int i=0; i<2; i++) {
			System.out.println(solution(brown, yellow)[i]);
		}
	}
}
