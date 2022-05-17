package javaStudy.lamda;

public class LamdaEx01 {
	public static void main(String[] args) {
		
		//매개변수가 없는 람다식
		MyInterface mi = () -> {
			String str = "method call1";
			System.out.println(str);
		};
		mi.method();
		
		mi = () -> {
			String str = "method call2";
			System.out.println(str);
		};
		mi.method();
		
		mi = () -> {
			String str = "method call3";
			System.out.println(str);
		};
		mi.method();
		
		
		
		//매개변수가 있는 람다식
		MyInterface02 m2 = (x) -> {
			int result = x * 5;
			System.out.println(result);
		};
		m2.method(2);
		
		 m2 = (x) -> {
				int result = x * 5;
				System.out.println(result);
		};
		m2.method(3);
		
		
		//리턴값이 있는 람다식
		MyInterface03 m3 = (x, y) -> {
			int result = x+y;
			return result;
		};
		System.out.println(m3.method(2, 5));
			
	}
	
}

