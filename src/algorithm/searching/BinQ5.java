package algorithm.searching;

public class BinQ5 {
	static int binSearchX(int[] a, int n, int key) {
		
		int pl = 0;
		int pr = a.length -1;
		
		for(int i=0; pl <= pr; i++) {
			int pc = (pl + pr) / 2;
			if(a[pc] == key) {
				
				int answer = findFirstElement(a, pc, key);
				return answer;
			}else if(a[pc] < key) {
				pl = pc + 1;
			}else {
				pr = pc -1;
			}
		}
		
		
		return -1;
	}
	
	static int findFirstElement(int[] a, int pc, int key) {
		
		int idx = pc;
		for(int i=pc; i>=0; i--) {
			if(a[i] == key) {
				idx = i;
				
			}
		}
		
		return idx;
	}
	
	public static void main(String[] args) {
		int[] a = {1,3,5,7,7,7,7,8,8,9,9};
		int n = 10;
		int key = 7;
		
		int ans = binSearchX(a, n, key);
		
		
	}
}
