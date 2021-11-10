package algorithm.basicDataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiDimensionalArray {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int retry;
		
		System.out.println("그 해 경과 일수를 구합니다.");
		
		do {
			System.out.print("년 : "); int year = Integer.parseInt(br.readLine());
			System.out.print("월 : "); int month = Integer.parseInt(br.readLine());
			System.out.print("일 : "); int day = Integer.parseInt(br.readLine());
			
			System.out.printf("그 해 %d일째입니다.\n", dayOfYear(year, month, day));
			System.out.printf("그 해 %d일 남았습니다.\n", leftDayOfYear(year, month, day));
			
			System.out.println("한번 더 할까요? (1.예/2.아니요) : ");
			retry = Integer.parseInt(br.readLine());
		}while(retry == 1);
	}
	//평년과 윤년의 일수
	static int[][] mdays = {{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			                {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
	};
	
	static int isLeap(int year) { //윤년이면 1 평년이면 0
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1: 0;
	}
	
	static int dayOfYear(int y, int m, int d) {
		int days = d;
		
		for(int i=1; i<m; i++) {
			days += mdays[isLeap(y)][i-1]; //평년 or 윤년의 월들의 일 수를 다 더함
		}
		return days;
	}
	
	static int leftDayOfYear(int y, int m, int d) {

		
		return (isLeap(y) == 1)? 366 - dayOfYear(y, m, d): 365 - dayOfYear(y, m ,d);
	}
	
	
}
