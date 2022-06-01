package programmers;

public class SecretMap {
	public static void main(String[] args) {
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		int n = 5;
		solution(n, arr1, arr2);
	}
	
	static String[] solution(int n, int[] arr1, int[] arr2) {
		
		int[][] sol1 = new int[n][n];
		int[][] sol2 = new int[n][n];
		String[] answer = new String[n];
		for(int i=0; i<arr1.length; i++) {
			int k = arr1[i];
			int f = arr2[i];
			for(int j=0; j<arr1.length; j++) {
				if(k%2 == 0) {
					k = k/2;
					sol1[i][j]= 0;
				}else {
					k = k/2;
					sol1[i][j] = 1;
				}
				
				if(f%2 == 0) {
					f = f/2;
					sol2[i][j] = 0;
					
				}else {
					f = f/2;
					sol2[i][j] = 1;
				}
			}
		}
		for(int i =0; i<sol1.length; i++) {
			for(int j =0; j<sol1[0].length/2; j++) {
				int tmp1 = sol1[i][j];
				sol1[i][j] = sol1[i][sol1.length-1-j];
				sol1[i][sol1.length-1-j] = tmp1;
				
				int tmp2 = sol2[i][j];
				sol2[i][j] = sol2[i][sol2.length-1-j];
				sol2[i][sol2.length-1-j] = tmp2;
			}
		}
		
		
		for(int i=0; i<sol1.length; i++) {
			String s = "";
			for(int j=0; j<sol1.length; j++) {
				if(sol1[i][j] == 0 && sol2[i][j] == 0) {
					s += " ";
				}else  {
					s += "#";
				}
			}
			answer[i] = s;
		}
		
//		for(int i =0; i<sol1.length; i++) {
//			for(int j =0; j<sol1[0].length; j++) {
//				System.out.println("sol1[" + i +"][" +j +"] = " +sol1[i][j]);
//				
//			}
//		}
//		System.out.println("================");
//		for(int i =0; i<sol1.length; i++) {
//			for(int j =0; j<sol1[0].length; j++) {
//				
//				System.out.println("sol2[" + i +"][" +j +"] = " +sol2[i][j]);
//			}
//		}
		
//		for(int i=0 ; i<answer.length; i++) {
//			System.out.println(answer[i]);
//		}
		return answer;
	}
}
