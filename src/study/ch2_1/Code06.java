package study.ch2_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code06 {
//	static String[] names = new String[1000];
//	static int[] numbers = new int[1000];
	
	static Person01[] members = new Person01[100];
	static int n = 0;
	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(new File("input.txt"));
			
			while(sc.hasNext()) {
				String nm = sc.next();
				String nb = sc.next();
				
				members[n] = new Person01();
				members[n].name = nm;
				members[n].number = nb; //Exception in thread "main" java.util.InputMismatchException 발생, int의 범위를 넘어서는 숫자 존해하기 때문
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
			System.out.print(i+ " name: " + members[i].name + ", number: " + members[i].number);
		}
	}
	
	static public void bubbleSort() {
		
		for(int i=n-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				if(members[j].name.compareTo(members[j+1].name) >0) { //사전식 순서 비교
					Person01 tmp = members[j];
					members[j] = members[j+1];
					members[j+1] = tmp;
					
				}
			}
		}
	}
}
