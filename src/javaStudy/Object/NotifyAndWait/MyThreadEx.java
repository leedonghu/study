package javaStudy.Object.NotifyAndWait;

public class MyThreadEx implements Runnable {
	
	static final int RUNNING = 0;
	static final int SUSPENDED = 1;
	static final int STOPPED = 2;
	
	private int state = RUNNING;
	Thread th;
	
	public MyThreadEx(String name) {
		th = new Thread(this, name);
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name = Thread.currentThread().getName();
		
		while(true) {
			System.out.println(name);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(checkState()) {
				break;
			}
		}
	}
	
	public synchronized void setState(int state) {
		this.state = state;
		
		if(state == RUNNING) {
			notify();
		}else {
			th.interrupt();
		}
	}
	
	public synchronized boolean checkState() {
		while(state == SUSPENDED) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return state == STOPPED;
	}
	
	public void suspend() {
		setState(SUSPENDED);
	}
	
	public void resume() {
		setState(RUNNING);
	}
	
	public void stop() {
		setState(STOPPED);
	}
	
	public void start() {
		th.start();
	}

}
