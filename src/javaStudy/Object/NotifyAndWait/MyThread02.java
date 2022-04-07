package javaStudy.Object.NotifyAndWait;

public class MyThread02 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(long i=0; i<20; i++) {
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}
