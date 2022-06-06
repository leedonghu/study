package javaStudy.lamda;

import java.util.Arrays;

public class Lamda {
	public static void main(String[] args) {
		int[] numbers = {3, 30, 34, 5, 9};
		String[] arr = new String[numbers.length];
		for(int i=0; i<arr.length; i++) {
			arr[i] = String.valueOf(numbers[i]);
		}
		
		Arrays.sort(arr, (s1, s2) -> (s2+s1).compareTo(s1+s2));
		String answer = "";
		if(arr[0].equals("0")) {
			System.out.println(0);
		}
		for(String s : arr) {
			answer += s;
		}
		
		System.out.println(answer);
	}
}
