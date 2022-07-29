package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q10815 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<m; i++) {
			int x = binSearch(Integer.parseInt(st.nextToken()), arr);
			if(x >= 0) {
				sb.append(1 + " ");
			}else {
				sb.append(0 + " ");
			}
		}
		
		System.out.println(sb);
	}
	
	static int binSearch(int a, int[] arr) {
		int lc = 0;
		int rc = arr.length-1;
		
		while(lc <= rc) {
			int mid = (lc + rc) /2;
			
			if(arr[mid] > a) {
				rc = mid -1;
			}else if(arr[mid] < a) {
				lc = mid +1;
			}else {
				return mid;
			}
		}
		return -1;
	}
}
