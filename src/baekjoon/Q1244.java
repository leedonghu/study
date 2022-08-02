package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1244 {
//	static Queue<Human> q;
	static int[] arr;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
//		q = new LinkedList<>();
		int m = Integer.parseInt(br.readLine());
		for(int i =0; i<m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
//			Human human = new Human(a, b);
//			q.add(human);
			if(a == 1) {
				for(int j=b-1; j<arr.length; j += b) {
					arr[j] = arr[j] == 1 ? 0 : 1;
				}
			}else {
				arr[b-1] = arr[b-1] == 1 ? 0 : 1;
				int lc = b-2;
				int rc = b;
				while(lc>=0 && rc < arr.length) {
					if(arr[lc] != arr[rc]) {
						break;
					}else {
						arr[lc] = arr[lc] == 1 ? 0 : 1;
						arr[rc] = arr[rc] == 1 ? 0 : 1;
						lc = lc-1;
						rc = rc+1;
					}
				}
			}
		}
		StringBuilder sb = new StringBuilder();
//		turnOnOff();
		for(int i=0; i<arr.length; i++) {
			sb.append(arr[i] + " ");
			if((i+1) % 20 == 0) {
				sb.append("\n");
			}
		}
		
		System.out.println(sb);
		
	}
}
	
//	static void turnOnOff() {
//		while(!q.isEmpty()){
//			Human human = q.poll();
//			if(human.sex == 1) {
//				for(int i=human.num-1; i<arr.length; i += human.num) {
//					if(arr[i]== 1) {
//						arr[i] = 0;
//					}else {
//						arr[i] = 1;
//					}
//				}
//			}else {
//				if(arr[human.num-1] == 1) {
//					arr[human.num-1] = 0;
//				}else {
//					arr[human.num-1] = 1;
//				}
//				int lc = human.num-2;
//				int rc = human.num;
//				while(lc>=0 && rc<arr.length) {
//					if(arr[lc] == arr[rc]) {
//						if(arr[lc] == 1) {
//							arr[lc] = arr[rc] = 0;
//						}else {
//							arr[lc] = arr[rc] = 1;
//						}
//						lc = lc-1;
//						rc = rc+1;
//					}
//				}
//			}
//		}
//	}
//}
//class Human{
//	int sex;
//	int num;
//	
//	Human(int sex, int num){
//		this.sex = sex;
//		this.num = num;
//	}
//}