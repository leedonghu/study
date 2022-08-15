package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Q1764 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		List<String> list = new ArrayList<>();
		Map<String, Integer> map = new HashMap<>();
		
		int x = 0;
		for(int i=0; i<n+k; i++) {
			String str = br.readLine();
			if(map.containsKey(str)) {
				map.put(str, map.get(str)+1);
				list.add(str);
				x++;
			}else {
				map.put(str, 1);
			}
		}
		
		sb.append(x).append("\n");
		Collections.sort(list);
		for(String str : list) {
			sb.append(str).append("\n");
		}
		
		System.out.println(sb);
	}
}
