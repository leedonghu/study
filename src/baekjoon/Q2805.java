package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2805 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] tree = new int[n];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<n; i++) {
			tree[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(tree);
		
		int rc = tree[n-1];
		int lc = 0;
		int answer = 0;
		
		while(lc < rc) {
			
			int mid = (rc+lc)/2;
			
			long sum = 0;
			for(int i=0; i<n; i++) {
				if(tree[i] - mid >0) {
					sum += tree[i] - mid;
				}
			}
			
			if(sum == k) {
				answer = mid;
				break;
			}else if(sum > k) {
				lc = mid + 1;
			}else if(sum < k) {
				rc = mid -1;
			}
			
			
		}
		
		System.out.println(answer);
	}
}
