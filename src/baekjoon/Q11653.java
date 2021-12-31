package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11653 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		if(n == 1) {
			return;
		}
		
		int[] arr = new int[n];
		
		solution(arr, n);
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != 0) {
				sb.append(arr[i]).append("\n");
			}else {
				break;
			}
		}
		
		System.out.println(sb.toString());
	}
	
	public static void solution(int[] arr, int n) {
		
		int div = n;
		int cnt = 0;
		for(int i=2; i<=n; i++) {
			if(i > div) {
				break;
			}
			while(div % i == 0) {
				div = div/i;
				arr[cnt] = i;
				cnt++;
			}
			
		}
	}
}
