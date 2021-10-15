package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q14681 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		
		if(x>0 && y >0) {
			sb.append("1");
		}else if(x>0 && y <0) {
			sb.append("4");
		}else if(x<0 && y <0) {
			sb.append("3");
		}else {
			sb.append("2");
		}
		
		System.out.println(sb.toString());
	}
}
