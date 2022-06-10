package algorithm.Sorting;

public class MergeArray {
	public static void main(String[] args) {
		int[] a = {2,4,6,8,11,13};
		int[] b = {1,2,3,4,5,6,9,21};
		int[] c = new int[a.length+b.length];
		
		merge(a, a.length, b, b.length, c);
		
		for(int i=0; i<c.length; i++) {
			System.out.println(c[i]);
		}
	}
	
	static void merge(int[] a, int na, int[] b, int nb, int[] c) {
		int pa = 0;
		int pb = 0;
		int pc = 0;
		
		while(pa < na && pb < nb) { //작은 값부터 c배열에 넣음
			c[pc++] = (a[pa] <= b[pb]) ? a[pa++] : b[pb++];
		}
		
		while(pa < na) { //a배열에 남은 값들 c배열에 넣음
			c[pc++] = a[pa++];
		}
		
		while(pb < nb) { //b배열에 남은 값들 c 배열에 넣음
			c[pc++] = b[pb++];
		}
	}
}
