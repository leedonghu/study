package programmers;

public class SecretMap {
	public static void main(String[] args) {
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		int n = 5;
		solution(n, arr1, arr2);
	}
	
	static String[] solution(int n, int[] arr1, int[] arr2) {
		
		String[] sol1 = new String[n];
		String[] sol2 = new String[n];
		
		for(int i=0; i<arr1.length; i++) {
			String s1 = "";
			System.out.println(" === ");
			int t = arr1[i];
			System.out.println(t);
			while(t > 0) {
				if(t%2 == 0) {
					t = t/2;
					s1 += " ";
				}else {
					t = t/2;
					s1 += "*";
				}
			}
			sol1[i] = s1;
			
		}
		
		for(int i=0; i<sol1.length; i++) {
			System.out.println(sol1[i]);
		}
		
		
		return null;
	}
}
