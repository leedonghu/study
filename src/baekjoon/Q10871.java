package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10871 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
		StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st1.nextToken()); 
		int X = Integer.parseInt(st1.nextToken());
		
		for(int i=0; i<N; i++) {
			int A = Integer.parseInt(st2.nextToken()); //새로운 토큰만들고 for문안에서 다음 토튼을 불러옴
			if(A < X) {
				sb.append(A).append(" ");
			}
		}
		
		System.out.println(sb.toString());
	}
}
