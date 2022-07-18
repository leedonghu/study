package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2660 {
	static int[][] map;
	static int n;
	static int[] answer;
	static final int INF = 10000000;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		map = new int[n+1][n+1];
		answer = new int[n+1];
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i != j) {
					map[i][j] = INF;
				}
			}
		}
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			if(x == -1 && y == -1) {
				break;
			}
			
			map[x][y] = 1;
			map[y][x] = 1;
			
		}
		for(int k=1; k<=n; k++) { //중간노드
			for(int i=1; i<=n; i++) {//시작노드
				for(int j=1; j<=n; j++) {//끝노드
					if(map[i][j] > map[i][k] + map[k][j]) {
						map[i][j] = map[i][k] + map[k][j];
//						System.out.println("map[" + i + "][" + j +"] = " + map[i][j]);
					}
				}
			}
		}
		
		int min = INF;
		for(int i=1; i<=n ;i++) {
			int status = 0;
			for(int j=1; j<=n; j++) {
				status = Math.max(status, map[i][j]);
			}
			answer[i] = status;
			min = Math.min(min, status);
		}
		
		int cnt = 0;
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=n; i++) {
			if(answer[i] == min) {
				cnt++;
				sb.append(i + " ");
			}
		}
		
		System.out.println(min + " " + cnt);
		System.out.println(sb.toString());
		
	}
	
	
}
