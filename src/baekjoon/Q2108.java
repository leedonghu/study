package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2108 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		
		double sum = 0;
		for(int i=0; i<n;i++) {
			int num = Integer.parseInt(br.readLine());
			sum += num;
			
			arr[i] = num;
		}
		
		Arrays.sort(arr);
		
		int cnt = 0;
		int max = -1;
		int mod = arr[0];
		boolean check = false;
		
		for(int i=0; i<n-1; i++) {
			if(arr[i] == arr[i+1]) {
				cnt++;
			}else {
				cnt = 0;
			}
			
			if(max < cnt) { //첫번째 최빈값
				max = cnt;
				mod = arr[i];
				check = true;
			}else if(cnt == max && check == true) { //두번째 최빈값
				mod = arr[i];
				check = false;
			}
		}
		sb.append((int)Math.round(sum / n)).append("\n");
		sb.append(arr[(n-1)/2]).append("\n");
		sb.append(mod).append("\n");
		sb.append(arr[n-1] - arr[0]);
		
		System.out.println(sb);
		
	}
}
