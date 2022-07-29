package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q10816 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<n; i++) {
			int x = Integer.parseInt(st.nextToken());
			if(map.get(x) == null) {
				map.put(x, 1);
			}else {
				map.put(x, map.get(x) + 1);
			}
		}
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<m; i++) {
			int x = Integer.parseInt(st.nextToken());
			if(map.get(x) == null) {
				sb.append(0 + " ");
			}else {
				sb.append(map.get(x) + " ");
			}
		}
		
		System.out.println(sb);
	}
	
	
	
}

