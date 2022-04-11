package javaStudy.Object.NotifyAndWait;

public class MyThread05 implements Runnable {
	private String name;
	private boolean exitThread;
	static int totalScore = 50;
	private int earnScore = 0;
	Thread thread;
	
	public MyThread05(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.exitThread = false;
		thread = new Thread(this, name);
		System.out.println("Create Thread : " + thread);
		thread.start();
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(!exitThread) {
			System.out.println(name + " thread running");
			System.out.println(totalScore);
			try {
				thread.sleep(500);
				totalScore--;
				if(totalScore <= 0) {
					stopThread();
					break;
				}
				if(totalScore != 0) {
					System.out.println(name + " earn");
					earnScore++;
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(name + " thread stop");
		System.out.println(name + " earn scor : " + earnScore);
		
	}
	
	
	public void stopThread() {
		exitThread = true;
	}
	
	
}
