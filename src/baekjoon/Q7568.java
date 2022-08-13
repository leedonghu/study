package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q7568 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int[][] physic = new int[n][2];
		int[] answer = new int[n];
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int weight = Integer.parseInt(st.nextToken());
			int height = Integer.parseInt(st.nextToken());
			physic[i][0] = weight;
			physic[i][1] = height;
		}
		
		for(int i=0; i<physic.length; i++) {
			int cnt = 0;
			for(int j=0; j<physic.length; j++) {
				if(physic[i][0] < physic[j][0] && physic[i][1] < physic[j][1]) {
					cnt++;
				}
			}
			answer[i] = cnt+1;
		}
		
		for(int i=0; i<answer.length; i++) {
			sb.append(answer[i] + " ");
		}
		
		System.out.println(sb);
	}
}
