package algorithm.Sorting;

public class MergeSort {
	static int[] buff;
	
	public static void main(String[] args) {
		int[] a = {21,25,3,4,51,6,9,2};
		int n = a.length;
		
		mergeSort(a, n);
		
		for(int i=0; i<n; i++) {
			
			System.out.println(a[i]);
		}
	}
	
	static void __mergeSort(int[] a, int left, int right) {
		if(left < right) {
			int i;
			int center = (left + right) / 2;
			int p = 0;
			int j = 0;
			int k = left;
			
			__mergeSort(a, left, center); //배열 앞부분 정렬
			__mergeSort(a, center+1, right); //배열 뒷부분 정렬
			
			for(i = left; i<=center; i++) {
				buff[p++] = a[i]; //배열의 앞부분을 buff에 저장
			}
			
			while(i<=right && j < p) {
				a[k++] = (buff[j] <= a[i]) ? buff[j++] : a[i++]; //buff에 저장된 값과 배열 뒤두분을 병합
			}
			
			while(j < p) {
				a[k++] = buff[j++]; //buff에 남아있는 값들 복사
			}
		}
	}
	
	static void mergeSort(int[] a, int n) {
		buff = new int[n];
		
		__mergeSort(a, 0, n-1);
		
		buff = null;
	}
}
