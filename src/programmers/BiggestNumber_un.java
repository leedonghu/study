package programmers;

public class BiggestNumber_un {
	public static void main(String[] args) {
		int[] numbers = {3, 30, 34, 5, 9,7,10,74};
		solution(numbers);
	}
	
	static String solution(int[] numbers) {
		String[] arr = new String[numbers.length];
//		String a = "3";
//		String b = "30";
//		System.out.println(a.compareTo(b));
//		if(a.compareTo(b) > 0) {
//			System.out.println(a);
//		}else {
//			System.out.println(b);
//		}
		for(int i=0; i<numbers.length; i++) {
			arr[i] = String.valueOf(numbers[i]);
		}
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<numbers.length-1; j++) {
				for(int k=numbers.length-1; k>j; k--) {
					System.out.println(i);
					if(arr[k-1].length()>=i+1 && arr[k].length() >= i+1) {
						if(arr[k-1].charAt(i) < arr[k].charAt(i)) {
							String tmp = arr[k-1];
							arr[k-1] = arr[k];
							arr[k] = tmp;						}
					}
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr : " + arr[i]);
		}
		
		return null;
	}
}
