package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5622 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String phoneNumber = br.readLine();
		sb.append(solution(phoneNumber));
		
		System.out.println(sb.toString());
	}
	
	public static int solution(String phoneNumber) {
		int sum = 0;
		
		for(int i=0 ;i<phoneNumber.length(); i++) {
			if(phoneNumber.charAt(i) == 'A' || phoneNumber.charAt(i) == 'B' || phoneNumber.charAt(i) == 'C') {
				sum += 3;
			}else if(phoneNumber.charAt(i) == 'D' || phoneNumber.charAt(i) == 'E' || phoneNumber.charAt(i) == 'F') {
				sum += 4;
			}else if(phoneNumber.charAt(i) == 'G' || phoneNumber.charAt(i) == 'H' || phoneNumber.charAt(i) == 'I') {
				sum += 5;
			}else if(phoneNumber.charAt(i) == 'J' || phoneNumber.charAt(i) == 'K' || phoneNumber.charAt(i) == 'L') {
				sum += 6;
			}else if(phoneNumber.charAt(i) == 'M' || phoneNumber.charAt(i) == 'N' || phoneNumber.charAt(i) == 'O') {
				sum += 7;
			}else if(phoneNumber.charAt(i) == 'P' || phoneNumber.charAt(i) == 'Q' || phoneNumber.charAt(i) == 'R' || phoneNumber.charAt(i) == 'S') {
				sum += 8;
			}else if(phoneNumber.charAt(i) == 'T' || phoneNumber.charAt(i) == 'U' || phoneNumber.charAt(i) == 'V') {
				sum += 9;
			}else if(phoneNumber.charAt(i) == 'W' || phoneNumber.charAt(i) == 'X' || phoneNumber.charAt(i) == 'Y' || phoneNumber.charAt(i) == 'Z') {
				sum += 10;
			}else {
				sum += 2;
			}
		}
		
		return sum;
	}
}
