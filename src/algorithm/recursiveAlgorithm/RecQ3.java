package algorithm.recursiveAlgorithm;

public class RecQ3 {
	static int gcd(int x, int y) {
		if(y == 0) {
			return x;
		}else {
			return gcd(y, x%y);
		}
	}
	
	static int gcdArray(int[] a) {
		
		for(int i=0; i<a.length -1; i++) {
			int tmp;
			if(a[i] > a[i+1]) {
				tmp = a[i];
				a[i] = a[i+1];
				a[i+1] = tmp;
			}
		}
		
		
		for(int i=0; i<a.length; i++) {
			a[i] = gcd(a[i], a[0]);
		}
		
		boolean same = true;
		for(int i=0; i<a.length -1; i++) {
			if(a[i] == a[i+1]) {
				same = true;
			}else {
				same = false;
				break;
			}
		}
		
		if(same) {
			return a[0];
		}else {
			return 1;
		}
		
		
	}
	
	public static void main(String[] args) {
		int[] a = {4,7,12,16};
		
		System.out.println("배열의 최대 공약수는 : " + gcdArray(a) + "입니다");
	}
}
