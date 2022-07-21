package programmers;

import java.util.Arrays;
import java.util.Comparator;

public class BiggestNumber_un {
	public static void main(String[] args) {
		int[] numbers = {3, 30, 34, 5, 9,7,10,74};
		System.out.println(solution(numbers));
	}
	
	static String solution(int[] numbers) {
		String[] arr = new String[numbers.length];
		for(int i=0; i<numbers.length; i++) {
			arr[i] = String.valueOf(numbers[i]);
		}
		
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				
				return (o2+o1).compareTo(o1+o2);
			}
		});
		if(arr[0] == "0") {
			return "0";
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<arr.length; i++) {
			
			sb.append(arr[i]);
		}
		return sb.toString();
	}
}
