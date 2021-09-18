package programmers;

import java.util.ArrayList;
import java.util.List;

public class Homework02 {
	public static void main(String[] args) {
		int[] enter = {1,4,2,3};
		int[] leave = {2,1,3,4};
		for(int i=0; i<enter.length; i++) {
			
			System.out.println(solution(enter, leave )[i]);
		}
	}
	
	static int[] solution(int[] enter, int[] leave) {
		List<Integer> list = new ArrayList<>();
		int[] answer = new int[enter.length];
		
		for(int i=0; i<enter.length; i++) {
			answer[i] = 0;
		}
		
		for(int i=0; i<enter.length; i++) {
			for(int j=0; j<enter.length; j++) {
				if(list.indexOf(leave[i]) == -1) {
					list.add(enter[j]);
					
				}else {
					list.remove(list.indexOf(leave[i]));
					answer[leave[i]-1] += list.size();
					for(int k=0; k<list.size(); k++) {
						answer[list.get(k) -1]++;
					}
					break;
				}
			}
			
		}
		return answer;
	}
}
