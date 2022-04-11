package javaStudy.Object.NotifyAndWait;

public class ThreadTest02 {
	public static void main(String[] args) {
		MyThread05 th1 = new MyThread05("th1");
		MyThread05 th2 = new MyThread05("th2");
		MyThread05 th3 = new MyThread05("th3");
		MyThread05 th4 = new MyThread05("th4");
		
		try {
			Thread.sleep(500);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
