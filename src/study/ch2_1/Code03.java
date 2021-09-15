package study.ch2_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code03 {
	
	static Person01[] members;
	static int n = 0;
	
	public static void main(String[] args) {
		members = new Person01[100];
		try {
			Scanner file = new Scanner(new File("input.txt"));
			while(file.hasNext()) {
				String name = file.next();
				String number = file.next();
				
				members[n] = new Person01(); //객체를 선언하고 배열에 넣어야함, 배열의 각 칸은 Person01타입
				members[n].name = name;
				members[n].number = number;
				
				n++;
			}
			file.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(members[i].name+ ", " + members[i].number);
		}
	}
}
