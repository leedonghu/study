package programmers;

public class Personalities {
	public static void main(String[] args) {
		String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
		int[] choices = {5,3,2,7,5};
		String answer = solution(survey, choices);
		System.out.println(answer);
	}
	
	static String solution(String[] survey, int[] choices) {
		char[][] arr = {{'R','T'},{'C','F'},{'J','M'},{'A','N'}};
		int[][] check = new int[4][2];
		int[] point = {0,3,2,1,0,1,2,3};
		for(int i=0; i<survey.length; i++) {
			if(choices[i] < 4) {
				char a = survey[i].charAt(0);
				for(int j=0; j<arr.length; j++) {
					for(int k=0; k<arr[0].length; k++) {
						if(a == arr[j][k]) {
							check[j][k] += point[choices[i]];
							break;
						}
					}
				}
				
			}else{
				char a = survey[i].charAt(1);
				for(int j=0; j<arr.length; j++) {
					for(int k=0; k<arr[0].length; k++) {
						if(a == arr[j][k]) {
							check[j][k] += point[choices[i]];
							break;
						}
					}
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<check.length; i++) {
			int a = check[i][0];
			int b = check[i][1];
			if(a>b) {
				sb.append(arr[i][0]);
			}else if(a<b) {
				sb.append(arr[i][1]);
			}else {
				sb.append(arr[i][0] > arr[i][1] ? arr[i][1] : arr[i][0]);
			}
		}
		return sb.toString();
	}
}
