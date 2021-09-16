package study.ch2_2;

public class OrthoLine {//수직선 수평선을 나타내는 클래스
	//선분의 양 끝점
	public MyPoint u; 
	public MyPoint v;
	
	public OrthoLine(MyPoint p, MyPoint q) {
		u = p;
		v = q;
		//p점의 위치를 항상 왼쪽 위에(x값이 더 작고 y값이 더 작은 위치에)
		if(p.x > q.x || p.x == q.x && p.y >q.y) {
			swap();
		}
	}
	
	public OrthoLine(int x1, int y1, int x2, int y2) {
		u = new MyPoint(x1, y1);
		v = new MyPoint(x2, y2);
	}
	
	public boolean intersects(OrthoLine other) {
		if(isVertical() && !other.isVertical()) { //내가 수직선이고 다른 선이 수평선일때
			//두 선분이 교차하는지 확인
			return (other.u.x <u.x && other.v.x > u.x && u.y < other.u.y && v.y > other.u.y);
		}else if(!isVertical() && other.isVertical()) {
			return (other.u.y < u.y && other.v.y > u.y && u.x < other.u.x && v.x>other.u.x);
		}else {
			return false;
		}
	}
	
	public boolean isVertical() { //수직인가
		return u.x == v.x;
	}
	
	private void swap() {
		MyPoint tmp = u;
		u = v;
		v = tmp;
	}
}
