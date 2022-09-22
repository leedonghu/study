package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1009 {
	static int[] two = {6,2,4,8};
	static int[] three = {1,3,9,7};
	static int[] four = {6,4};
	static int[] seven = {1,7,9,3};
	static int[] eight = {6,8,4,2};
	static int[] nine = {1,9};
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			
			switch(a%10) {
				case 1: sb.append(1).append("\n");
						break;
				case 2: int c = b%4;
						sb.append(two[c]).append("\n");
						break;
				case 3: int d = b%4;
						sb.append(three[d]).append("\n");
						break;
				case 4: int e = b%2;
						sb.append(four[e]).append("\n");
						break;
				case 5: sb.append(5).append("\n");
						break;
				case 6: sb.append(6).append("\n");
						break;
				case 7: int f = b%4;
						sb.append(seven[f]).append("\n");
						break;
				case 8: int g = b%4;
						sb.append(eight[g]).append("\n");
						break;
				case 9: int h = b%2;
						sb.append(nine[h]).append("\n");
						break;
				case 0: sb.append(10).append("\n");
						break;
				
			}
			
			
		}
		
		System.out.println(sb);
	}
}
