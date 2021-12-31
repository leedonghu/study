package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2581 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n-m+1];
		
		solution(arr, m, n);
		int sum = 0;
		int min = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
			
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != 0 && arr[i] != 1) {
				min = arr[i];
				break;
			}
		}
		

		
		if(sum == 0) {
			sb.append(-1);
		}else {
			sb.append(sum).append("\n").append(min);
		}
		
		System.out.println(sb.toString());
		
		br.close();
		
	}
	
	public static void solution(int[] arr, int m, int n) {
		
		int cnt = 0;
		for(int i=m; i<=n; i++) {
			boolean check = true;
			if(i == 1) {
				continue;
			}
			for(int j=2; j*j <= i; j++) {
				if(i%j == 0) {
					check = false;
					break;
				}
			}
			if(check == true) {
				
					
				arr[cnt] = i;
					
				cnt++;
				
			}
		}
	}
}
