package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Q4344 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int t = 0;
		
		while(t<n) {

			String[] test = br.readLine().split(" ");
			double sum = 0;
			double count = 0;
			for(int i=1; i<test.length; i++) {
				sum += Double.parseDouble(test[i]);
			}
			double avg = sum / (test.length -1);
			
			for(int i=1; i<test.length; i++) {
				if(Integer.parseInt(test[i]) > avg) {
					count++;
				}
			}
			sb.append(String.format("%.3f", count / (test.length-1) * 100 )).append("%").append("\n");
			t++;
		}
		
		System.out.println(sb.toString());
	}
}
