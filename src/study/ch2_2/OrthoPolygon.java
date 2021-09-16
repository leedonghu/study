package study.ch2_2;

public class OrthoPolygon {
	public int n;
	public MyPoint[] vertices;
	
	public OrthoPolygon(int k) {
		n = k;
		vertices = new MyPoint[k];
	}
	
	public void addVertex(MyPoint p) {
		vertices[n++] = p;
	}
	
	public int maxX() { //x좌표 최댓값
		int max = vertices[0].x; //첫번째 좌표의 x 좌표
		for(int i=0; i<n; i++) {
			if(vertices[i].x > max) {
				max = vertices[i].x;
			}
		}
		return max;
	}
	
	public boolean contains(MyPoint p) {
		OrthoLine arrow = new OrthoLine(p, new MyPoint(maxX()+1, p.y));
		int count = 0;
		for(int i=0; i<n; i++) {
			OrthoLine edge = new OrthoLine(vertices[i], vertices[(i+1) % n]);
			if(arrow.intersects(edge)) {
				count++;
			}
		}
		return count%2 == 1;
	}
}
