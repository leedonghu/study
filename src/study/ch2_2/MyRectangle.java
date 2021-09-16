package study.ch2_2;

import study.ch2_2.MyPoint;

public class MyRectangle {
	public MyPoint lu;
	public int width;
	public int height;
	
	public MyRectangle(int x, int y, int w, int h) {
		lu = new MyPoint(x, y); //lu는 참조변수일 뿐 객체를 생성해줘야함
		width = w;
		height = h;
	}
	
	public int calcArea() {
		return width * height;
	}
	
	public String toString() {
		return "(" +lu.x + ", " + lu.y +") " + width + ", " + height +", "+ width*height;
	}
}
