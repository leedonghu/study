package javaStudy.Object.NotifyAndWait;

public class MyThread03 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread run");
		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("thread sleep");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
