package javaStudy.Object.HashCode;

import java.util.HashMap;
import java.util.Map;

public class HashCodeTest {
	public static void main(String[] args) {
		Map<A, A> a = new HashMap<>();
		A a1 = new A(1l, "lee");
		A a2 = new A(2L, "dong");
		A a3 = new A(3l, "hu");
		A a4 = new A(1L, "lee");
		a.put(a1, a1); //put메소드가 실행될때 key에 해당하는 해시코드를 만듬
		a.put(a2, a2);
		a.put(a3, a3);
		a.put(a4, a4);
		
		if(a.containsKey(a1)) {
			System.out.println("found");
		}
		System.out.println("a1 " + a1);
		System.out.println("a4 " + a4);
		String com = a1.equals(a4) ? "same": "not same";
		System.out.println(com);
		
		//hashcode()를 재정의 하지 않으면 같은 값 객체라도 해시값이 다를 수 있다
		//equals()를 재정의하지 않으면 hashcode()가 만든 해시값을 이용해 객체가 저장된 버킷을 찾을 수는 있지만 
		//해당 객체가 자신과 같은 객체인지 값을 비교할 수 없기 때문에 null을 리턴하게 된다. 따라서 역시 원하는 객체를 찾을 수 없다.
		//정확한 동등 비교를 위해서는 Object의 equals() 메소드만 재정의하지 말고 
		//hashCode()메소드도 재정의해서 논리적 동등 객체일경우 동일한 해시코드가 리턴되도록 해야한다.
	}
}
