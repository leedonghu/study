package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1085 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		int answer = solution(x, y, w, h);
		
		System.out.println(answer);
	}

	private static int solution(int x, int y, int w, int h) {
		
		int[] arr = new int[4];
		
		arr[0] = x;
		arr[1] = w-x;
		arr[2] = y;
		arr[3] = h-y;
		
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		return min;
		
	}
}
