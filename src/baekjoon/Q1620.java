package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Q1620 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		String[] names = new String[n+1];
		Map<String, Integer> map = new HashMap<>();
		for(int i=1; i<=n; i++) {
			String name = br.readLine();
			map.put(name, i);
			names[i] = name;
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<k; i++) {
			String q = br.readLine();
			if(q.charAt(0)>= '1' && q.charAt(0)<='9') {
				int num = Integer.parseInt(q);
				sb.append(names[num]);
			}else {
				sb.append(map.get(q));
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
		
	}
}
