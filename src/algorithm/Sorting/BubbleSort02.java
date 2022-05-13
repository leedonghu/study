package algorithm.Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BubbleSort02 {
	static void swap(int[]a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void bubbleSort(int[]a, int n) {
		int cnt = 0;
		for(int i=n-1; i>0; i--) { //패스 횟수
			for(int j=0; j<i; j++) { //배열의 오른쪽 끝부터 비교 교환
				if(a[j] > a[j+1]) {
					swap(a, j, j+1);
				}
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

		
		int nx = 7;
		int[] x = {1, 33, 20, 25, 34, 90, 32};
		bubbleSort(x, nx);

		
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i=0; i<nx; i++) {
			System.out.println("x[" + i + "] =" + x[i]);
		}
	}
}
