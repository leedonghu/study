package algorithm.Sorting;

public class Fsort {
	public static void main(String[] args) {
		int[] a = {21,25,3,4,51,6,9,2};
		int n = a.length;
		int max = a[0];
		for(int i=0; i<n; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		fSort(a, n, max);
		
		for(int i=0; i<n; i++) {
			
			System.out.println(a[i]);
		}
	}
	
	static void fSort(int[] a, int n ,int max) {
		int[] f = new int[max+1];
		int[] b = new int[n];
		
		for(int i=0; i<n; i++) f[a[i]]++; //도수분포표 만들기
		for(int i=1; i<=max; i++) f[i] += f[i-1]; //누적도수분포표 만들기
		for(int i=n-1; i>=0; i--) b[--f[a[i]]] = a[i]; //목적배열만들기
		for(int i=0; i<n; i++) a[i] = b[i]; //배열복사하기
	}
}
