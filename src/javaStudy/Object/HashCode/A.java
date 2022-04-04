package javaStudy.Object.HashCode;

import java.util.Objects;

public class A {
	private long id;
	private String name;
	
	public A(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		//31이 홀수이면서 소수(prime)이기 때문입니다. 만약 이 숫자가 짝수이고 오버플로가 발생한다면 정보를 잃게 됩니다. 2를 곱하는 것은 시프트 연산과 같은 결과를 내기 때문입니다.
		//소수를 곱하는 이유는 전통적으로 그래왔습니다. 그리고 31 숫자는 곱셀을 시프트 연산과 뺄셈으로 대체해 최적화 할 수 있습니다.
		int hash = 7;
		hash = 31 * hash + (int)id;
		hash = 31 * hash + (name == null? 0: name.hashCode());
		System.out.println("hashCode() called - Computed hash: " + hash);
		return hash;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        A a = (A) obj;
        return id == a.id &&
                name.equals(a.name); //java.util.Objects 클래스는 객체 비교, 해시코드 생성, null 여부, 객체 문자열 리턴 등의 연산을 수행하는 정적 메소드들로 구성된 Object의 유틸리티 클래스
	}
}
