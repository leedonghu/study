package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q25501 {
	static int cnt = 0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			int answer = isPalindrome(str);
			sb.append(answer+ " " + cnt).append("\n");
			cnt = 0;
		}
		
		System.out.println(sb);
	}
	
	static int isPalindrome(String str) {
		return recursion(str, 0, str.length()-1);
	}
	
	static int recursion(String str, int l, int r) {
		cnt++;
		if(l>=r) return 1;
		else if(str.charAt(l) != str.charAt(r)) return 0;
		else return recursion(str, l+1, r-1);
	}
}
