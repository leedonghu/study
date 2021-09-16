package study.ch2_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code04 {
	//입력으로 직교 다각형이 주어지고 
	//점 p가 하나 주어질때, 이 점 p가 다각형 내부에 있는지 외부에 있는지 판단하는 프로그램
	//꼭지점 갯수 입력 -> x y좌표 입력 -> p점 좌표 입력
	//알고리즘 p의 한점에서 무한한 수평선을 하나 그었을때 다각형과 몇번 교차하는지 확인
	//짝수면 외부 홀수면 내부
	//그은 선과 다각형이 겹치는 문제 발생
	
	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(new File("data.txt"));
			int n = in.nextInt();
			OrthoPolygon thePolygon = new OrthoPolygon(n);
			for(int i=0; i<n; i++) {
				thePolygon.addVertex(new MyPoint(in.nextInt(), in.nextInt()));
			}
			MyPoint thePoint = new MyPoint(in.nextInt(), in.nextInt());
			in.close();
			
			if(thePolygon.contains(thePoint)) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
