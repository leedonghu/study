package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FirstStep1 {
	static String solution(String x, String y) {
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<Integer> list3 = new ArrayList<>();
		for(int i=0; i<x.length() ; i++) {
			list1.add(x.charAt(i) - '0');
		}
		
		for(int i=0; i<y.length() ; i++) {
			list2.add(y.charAt(i) - '0');
		}
		
		for(int i=0; i<list1.size(); i++) {
			int a = list1.get(i);
			for(int j=0; j<list2.size(); j++) {
				int b = list2.get(j);
				if(a == b) {
					list3.add(a);
					
					list2.remove(j);
				}
			}
		}
		
		Collections.sort(list3, Collections.reverseOrder());
		StringBuilder sb = new StringBuilder();
		if(list3.size() == 0) {
			return "-1";
		}else if(list3.get(0) == 0){
			return "0";
		}else {
			for(int i=0; i<list3.size(); i++) {
				sb.append(list3.get(i));
//				System.out.println(list3.get(i));
			}
			
			return sb.toString();
			
		}
	}
	
	public static void main(String[] args) {
		System.out.println(solution("100", "123450"));
	}
}
