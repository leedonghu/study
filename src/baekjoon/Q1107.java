package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1107 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int target = Integer.parseInt(br.readLine());
		
		int[] broke = new int[10];
		
		int n = Integer.parseInt(br.readLine());
		if(n != 0) {
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			for(int i=0; i<n; i++) {
				broke[Integer.parseInt(st.nextToken())] = 1;
			}
		}
		
		int result = Math.abs(target - 100);
		for(int i=0; i<=999999; i++) {
			String str = String.valueOf(i);
			int len = str.length();
			
			boolean isBroken = false;
			for(int j=0; j<len; j++) {
				if(broke[str.charAt(j)-'0'] == 1) {
					isBroken = true;
					break;
				}
			}
			if(!isBroken) {
				int min = Math.abs(target-i)+len;
				result = Math.min(result, min);
			}
		}
		System.out.println(result);
	}
}
