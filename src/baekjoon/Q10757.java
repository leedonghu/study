package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10757 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		String str1 = st.nextToken();
		String str2 = st.nextToken();
		
		int max = 0;
		
		int len1 = str1.length();
		int len2 = str2.length();
		
		if(len1 >= len2) {
			max = len1;
			
		}else {
			max = len2;
			
		}
		
		int[] arr1 = new int[max+1];
		int[] arr2 = new int[max+1];
		String[] answer = new String[max+1];
		
		for(int i=0; i<str1.length(); i++) {
			arr1[i] = Integer.parseInt(str1.substring(str1.length()-i-1, str1.length()-i));
		}
		
		for(int i=0; i<str2.length(); i++) {
			arr2[i] = Integer.parseInt(str2.substring(str2.length()-i-1, str2.length()-i));
		}
		
		for(int i=0; i<=max; i++) {
			int x = arr1[i];
			int y = arr2[i];
			
			if(x+y>=10) {
				arr1[i+1] = arr1[i+1] + 1;
				answer[i] = String.valueOf((x+y) % 10);
			}else {
				answer[i] = String.valueOf(x+y);
			}
		}
		
		if(answer[answer.length-1].equals("0")) {
			for(int i=answer.length-2; i>=0; i--) {
				sb.append(answer[i]);
			}
		}else {
			for(int i=answer.length-1; i>=0; i--) {
				
				
				sb.append(answer[i]);
				
			}
			
		}
		
		System.out.println(sb.toString());
	}
}
