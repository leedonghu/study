package algorithm.Sorting;

import algorithm.stackAndQueue.IntStack;

public class NonRecursiveQuickSort {
	public static void main(String[] args) {
		int[] a = {22,5,11,32,120,68,70};
//		int[] a = {1,8,7,4,5,2,6,3};
		int left = 0;
		int right = a.length-1;
		quickSort(a, left, right);
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	static void quickSort(int[]a, int left, int right) {
		IntStack lstack = new IntStack(right - left + 1);
		IntStack rstack = new IntStack(right - left + 1);
		
		lstack.push(left);
		rstack.push(right);
		
		while(!lstack.isEmpty()) {
			int pl = left = lstack.pop();
			int pr = right = rstack.pop();
			int x = a[(left+right) / 2];
			
			do {
				while(a[pl] < x) pl++;
				while(a[pr] > x) pr--;
				if(pl <= pr) {
					swap(a, pl++, pr--);
				}
				
			}while(pl <= pr);
			
			if(left < pr) {
				lstack.push(left);
				rstack.push(pr);
			}
			
			if(pl < right) {
				lstack.push(pl);
				rstack.push(right);
			}
		}
	}
	
	static void swap(int[] a, int pl, int pr) {
		int tmp = a[pl];
		a[pl] = a[pr];
		a[pr] = tmp;
	}
}
