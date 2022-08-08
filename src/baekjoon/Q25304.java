package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q25304 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int price = Integer.parseInt(st.nextToken());
			int count = Integer.parseInt(st.nextToken());
			sum -= price * count;
		}
		
		System.out.println(sum == 0 ? "Yes" : "No");
	}
}
