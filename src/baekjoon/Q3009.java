package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q3009 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arrX = new int[3];
		int[] arrY = new int[3];
		int t = 0;
		while(t<3) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			arrX[t] = x;
			arrY[t] = y;
			t++;
		}
		
		int[] answer = solution(arrX, arrY);
		
		System.out.println(answer[0] + " " + answer[1]);
	}

	private static int[] solution(int[] arrX, int[] arrY) {
		int[] answer = new int[2];
		int cntX = 0;
		int x = 0;
		for(int i=0; i<arrX.length; i++) {
			for(int j=0; j<arrX.length; j++) {
				if(arrX[i] == arrX[j]) {
					cntX++;
				}
			}
			
			if(cntX == 1) {
				x = arrX[i];
				break;
			}else {
				cntX = 0;
			}
		}
		
		int cntY = 0;
		int y = 0;
		for(int i=0; i<arrY.length; i++) {
			for(int j=0; j<arrY.length; j++) {
				if(arrY[i] == arrY[j]) {
					cntY++;
				}
			}
			if(cntY == 1) {
				y = arrY[i];
				break;
			}else {
				cntY = 0;
			}
		}
		
		answer[0] = x;
		answer[1] = y;
		
		return answer;
	}
	
}
