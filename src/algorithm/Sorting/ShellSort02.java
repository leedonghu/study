package algorithm.Sorting;

public class ShellSort02 {
	public static void main(String[] args) {
		int[] a = {22,5,11,32,120,68,70};
		int n = 7;
		shellSort(a, n);
		for(int i=0; i<n; i++) {
			System.out.println(a[i]);
		}
	}
	
	static void shellSort(int[] a, int n) {
		for(int i=n/2; i>0; i /= 2) {
			for(int j=i; j<n; j++) {
				int tmp = a[j];
				System.out.println("tmp:" +tmp);
				int k;
				for(k=j-i; k>=0 && a[k]>tmp; k -= i ) {
					
					a[k+i] = a[k];
					System.out.println("k:" + k);
				}
				
				a[k+i] = tmp;
				System.out.println(a[k+i]);
			}
		}
	}
}
