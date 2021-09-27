package programmers;

import java.util.ArrayList;
import java.util.List;

public class Ponketmon {
	public static void main(String[] args) {
		int[] test = {3,3,3,2,2,2};
		int answer = solution(test);
		System.out.println(answer);
	}
	
	public static int solution(int[] num) {
		//set을 이용한 중복제거
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<num.length; i++) {
			if(list.indexOf(num[i]) == -1) {
				list.add(num[i]);
			}
		}
		
		int halfLength = num.length/2;
		if(halfLength <= list.size()) {
			return halfLength;
		}else {
			return list.size();
		}
	}
}
