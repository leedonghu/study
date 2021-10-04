package study.ch3_5;

public class Code01 {
	//제네릭 프로그래밍은 데이터 형식에 의존하지 않고, 하나의 값이 여러 다른 데이터 타입들을 가질 수 있는 기술에 중점을 두어
	//재사용성을 높일 수 있는 프로그래밍방식
	//나중에 타입이 특정됨
	//generic <-> specific
	//큰 의미에서는 여러 타입의 데이터를 저장한다는 뜻부터 ex) Event 변수
	
	//class Object vs Generics
	//클래스의 데이터 타입을 모두 Object로 만드는 것은 제네릭과 유사
	//Object는 모든 클래스의 상위이기 때문에 
	//하지만 get()의 return 타입은 Object타입이기 때문에 강제 타입변환시켜야함
	//type safe하지 않기때문에 generics를 사용하는 것이 더 좋음
	public static void main(String[] args) {
		Box<Integer> integerBox = new Box<>(); //객체를 생성하는 시점에 가상의 타입 T를 실제 타입으로 정함
		integerBox.set(new Integer(10));
		
		
		Pair<String, Integer> p1 = new Pair<>();
		p1.set("Even", 9);
		System.out.println(p1.get());
	}
	

}
