package study.ch3_3;

public class Code02 {
	//wrapper class
	//object타입의 배열은 어떤 객체도 참조할 수 있지만 primitive type은 객체가 아니여서 안됨
	//primitive type 데이터를 객체로 만듬
	//기본 타입의 데이터를 하나의 객체로 포장해주는 클래스
	//Integer, Double, Character, Boolean 등
	
	public static void main(String[] args) {
		Object[] array = new Object[100];
		
		int a = 20; //들어가지는데? 이유는?
		Integer age = new Integer(a); //boxing
		int b = age.intValue();
		int d = (Integer)array[0]; //unboxing
		
		//autoboxing autounboxing이 가능하기 때문에 object[]에 객체가 아닌 int 값이 들어감
		array[0] = a;
		array[1] = b;
		array[2] = age;
		System.out.println(array[0]+", " + array[1] + ", " + array[2]);
		
		String str = "1234";
		int c = Integer.parseInt(str);
		System.out.println(c);
	}
}
