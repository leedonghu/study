package javaStudy.Object.NotifyAndWait;

public class MyThread04 implements Runnable{
	
	static int point = 100;
	Thread th;
	public MyThread04(String name) {
		 th = new Thread(this, name);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name = Thread.currentThread().getName();
		while(true) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			point--;
			System.out.println(name + ": get point");
			System.out.println(point);
			
			if(point == 0) {
				System.out.println(name + "thread stop");
				break;
			}
		}
	}
	
	public void start() {
		th.start();
	}

}
