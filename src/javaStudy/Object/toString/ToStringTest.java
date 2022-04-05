package javaStudy.Object.toString;

public class ToStringTest {
	public static void main(String[] args) {
		A a1 = new A(30, "lee");
		String str = "lee";
		System.out.println(str.toString());
		System.out.println(a1.toString());
		System.out.println(a1);
	}
}
