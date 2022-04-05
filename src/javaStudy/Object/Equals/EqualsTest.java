package javaStudy.Object.Equals;

public class EqualsTest {
	public static void main(String[] args) {
		A a1 = new A(21, "lee");
		A a2 = new A(21, "lee");
		A a3 = a1;
		
		//equals()메소드를 재정의해서 어떤 상황에서 같다고 할지를 정함
		//내용이 같은면 참조값이 달라도 같다고 만들 수 있음
		//하지만 == 연산자로는 불가능함
		System.out.println(a1 == a2);
		System.out.println(a1 == a3);
		System.out.println(a1.equals(a2));
		
		System.out.println("a1 hashCode : " + a1.hashCode());
		System.out.println("a2 hashCode : " + a2.hashCode());
	}
}
