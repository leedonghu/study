package algorithm.searching;

public class BinQ3 {
	
	public static int solution(int[] a, int n, int key, int[] idx) {
		
		int cnt = 0;
		for(int i=0; i<a.length; i++) {
			if(a[i] == key) {
				idx[cnt] = i;
				cnt++;
				
			}
		}
		
		for(int i = 0; i<cnt; i++) {
			System.out.println("idx[ " + i + " ] = " + idx[i]);
		}
		
		return cnt;
	}
	
	public static void main(String[] args) {
		int[] a = {1, 9, 2, 9, 4, 6, 7, 9};
		int n = 8;
		int key = 9;
		int[] idx = new int[n];
		
		int answer = solution(a, n, key, idx);
		System.out.println(answer);
	}
}
