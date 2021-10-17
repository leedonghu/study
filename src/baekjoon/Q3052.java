package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Q3052 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		List<Integer> list = new ArrayList<>();
		int[] arr = new int[10];
		
		for(int i=0; i<10; i++) {
			arr[i] = Integer.parseInt(br.readLine()) % 42;
			if(list.indexOf(arr[i]) == -1) {
				list.add(arr[i]);
			}
		}
		
		System.out.println(list.size());

	}
}
