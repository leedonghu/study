package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2798 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr= new int[n];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		//합
		int sum = 0;
		//근사치
		int tmp = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				for(int k=j+1; k<n; k++) {
					sum = arr[i] + arr[j] + arr[k];
					
					if(sum == m) {
						System.out.println(sum);
						return;
					}
					
					//근사치가 합보다 작으면서 합은 타겟보다 작으면
					//근사치 값을 변화
					if(tmp < sum  && sum <= m ) {
						tmp = sum;
					}
				}
			}
		}
		
		System.out.println(tmp);
	}
}
