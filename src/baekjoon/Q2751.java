package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q2751 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<t; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(list);
		for(int i=0; i<list.size(); i++) {
			sb.append(list.get(i)).append("\n");
		}
		System.out.println(sb);
	}
	static void sort(int[] arr) {
		
		//shell정렬
		int n = arr.length;
		for(int h = n/2; h>0; h/=2) {
			for(int i = h; i<n; i++) {
				int j;
				int tmp = arr[i];
				for(j=i-h; j>=0 && arr[j]>tmp; j -= h) {
					arr[j+h] = arr[j]; 
				}
				arr[j+h] = tmp;
			}
		}
	}

}
