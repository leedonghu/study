package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1002 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = 0;
		System.out.println("$ ");
		int t = Integer.parseInt(br.readLine());
		
		while(n<t) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			sb.append(countMeetingPoint(x1, y1, r1, x2, y2, r2)).append("\n");
			n++;
		}
		System.out.println(sb);
		
		
	}

	public static int countMeetingPoint(int x1, int y1, int r1, int x2, int y2, int r2) {
		int d1 = (int)(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
		
		if(x1==x2 && y1==y2 && r1==r2) {
			return -1;
		}else if(d1 > Math.pow(r1+r2, 2)) {
			return 0;
		}else if(d1 < Math.pow(r2-r1, 2)) {
			return 0;
		}else if(d1 == Math.pow(r1+r2, 2)) { //외접
			return 1;
		}else if(d1 == Math.pow(r2-r1, 2)) { //내접
			return 1;
		}else {
			return 2;
		}
	
	}
}
