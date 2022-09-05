package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q11651 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int[][] arr = new int[n][2];
//		List<Check> list = new ArrayList<>();
//		for(int i=0; i<n; i++) {
//			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//			int x = Integer.parseInt(st.nextToken());
//			int y = Integer.parseInt(st.nextToken());
//			Check check = new Check(x,y);
//			list.add(check);
//		}
//		Collections.sort(list);
//		for(Check c : list) {
//			sb.append(c.x+ " " + c.y).append("\n");
//		}
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			arr[i][0] = x;
			arr[i][1] = y;
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}
				return o1[1] - o2[1];
			}

		});
		for(int i=0; i<n; i++) {
			sb.append(arr[i][0] + " " + arr[i][1]).append("\n");
		}
		System.out.println(sb);
	}
}

//class Check implements Comparable<Check>{
//	int x;
//	int y;
//	public Check(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
//	@Override
//	public int compareTo(Check o) {
//		if(this.y == o.y) {
//			return this.x - o.y;
//		}
//		return this.y - o.y;
//	}
//}
