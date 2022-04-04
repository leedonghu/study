package javaStudy.Object.getClass;

public class GetClassTest {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		System.out.println(a.getClass());
		System.out.println(b.getClass());
		
		Class a1 = a.getClass(); // Class 타입을 리턴
		System.out.println("GetName: " + a1.getName());
		System.out.println("getDeclaredFields" + a1.getDeclaredFields()[1]);
		System.out.println("getSuperClass"+a1.getSuperclass());
		
		GetClassTest t1 = new GetClassTest();
		B b2 = new B();
		b.printClass();
	}
}
