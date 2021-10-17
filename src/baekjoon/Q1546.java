package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1546 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		double score[] = new double[n];
		
		for(int i=0; i<n; i++) {
			 score[i] = Double.parseDouble(st.nextToken());
		}
		
		double max = 0;
		double sum = 0;
		for(int i=0; i<score.length; i++) {
			if(score[i] > max) {
				max = score[i];
			}
			sum += score[i];
		}
		
		sb.append(sum/max*100/n);
		System.out.println(sb.toString());
	}
}
