package study.ch3_3;



public class Code01 {
	//Object class 
	//모든 클래스들의 superclass, 가장 상위 클래스
	//toString(), equals()메소드는 모든 클래스가 가지고 있음
	
	public int a = 10;
	public double x = 3.14;
	
//	public boolean equals(Code01 other) { //오버라이딩은 아님, object타입의 변수가 들어와야함
//		return a == other.a && x == other.x;
//	}
	
	public boolean equals(Object other) {
		
		Code01 c = (Code01)other; //object타입을 code01타입으로 캐스팅
		return a == c.a && x == c.x;
	}
	
	public static void main(String[] args) {
		Code01 c1 = new Code01();
		Code01 c2 = new Code01();
//		c2.a = 5;
//		c2.x = 3.14;
		
		System.out.println(c1.toString());//클래스 이름 @ 객체의 hashcode, Object의 toString 메소드, 오버라이딩해줘야 내가 원하는 메소드 사용가능
		
		if(c2.equals(c1)) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
}
