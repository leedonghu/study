package javaStudy.Object.NotifyAndWait;

public class ThreadTest02 {
	public static void main(String[] args) {
		MyThread04 th1 = new MyThread04("th1");
		MyThread04 th2 = new MyThread04("th2");
		MyThread04 th3 = new MyThread04("th3");
		MyThread04 th4 = new MyThread04("th4");
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
	}
}
