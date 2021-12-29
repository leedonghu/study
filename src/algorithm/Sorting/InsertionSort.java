package algorithm.Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InsertionSort {
	
	static void insertionSort(int[] a, int n) {
		//i 가 0일때는 2번째 for문이 돌지 않음
		
		for(int i=1; i<n; i++) { //배열의 2번째 요소부터 
			int j;
			int tmp = a[i]; //정렬되지 않은 배열의 첫번째 요소
			for(j=i; j>0 && a[j-1] > tmp; j--) { //이 전 요소의 값이 선택된 요소보다 크다면
				a[j] = a[j-1]; //이전 값을 선택된 순서에 삽입 (이전 값들을 오른쪽으로 한칸씩 이동)
				               //j를 감소시키면서 조건에 맞는 동안 반복
			}
			System.out.println("j :" +j);
			a[j] = tmp; //선택된 값을 원하는 위치에 대입
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
