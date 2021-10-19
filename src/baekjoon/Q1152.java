package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1152 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int count = 1;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == ' ') {
				count++;
			}
		}
		
		if(str.charAt(0) == ' ') {
			count--;
		}
		
		if(str.charAt(str.length()-1) == ' ') {
			count--;
		}
		
		if(str.length() == 1 && str.charAt(0) == ' ') {
			System.out.println(0);
		}else {
			
			System.out.println(count);
		}
		
	}
}
