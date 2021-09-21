package study.ch3_4;

import java.util.Arrays;
import java.util.Scanner;

public class ShapeApplication {
	
	private int capacity = 10;
	private Shape[] shapes = new Shape[capacity];
	private int n = 0;
	private Scanner kb = new Scanner(System.in);
	
	public void processCommand() {
		
		while(true) {
			System.out.println("$ ");
			String command = kb.next();
			if(command.equals("add")) {
				handleAdd();
			}else if(command.equals("show") || command.equals("showdetail")) {
				handleShow(command.equals("showdetail"));
			}else if(command.equals("sort")) {
				Arrays.sort(shapes, 0, n); //java api에 있는 정렬 
										   //대신 shapes는 Comparable을 implements 해야함
										   //generic method
			}else if(command.equals("exit")) {
				break;
			}
		}
		kb.close();
	}
	
	public static void main(String[] args) {
		ShapeApplication app = new ShapeApplication();
		app.processCommand();
	}
	
	
	private void handleSort(MyCompareable[] data, int size) { //MyCompareable -> Shape -> Rectangle, Circle
		for(int i=size-1; i>0; i--) {                         //MyCompareable을 구현만 하면 handleSort메소드 사용 가능
			for(int j=0; j<i; j++) {
				if(data[j].compareTo(data[j+1]) > 0) {
					MyCompareable tmp = data[j];
					data[j] = data[j+1];
					data[j+1] = tmp;
				}
			}
		}
		
	}

	private void handleShow(boolean detailed) {
		for(int i=0; i<n; i++) {
			System.out.println((i+1)+ ", " + shapes[i].toString());
			if(detailed) {
				System.out.println("    the area is " + shapes[i].computerArea());
				System.out.println("    the perimeter is " + shapes[i].computerPerimeter());
			}
		}
		
	}

	private void handleAdd() {
		String type = kb.next();
		switch(type) {
		case "R":
			int w = kb.nextInt();
			int h = kb.nextInt();
			Rectangle r = new Rectangle(w, h);
			addShape(r);
			break;
		case "C":
			addShape(new Circle(kb.nextInt()));
			break;
		case "T":
			
		}
		
	}

	private void addShape(Shape shape) {
		if(n >= capacity) {
			reallocate();
		}
		shapes[n++] = shape;
		
	}

	private void reallocate() {
		capacity *= 2;
		Shape[] tmp = new Shape[capacity];
		System.arraycopy(shapes, 0, tmp, 0, shapes.length);
		shapes = tmp;
		
	}

}
