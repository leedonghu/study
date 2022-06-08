package algorithm.Sorting;

public class InsertionSort02 {
	public static void main(String[] args) {
		int[] a = {22, 5, 11, 32, 120, 68, 70};
		int[] a2 = {0,22, 5, 11, 32, 120, 68, 70};
		int n = a.length;
		insertionSort02(a2, a2.length);
		
		for(int i=0; i<a2.length; i++) {
			System.out.println(a2[i]);
		}
	}
	
	static void insertionSort(int[] a, int n) {
		
		for(int i=1; i<n; i++) {
			int tmp = a[i]; //타겟이 되는 값
			int j;
			for( j = i; j>0 && a[j-1] > tmp; j--) { //j는 0(배열의 맨 왼쪽 값)보다 커야하고 타겟의 왼쪽값보다 클때만 for문이 돔
				a[j] = a[j-1]; //타겟이 되는 값 왼쪽을 탐색하면서 for문이 도는동안 한칸씩 이동
			}
			a[j] = tmp; //for문이 다 돌면 해당 자리에 타겟 값을 삽입
		}
	}
	
	static void insertionSort02(int[] a, int n) {
		for (int i = 2; i < n; i++) {
			int tmp = a[0] = a[i];
			int j = i;
			for (; a[j - 1] > tmp; j--)
				a[j] = a[j - 1];
			if (j > 0)
				a[j] = tmp;
		}
	}
}
