package algorithm.Sorting;

public class SelectionSort02 {
	public static void main(String[] args) {
		int[] a = {22, 5, 11, 32, 120, 68, 70};
		int n = a.length;
		selectionSort(a, n);
		
		for(int i=0; i<n; i++) {
			System.out.println(a[i]);
		}
	}
	
	static void selectionSort(int[] a, int n) {
		for(int i=0; i<n-1; i++) {
			int min = i; //가장 작은 값의 인덱스
			
			for(int j=i+1; j<n; j++) {
				if(a[j] < a[min]) {
					min = j; //정렬이 되지 않은 부분에서 더 작은 값이 나오면 초기화
				}
			}
			//스왑
			int tmp = a[i];
			a[i] = a[min];
			a[min] = tmp;
		}
	}
	
	
}
