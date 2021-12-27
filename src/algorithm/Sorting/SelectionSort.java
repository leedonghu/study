package algorithm.Sorting;

public class SelectionSort {
	static void swap(int[]a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void selectionSort(int[] a, int n) {
		for(int i=0; i<n-1; i++) {
			int min = i;
			for(int j=i+1; j<n; j++) {
				if(a[j]< a[min]) { // i가 0일때 가장 작은 값의 index를 찾아냄
					min = j;
				}
			}
			swap(a, i, min);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {6, 4, 8, 3, 1, 9, 7};
		int nx = 7;
		selectionSort(arr, nx);
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i=0; i<nx; i++) {
			System.out.println("x[" + i + "] =" + arr[i]);
		}
	}
}
