package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2908 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		int x100 = x / 100;
		
		int x10 = (x/10) % 10;
		
		int x1 = (x % 100)%10;
		
		
		int y100 = y / 100;
		
		int y10 = (y/10) % 10;
		
		int y1 = (y % 100) %10;
		
		
		int newX = (x1 * 100) + (x10 * 10) + x100;
		
		int newY = (y1 * 100) + (y10 * 10) + y100;
		
		if(newX > newY) {
			sb.append(newX);
		}else {
			sb.append(newY);
		}
		
		System.out.println(sb.toString());
		
	}
}
