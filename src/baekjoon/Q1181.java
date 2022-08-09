package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Q1181 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		List<String> list =  new ArrayList<>();
		for(int i=0; i<n; i++) {
			list.add(br.readLine());
		}
		
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1.length() == o2.length()) {
					return o1.compareTo(o2);
				}else {
					return o1.length() - o2.length();
				}
				
			}
		});
		
		String y = "";
		for(String x : list) {
			if(!y.equals(x)) {
				sb.append(x).append("\n");
				
			}
			y = x;
		}
		
		System.out.println(sb);
	}
}
