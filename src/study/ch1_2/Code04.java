package study.ch1_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code04 {
	
	public static void main(String[] args) {
		
		//file 사용
		String fileName = "input.txt";
		Scanner inFile;
		
		String[] name = new String[1000];
		String[] number = new String[1000];
		int n = 0;
		
		try {
			inFile = new Scanner(new File(fileName));
			
			while(inFile.hasNext()) { //file의 크기를 모르기 때문에 while문 사용
				name[n] = inFile.next();
				number[n] = inFile.next();
				n++;
			}
			
			inFile.close();

			for(int i=0; i<n; i++) {
				System.out.print(name[i]+" ");
				System.out.println(number[i]);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
