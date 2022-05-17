package javaStudy.lamda;

public class UsingThisEx {
	public static void main(String[] args) {
		UsingThis ut = new UsingThis();
		UsingThis.Inner inner = ut.new Inner();
		inner.method();
	}
}
