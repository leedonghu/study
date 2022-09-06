package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1259 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			int test = Integer.parseInt(br.readLine());
			if(test == 0) {
				break;
			}
			boolean check = true;
			String str = String.valueOf(test);
			for(int i=0; i<str.length()/2; i++) {
				if(str.charAt(i) != str.charAt(str.length()-i-1)) {
					check = false;
					break;
				}
			}
			
			if(check) {
				sb.append("yes").append("\n");
			}else {
				sb.append("no").append("\n");
			}
		}
		
		System.out.println(sb);
	}
}
