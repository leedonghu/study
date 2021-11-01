package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2775 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			int h = Integer.parseInt(br.readLine());
			int w = Integer.parseInt(br.readLine());
			
			int[][] arr = new int[15][15]; //h, w의 범위가 1~14
			for(int j=0; j<15; j++) { //1층을 1 2 3 4 5... n층의 0번을 1로 초기화
				arr[j][1] = 1;
				arr[0][j] = j;
			}
			
			for(int j=1; j<15; j++) { //1층에서 14층
				for(int k=2; k<15; k++) {//2호에서 14호
					arr[j][k] = arr[j-1][k] + arr[j][k-1];
				}
			}

			sb.append(arr[h][w]).append("\n"); //3층의 2호는 2층의 2호 + 3층의 1호


		}
		
		System.out.println(sb.toString());
	}
}
