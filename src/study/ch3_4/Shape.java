package study.ch3_4;

public abstract class Shape implements Comparable {
	
	public String shapeName;
	
	public Shape(String name) {
		shapeName = name;
	}
	
	public abstract double computerArea();
	public abstract double computerPerimeter();
	
	public int compareTo(Object o) {
		double myArea = computerArea();
		double yourArea =((Shape) o).computerArea();
		if(myArea < yourArea) {
			return -1;
		}else if(myArea == yourArea) {
			return 0;
		}else {
			return 1;
		}
	}
}
