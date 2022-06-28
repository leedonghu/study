package programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Phone_Book {
	static boolean solution(String[] phone_book) {
		
		int min = phone_book[0].length();
		int index = 0;
		
		for(int i=0; i<phone_book.length; i++) {
			if(phone_book[i].length() < min) {
				index = i;
				min = phone_book[i].length();
			}
		}
		
		for(int i=0; i<phone_book.length; i++) {
			String comp = phone_book[index];
			if(comp.equals(phone_book[i].substring(0, min)) && i != index) {
				return false;
			}
		}
		
		return true;
	}
	
	static boolean solution2(String[] ph) {
		Map<String, Integer> map = new HashMap<>();
		for(int i=0; i<ph.length; i++) {
			map.put(ph[i], i);
		}
		
		for(int i=0; i<ph.length; i++) {
			for(int j=1; j<ph[i].length(); j++) {
				String pre = ph[i].substring(0,j);
				if(map.containsKey(pre)) {
					return false;
				}
			}
		}
		return true;
	}
	
	static boolean solution3(String[] ph) {
		
		//문자열 자연정렬(사전)
		Arrays.sort(ph);
		
		for(int i=0; i<ph.length; i++) {
			System.out.println(ph[i]);
		}
		
		//i번째 번호가 i+2번째의 접두어이면서 i+1번째 접두어가 아닐 순 없음????
		//자신의 오른쪽만 비교???
		for(int i=0; i<ph.length; i++) {
			if(ph[i+1].startsWith(ph[i])) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		String[] ph = {"119", "97674223", "1195524421"};
		System.out.println(solution3(ph));
	}
}
