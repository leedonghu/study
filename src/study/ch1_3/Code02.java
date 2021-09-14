package study.ch1_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code02 {
	
	static String[] names = new String[1000];
	static int[] numbers = new int[1000];
	static int n = 0;
	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(new File("input.txt"));
			
			while(sc.hasNext()) {
				names[n] = sc.next();
				numbers[n] = sc.nextInt(); //Exception in thread "main" java.util.InputMismatchException 발생, int의 범위를 넘어서는 숫자 존해하기 때문
				n++;
			}
			
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(1);
		}
		
		bubbleSort();
		
		for(int i=0; i<n; i++) {
			System.out.print(i+ " name: " + names[i] + ", number: " + numbers[i]);
		}
	}
	
	static public void bubbleSort() {
		
		for(int i=n-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				if(names[j].compareTo(names[j+1]) >0) {
					String tmpstr = names[j];
					names[j] = names[j+1];
					names[j+1] = tmpstr;
					
					int tmp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = tmp;
					
				}
			}
		}
	}
}
