package study.ch3_1;

public class Notebook extends Computer {
	//computer를 상속
	//모든것을 물려받음
	//computer - super class, notebook ->sub class
	//생성자가 없을 경우 자동으로 no-parameter 생성자가 만들어짐
	//모든 서브클래스의 생성자는 먼저 슈퍼클래스의 생성자를 호출
	//super()를 통해 명시적으로 호출
	
	public double screenSize;
	public double weight;
	
	public Notebook(String man, String proc, int ram, int disk, double speed, double screen, double weight) {
		//computer에 no-parameter생성자말고 다른 생성자가 있을때 오류 발생
		super(man, proc, ram, disk, speed); //5개의 파라미터를 받는 생성자 명시
//		manufactuer = man;
//		processor = proc;
//		ramSize = ram;
//		diskSize = disk;
//		processorSpeed = speed;
		screenSize = screen;
		this.weight = weight;
	}
	
	//부모클래스의 메소드를 그대로 쓰는 것이 아니라 재정의 해서 사용 override
	public String toString() {
		//부모클래스의 데이터가 private이면 자식클래스가 상속을 받았다고 해도 접근할 수 없음
		String result = super.toString() +
//						"manufactuer: " + manufactuer +
//						"\nCPU: " + processor +
//						"\nRAM: " + ramSize + "megabytes" +
//						"\nDisk: " + diskSize +" gigabytes" +
//						"\nProcessor speed: " + processorSpeed + " gigahertz" +
						"\nScreenSize: " + screenSize + "inches " +
						"\nWeight: " + weight + "kg";
		return result;
	}
	
	
	public static void main(String[] args) {
		Notebook test = new Notebook("dell", "15", 4, 1000, 3.2, 15.6, 1.2);

		
		System.out.println(test.computePower());
		System.out.println(test);
		System.out.println(test.toString());
	}
}
