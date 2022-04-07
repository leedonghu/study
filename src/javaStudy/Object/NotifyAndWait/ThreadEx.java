package javaStudy.Object.NotifyAndWait;

public class ThreadEx {
	public static void main(String[] args) {
		MyThreadEx th1 = new MyThreadEx("*");
		MyThreadEx th2 = new MyThreadEx("**");
		MyThreadEx th3 = new MyThreadEx("***");
		
		th1.start();
		th2.start();
		th3.start();
		
		try {
			Thread.sleep(2000);
			th1.suspend();
			Thread.sleep(2000);
			th2.suspend();
			Thread.sleep(3000);
			th1.resume();
			Thread.sleep(3000);
			th1.stop();
			th2.resume();
			th2.stop();
			Thread.sleep(3000);
			th3.stop();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
