package study.ch3_5;

public class Box<T> { //T라는 가상의 타입에 의해서 parameterized된 클래스
	private T t;
	public void set(T t) {
		this.t = t;
	}
	public T get() {
		return t;
	}
}
