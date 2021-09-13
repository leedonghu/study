package study.ch1_1;

import java.util.Scanner;

public class Code03 {
	
	public static void main(String[] args) {
		
		int num = 123;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("please enter an integer: ");
		
		int input = kb.nextInt();
		
		if(input == num) {
			System.out.println("number match!");
		}else {
			System.out.println("number do not match!");
		}
		
		kb.close();
	}
}
