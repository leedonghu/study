package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1005 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = 0;
		int t = Integer.parseInt(br.readLine());
		while(n<t) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int buildingNumber = Integer.parseInt(st.nextToken());
			int buildingRule = Integer.parseInt(st.nextToken());
			
			
			int[] buildTime = new int[buildingNumber];
			for(int i=0; i<buildingNumber; i++) {
				buildTime[i] = Integer.parseInt(st.nextToken());
			}
			
			int[][] buildingOrder = new int[buildingRule][2];
			int m = 0;
			while(m<buildingRule) {
				int b1 = Integer.parseInt(st.nextToken());
				int b2 = Integer.parseInt(st.nextToken());
				buildingOrder[m][0] = b1;
				buildingOrder[m][1] = b2;
				m++;
			}
			m = 0;
			int victoryBuilding = Integer.parseInt(st.nextToken());
			sb.append(lowestBuildTime(buildTime, buildingOrder, victoryBuilding)).append("\n");
			n++;
		}
		System.out.println(sb);
	}

	public static int lowestBuildTime(int[] buildTime, int[][] buildingOrder, int victoryBuilding) {
		
		return 0;
	}
}
