package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q4153 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int z = Integer.parseInt(st.nextToken());
			
			if(x == 0) {
				break;
			}
			
			String answer = solution(x, y, z);
			
			sb.append(answer).append("\n");
		}
		
		System.out.println(sb.toString());
	}

	private static String solution(int x, int y, int z) {
		int[] arr = new int[3];
		
		arr[0] = x;
		arr[1] = y;
		arr[2] = z;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i; j<arr.length; j++) {
				int tmp = 0;
				if(arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		if((arr[0] * arr[0]) + (arr[1] * arr[1]) == (arr[2] * arr[2])) {
			return "right";
		}else {
			return "wrong";
		}
		
		
	}
}
