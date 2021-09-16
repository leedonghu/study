package study.ch2_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import study.ch2_2.MyPoint;
import study.ch2_2.MyRectangle;

public class Code03 {
	static MyRectangle[] rects;
	static int n = 0;
	
	//n개의 직사각형에 과한 데이터를 입력받은 후 면적이 작은 것부터 출력
	// 0 1 2 4 -> 왼쪽 위쪽 꼭지점 좌표가 (0,1)이고 너비가 2, 높이가 4
	
	public static void main(String[] args) {
		rects = new MyRectangle[100];
		try {
			Scanner sc = new Scanner(new File("data.txt"));
			while(sc.hasNext()) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				int w = sc.nextInt();
				int h = sc.nextInt();
				
				rects[n] = new MyRectangle(x, y, w, h);

				n++;
 			}
			
			sc.close();
			
			bubbleSort();
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
			System.exit(1);;
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(rects[i].toString() );
		}
	}

	private static void bubbleSort() {
		for(int i=n-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				if(rects[j].calcArea()> rects[j+1].calcArea()) {
					MyRectangle tmp = rects[j];
					rects[j] = rects[j+1];
					rects[j+1] = tmp;
				}
			}
		}
		
	}


}
