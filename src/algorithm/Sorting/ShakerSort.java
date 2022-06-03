package algorithm.Sorting;

public class ShakerSort {
	public static void main(String[] args) {
		int n = 7;
		int[] a = {1, 33, 20, 25, 34, 90, 32};
		
		shakerSort(a, n);
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
	}
	
	
	static void shakerSort(int[] a, int n) {
		int left = 0;
		int right = n-1;
		int last = right;
		while(left <right) {
			for(int i=right; i>left; i--) {
				if(a[i-1] > a[i]) {
					int tmp = a[i-1];
					a[i-1] = a[i];
					a[i] = tmp;
					last = i;
				}
			}
			System.out.println("홀");
			left = last;//다음 교환은 마지막 스왑이후까지만 하면 됨
			
			for(int i=left; i<right; i++) {
				if(a[i] > a[i+1]) {
					int tmp = a[i];
					a[i] = a[i+1];
					a[i+1] = tmp;
					last = i;
				}
			}
			System.out.println("짝");
			right = last;
		}
	}
}
