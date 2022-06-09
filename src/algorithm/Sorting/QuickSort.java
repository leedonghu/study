package algorithm.Sorting;

public class QuickSort {
	public static void main(String[] args) {
		int[] a = {22,5,11,32,120,68,70};
//		int[] a = {1,8,7,4,5,2,6,3};
		int left = 0;
		int right = a.length-1;
		quickSort(a, left, right);
	}
	
	static void quickSort(int[] a, int left, int right) {
		int pl = left;
		int pr = right;
		int x = a[(pl+pr)/2];
		System.out.println(x);
		do {
			while(a[pl] < x) pl++;
			while(a[pr] > x) pr--;
			if(pl <= pr) {
				System.out.println(pl);
				System.out.println(pr);
				swap(a, pl++, pr--);
				System.out.println("swap");
			}
			
		}while(pl<=pr);
		
		if(left < pr) quickSort(a, left, pr);
		if(right > pl) quickSort(a, pl, right);
		
		System.out.println("피벗 이하의 그룹");
		for(int i=0; i<pl-1; i++) {
			System.out.println(a[i]);
		}
		System.out.println();
		
		System.out.println("피벗 이상의 그룹");
		for(int i=pr+1; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
	}
	
	static void swap(int[] a, int pl, int pr) {
		int tmp = a[pl];
		a[pl] = a[pr];
		a[pr] = tmp;
	}
}
