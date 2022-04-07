package javaStudy.Object.NotifyAndWait;

public class MyThread01 extends Thread {
	
	private Thread targetThread;
	
	public MyThread01(Thread targetThread) {
		this.targetThread = targetThread;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true) {
			Thread.State state = targetThread.getState();
			System.out.println("타겟 쓰레드 상태 : " + state);
			
			if(state == Thread.State.NEW) {
				targetThread.start();
			}
			
			if(state == Thread.State.TERMINATED) {
				break;
			}
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
