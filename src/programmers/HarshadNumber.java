package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HarshadNumber {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		sb.append(solution(n));
		
		System.out.println(sb.toString());
		
	}
	
	public static boolean solution(int n) {
		int[] arr = new int[5];
		arr[0] = n / 10000;
		arr[1] = (n / 1000);
		arr[2] = (n / 100) % 10;
		arr[3] = (n / 10) % 10;
		arr[4] = n % 10;
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		if(n % sum == 0) {
			return true;
		}else{
			return false;
		}
		 
		
	}
}
