package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2941 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		
		System.out.println(sb.append(solution(str)));
	}
	
	public static int solution(String str) {
		String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=","z="};
		
		
		String change = str.replace("c=", "1")
				            .replace("c-", "1")
				            .replace("dz=", "1")
				            .replace("d-", "1")
				            .replace("lj", "1")
				            .replace("nj", "1")
				            .replace("s=", "1")
				            .replace("z=", "1");
		
		
		int length = change.length();
		return length;
	}
}
