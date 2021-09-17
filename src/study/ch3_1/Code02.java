package study.ch3_1;

public class Code02 {
	//다형성 polymorphism
	//가장 중요한 개념
	//수퍼클래스 타입의 변수가 서브클래스 타입의 객체를 참조할 수 있음
	
	public static void main(String[] args) {
		Computer theComputer = new Notebook("bravo", "15", 4, 1000, 3.2, 14.6, 1.2);//computer 타입의 변수 theComputer가 Notebook객체 참조
		System.out.println(theComputer.toString()); //Computer의 toString메소드가 실행될까 Notebook의 toString메소드가 실행될까
													//static binding vs dynamic binding
													//java에서는 항상 동적 바인딩 Notebook객체 메소드 실행
	}
}
