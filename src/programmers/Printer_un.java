package programmers;

public class Printer_un {
	public static void main(String[] args) {
		int[] priorities = {1, 1, 9, 1, 1, 1};
		int location = 0;
		System.out.println(solution(priorities, location));
	}
	
	static int solution(int[] priorities, int location) {
		int[] arr = new int[priorities.length];
		int target = priorities[location];
		int k=0;
//		for(int i=0; i<priorities.length; i++) {
////			int test = priorities[i];
//			for(int j=1; j<priorities.length; j++) {
//				if(priorities[i] < priorities[j]) {
//					swap(priorities);
//					k++;
//					break;
//				}
//			}
//		}
		
		int j = 0;
		for(int i=1; i<priorities.length; i++) {
			if(priorities[j] < priorities[i]) {
				swap(priorities);
				k++;
			}
		}
		
		
		for(int i=0; i<priorities.length; i++) {
			System.out.println(priorities[i]);
		}
		System.out.println("k:" + k);
		return (priorities.length-location)-k+1;
	}
	
	static void swap(int[] a) {
		int first = a[0];
		for(int i=1; i<a.length; i++) {
			a[i-1] = a[i];
		}
		
		a[a.length-1] = first;
	}
}
