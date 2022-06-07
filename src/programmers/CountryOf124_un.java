package programmers;

public class CountryOf124_un {
	public static void main(String[] args) {
		int n = 13;
		solution(n);
	}
	
	static String solution(int n) {
		int[] CASE  = {1, 2, 4};
		long a1 = 1;
		long a2 = 4;
		int t = 3;
		int size= 1;
		while(true) {
			a1 = a2;
			t = t*3;
			a2 = a2 +t;
			size++;
			if(n >= a1 && n < a2) {
				break;
			}
			
		}
		
		int[] arr = new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i] = 1;
		}
		
		System.out.println("a1 : " + a1);
		System.out.println("a2 : " + a2);
		System.out.println("t : " + t);
		System.out.println("size : " + size);
		
		return null;
	}
}
