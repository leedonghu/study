package algorithm.Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BubbleSort {
	
	static void swap(int[]a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void bubbleSort(int[]a, int n) {
		for(int i=0; i<n-1; i++) { //패스 횟수
			for(int j=n-1; j>i; j--) { //배열의 오른쪽 끝부터 비교 교환
				if(a[j-1] > a[j]) {
					swap(a, j-1, j);
				}
			}
		}
	}
	
	static void bubbleLeftSort(int[]a, int n) {
		for(int i=n-1; i>0; i--) {
			for(int j=0; j<i; j++) { //왼쪽에서 오른쪽으로 스캔
				if(a[j] > a[j+1]) {
					swap(a, j, j+1);
				}
			}
		}
	}
	

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("버블 정렬(버전1)");
		System.out.print("요솟수 : ");
		int nx = Integer.parseInt(br.readLine());
		int[] x = new int[nx];
		
		for(int i=0; i<nx; i++) {
			System.out.print("x[" + i + "] :");
			x[i] = Integer.parseInt(br.readLine());
		}
		
		bubbleLeftSort(x, nx);
//		bubbleSort(x, nx);
		
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i=0; i<nx; i++) {
			System.out.println("x[" + i + "] =" + x[i]);
		}
	}
}
