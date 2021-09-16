package study.ch2_3;

public class Test {
	public static void main(String[] args) {
		Code01 code = new Code01();
		code.t = 10;
		code.s = 100;
		code.print2(); // s:100 t:10출력
		
		Code01 code2 = new Code01();
		code2.print1();
		code2.print2(); // s:100 t:0출력
	}
}
