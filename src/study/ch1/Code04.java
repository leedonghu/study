package study.ch1;

import java.util.Scanner;

public class Code04 {
	
	public static void main(String[] args) {
		
		String str = "hello";
		String input = null;
		
		Scanner kb = new Scanner(System.in); //system.in 은 키보드를 의미
		
		System.out.println("please enter string: ");
		
		input = kb.next();
		
		if(str.equals(input)) {
			System.out.println("string match!");
		}else {
			System.out.println("string do not match!");
		}
		
		kb.close();
	}
}
