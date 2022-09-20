package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Q11004 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		List<Double> list = new ArrayList<>();
		for(int i=0; i<n; i++) {
			double a = Double.parseDouble(st.nextToken());
			list.add(a);
		}
		
		Collections.sort(list);
		
		double answer = 0;
		int t = 0;
		for(double a : list) {
			if(t == k) {
				break;
			}
			answer = a;
			t++;
		}
		
		System.out.println((int)answer);
	}
}
