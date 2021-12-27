package algorithm.Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InsertionSort {
	
	static void insertionSort(int[] a, int n) {
		//i 가 0일때는 2번째 for문이 돌지 않음
		
		for(int i=0; i<n; i++) {
			int j;
			int tmp = a[i];
			for(j=i; j>0 && a[j-1] > tmp; j--) {
				a[j] = a[j-1];
			}
			a[j] = tmp;
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("단순 삽입 정렬");
		System.out.print("요솟수 : ");
		int nx = Integer.parseInt(br.readLine());
		int[] x = new int[nx];
		
		for(int i=0; i<nx; i++) {
			System.out.print("x[" + i + "] :");
			x[i] = Integer.parseInt(br.readLine());
		}
		
		insertionSort(x, nx);
		
		System.out.println("오름차순으로 정렬했습니다");
		for(int i=0; i<nx; i++) {
			System.out.println("x[" + i + "] =" + x[i]);
		}
	}
}
