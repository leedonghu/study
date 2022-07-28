package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Q10989 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		int[] arr = new int[a];
		int max = Integer.MIN_VALUE;
		for(int i=0; i<a; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		int[] counting = new int[max+1];
		int[] sum = new int[max+1];
		int[] ans = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			counting[arr[i]]++;
			sum[arr[i]]++;
		}
		
		for(int i=1; i<sum.length; i++) {
			sum[i] += sum[i-1];
		}
		
		for(int i=ans.length-1; i>=0; i--) {
			int value = arr[i];
			counting[value]--;
			sum[value]--;
			ans[sum[value]] = value;
		}
		
		for(int i=0; i<ans.length; i++) {
			sb.append(ans[i]).append("\n");
		}
		
		System.out.println(sb);
			
	}
}
