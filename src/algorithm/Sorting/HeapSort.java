package algorithm.Sorting;

public class HeapSort {
	public static void main(String[] args) {
		int[] a = {21,25,3,4,51,6,9,2};
		int n = a.length;
		
		heapSort(a, n);
		
		for(int i=0; i<n; i++) {
			
			System.out.println(a[i]);
		}
	}
	
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void downHeap(int[] a, int left, int right) { //힙으로 만들기
		int tmp = a[left]; //루트
		int child;         //큰 값을 가진 노드
		int parent;        //부모
		
		for(parent = left; parent < (right+1)/2; parent = child) {
			int cl = parent * 2 +1; //왼쪽자식
			int cr = cl +1;         //오른쪽 자식
			child = (cr <= right && a[cr] > a[cl]) ? cr: cl; //큰 값을 가진 노드를 자식에 대입
			if(tmp >= a[child]) {
				break;
			}
			a[parent] = a[child];
		}
		a[parent] = tmp;
	}
	
	static void heapSort(int[] a, int n) {
		for(int i=(n-1)/2; i>=0; i--) { //a[i]~a[n-1]를 힙으로 만들기
			downHeap(a, i, n-1);
		}
		
		for(int i=n-1; i>0; i--) {
			swap(a,0,i); //가장 큰 요소와 아직 정렬되지 않은 부분의 마지막 요소를 교환
			downHeap(a, 0, i-1); //a[0]~a[i-1]을 힙으로 만들기
		}
	}
}
