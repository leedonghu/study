package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9498 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int score = Integer.parseInt(br.readLine());
		if(score>=90) {
			sb.append("A");
		}else if(score<90 && score>=80) {
			sb.append("B");
		}else if(score<80 && score>=70) {
			sb.append("C");
		}else if(score<70 && score>=60) {
			sb.append("D");
		}else {
			sb.append("F");
		}
		
		System.out.println(sb.toString());
	}
}
