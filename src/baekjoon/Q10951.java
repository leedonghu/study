package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10951 {
	//EOF end of file
	//더이상 읽을 수 있는 데이터가 존재하지 않을때 반복문 종료
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str;
		while((str = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(str, " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			sb.append(a+b).append("\n");
			
		}
		System.out.println(sb.toString());
	}
}
