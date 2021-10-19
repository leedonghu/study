package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q8958 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) { //받는 ox문자열만큼 반복
			String ox = br.readLine();
			
			int point = 1; //얻는 포인트
			int sum = 0; //총 합
			int[] score = new int[ox.length()];//얻는 점수 배열
			
			for(int j=0; j<ox.length(); j++) {
				if(ox.substring(j, j+1).equals("O")) { //o일때 배열에 점수 넣어주고 +1해줌, 다음에도 o면 그 점수를 배열에 추가
					score[j] = point;
					point++;
					
				}else { //x일때 배열에 0을 넣어주고 점수를 1로 초기화
					
					score[j] = 0;
					point = 1;
				}
				
				sum += score[j];
				
			}
			sb.append(sum).append("\n");
		}
		
		System.out.println(sb.toString());
	}
}
