package study.ch1_1;

import java.util.Scanner;

public class Code05 {
	
	public static void main(String[] args) {
		
		int [] grades;
		grades = new int[5];
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int [] grades1 = new int[n]; //배열의 크기 변수로 지정 가능
		
		grades[0]= 1;
		grades[1]= 10;
		grades[2]= 100;
		grades[3]= 99;
		grades[4]= 73;
		
		for(int i=0; i<grades.length; i++) {
			System.out.println(grades[i]);
		}
	}
}
