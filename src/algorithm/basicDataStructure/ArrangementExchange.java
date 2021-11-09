package algorithm.basicDataStructure;

public class ArrangementExchange {
	public static void main(String[] args) {
		//역순 정렬
		//배열 길이가 홀수이면 가운데 요소는 교환할 필요 없음
		
		int[] arr = {22, 57, 11, 32, 91, 68, 70};
		int n = arr.length;
		
		for(int i=0; i<n/2; i++) {
			swap(arr, i, (n-1)-i);
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
	}
	
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t; //a[idx1]값과 a[idx2]값을 교환
		
	}
}
