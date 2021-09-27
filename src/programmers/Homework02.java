package programmers;

import java.util.ArrayList;
import java.util.List;

public class Homework02 {
	public static void main(String[] args) {
		int[] enter = {1,4,2,3};
		int[] leave = {2,1,3,4};
		for(int i=0; i<enter.length; i++) {
			
			System.out.println(solution(enter, leave).get(i));
		}
	}
	
	static List<Integer> solution(int[] enter, int[] leave) {
		List<Integer> list = new ArrayList<Integer>();
		int[] answer = new int[enter.length];
		
		for(int i=0; i<enter.length; i++) {
			answer[i] = 0;
		}
		
		for(int i=0; i<enter.length; i++) {
			for(int j=0; j<enter.length; j++) {
				if(list.indexOf(leave[i]) == -1) {
					list.add(enter[j]);
					
				}else {
					if(j>0) {
						
						answer[list.get(j-1)-1] += list.size() -1;
						
						
						
						for(int k=0; k<list.size(); k++) {
//							answer[list.get(k) - 1] += 1;
							list.remove(k);
						}

//						break;
					}
//					break;
				}
//				break;
			}
			break;
			
		}
		for(int m=0; m<answer.length; m++) {
			System.out.println("answer:" + answer[m]);
		}
		return list;
	}
}
