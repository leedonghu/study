package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Q18870 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long[] arr = new long[n];
		long[] sort = new long[n];
		
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<n; i++) {
			long a = Long.parseLong(st.nextToken());
			arr[i] = a;
			sort[i] = a;
		}
		
		Arrays.sort(sort);
		
		Map<Long, Integer> map = new HashMap<>();
		int cnt = 0;
		for(Long a : sort) {
			//정렬된 배열의 값을 꺼내서 map에 넣어줌
			//작은 값부터 넣어주면서 몇번째로 작은지(순위)를 매김
			if(!map.containsKey(a)) {
				map.put(a, cnt);
				cnt++;
			}
		}
		
		for(Long a : arr) {
			sb.append(map.get(a) + " ");
		}
		
		System.out.println(sb);
		
		
		
		
	}
}
