package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10809 {
	public static void main(String[] args) throws IOException {
		int[] arr = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		for(int i=0; i<str.length(); i++) {
			int n = str.indexOf(str.charAt(i));
			int asc = str.charAt(i);
			
			arr[asc-97] = n; //알파벤 소문자 아스키코드 이용 97~122
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0 ;i <arr.length; i++) {
			sb.append(arr[i]).append(" ");
		}
		
		System.out.println(sb.toString());
	}
}
