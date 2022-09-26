package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q25629 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n+1];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=1; i<=n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int[] odd = new int[(n/2)+1];
		int[] even = new int[(n/2)+1];
		
		int a = 0;
		int b = 0;
		
		try {
			
			for(int i=1; i<=n; i++) {
				int x = arr[i];
				if(x%2==0) {
					even[b++] = x;
				}else {
					odd[a++] = x;
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(0);
			return;
		}
		System.out.println(1);
		
//		for(int i=0; i<=n/2; i++) {
//			if(odd[i] == 0) {
//				System.out.println(0);
//				return;
//			}else if(i != n/2 && even[i] == 0) {
//				System.out.println(0);
//				return;
//			}
//		}
	}
}
