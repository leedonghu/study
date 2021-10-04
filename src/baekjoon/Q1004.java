package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1004 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = 0;
		
		int t = Integer.parseInt(br.readLine());
		while(n<t) {
			StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
			
			int x1 = Integer.parseInt(st1.nextToken());
			int y1 = Integer.parseInt(st1.nextToken());
			
			int x2 = Integer.parseInt(st1.nextToken());
			int y2 = Integer.parseInt(st1.nextToken());
			
			int m = 0;
			int p = Integer.parseInt(br.readLine());
			int[][] planet = new int[p][3];
			
			while(m < p) {
				StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
				int c1 = Integer.parseInt(st2.nextToken());
				int c2 = Integer.parseInt(st2.nextToken());
				int r = Integer.parseInt(st2.nextToken());
				planet[m][0] = c1;
				planet[m][1] = c2;
				planet[m][2] = r;
				m++;
			}
			m = 0;
			sb.append(countMeetingPoint(x1,y1,x2,y2,planet)).append("\n");
			
			n++;
		}
		System.out.println(sb);
		
		
	}

	private static int countMeetingPoint(int x1, int y1, int x2, int y2, int[][] planet) {
		int count = 0;
		for(int i=0; i<planet.length; i++) {
			
				if((Math.pow(x1-planet[i][0], 2) + Math.pow(y1-planet[i][1], 2))< Math.pow(planet[i][2], 2) 
						&& (Math.pow(x2-planet[i][0], 2) + Math.pow(y2-planet[i][1], 2))< Math.pow(planet[i][2], 2)) {
					
					
				}else if((Math.pow(x1-planet[i][0], 2) + Math.pow(y1-planet[i][1], 2))> Math.pow(planet[i][2], 2) 
						&&(Math.pow(x2-planet[i][0], 2) + Math.pow(y2-planet[i][1], 2))> Math.pow(planet[i][2], 2)) {
					
					
				}else if(Math.pow(x1-planet[i][0], 2)+Math.pow(y1-planet[i][1], 2) < Math.pow(planet[i][2], 2) 
						|| Math.pow(x2-planet[i][0], 2)+Math.pow(y2-planet[i][1], 2) < Math.pow(planet[i][2], 2)){
					
					count++;
					
				}else {
					
					
				}
			
		}
		return count;
	}
	

}
