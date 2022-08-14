package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1654 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int k = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[k];
		long max = 0;
		for(int i=0; i<k; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		long min = 1;
		long mid = 0;
		
		while(max >= min) {
			mid = (max+min)/2;
			
			long cnt = 0;
			for(int i=0; i<arr.length; i++) {
				cnt += arr[i] / mid;
			}
			
			if(cnt >= n) {
				min = mid + 1;
			}else {
				max = mid -1;
			}
		}
		
		System.out.println(max);
	}
}
