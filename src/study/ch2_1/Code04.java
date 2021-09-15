package study.ch2_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code04 {
	static Person01[] members = new Person01[100];
	static int n = 0;
	
	public static void main(String[] args) {
		
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
		
		bubbleSort(); //파라미터를 넣어줄 필요가 없는 이유는 배열과 n 이 밖에서 선언되어 있기 때문에
		for(int i=0; i<n; i++) {
			System.out.println(members[i].name+ ", " + members[i].number);
		}
}
	private static void bubbleSort() {
		for(int i=n-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				if(members[j].name.compareTo(members[j+1].name) >0) {
					Person01 person = members[j];
					members[j] = members[j+1];
					members[j+1] = person;
				}
			}
		}
		
	}
}
