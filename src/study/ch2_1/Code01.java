package study.ch2_1;

public class Code01 {
	//data를 하나로 묶어주는 것이 class
	//클래스는 결국 하나의 타입
	
	//primitive 타입은 선언된 변수에 저장
	//클래스는 변수에 저장되는것이 아님, 클래스의 주소(참조)가 저장
	//변수만 선언했다면 객체는 생성되지 않음
	// new Person01() 에 의해 객체 생성 -> 주소가 a 변수에 저장
	
	public static void main(String[] args) {
		
		int x;
		x = 100;
		
		Person01 a; //person01 타입의 변수 a 
		a = new Person01(); //object
		
		a.name = "john";
		a.number = "01055555555";
		
		Person01[] members = new Person01[10];
		members[0] = a;
		members[1] = new Person01();
		members[1].name = "david";
		members[1].number = "01044444433";
		
		System.out.println(members[1].name + ", " + members[1].number);
	}
}
