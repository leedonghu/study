package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2920 {
	public static void main(String[] args) throws IOException {
		int[] asc = {1,2,3,4,5,6,7,8,};
		int[] des = {8,7,6,5,4,3,2,1,};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		boolean ascCheck = false;
		boolean desCheck = false;
		for(int i=0; i<8; i++) {
			int check = Integer.parseInt(st.nextToken());
			if(asc[i] != check) {
				ascCheck = true;
			}
			if(des[i] != check) {
				desCheck = true;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		if(ascCheck && desCheck) {
			sb.append("mixed");
		}else if(ascCheck && !desCheck) {
			sb.append("descending");
		}else {
			sb.append("ascending");
		}
		
		System.out.println(sb);
		
	}
}
