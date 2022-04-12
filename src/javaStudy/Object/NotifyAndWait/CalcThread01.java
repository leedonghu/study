package javaStudy.Object.NotifyAndWait;

public class CalcThread01 implements Runnable {
	
	private String name;
	private int a;
	private int b;
	private boolean state;
	Thread thread;
	
	public CalcThread01(String name, int a, int b) {
		this.name = name;
		this.a = a;
		this.b = b;
		state = false;
		thread = new Thread(this, name);
		System.out.println(name + " thread start");
		thread.start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(!state) {
			
			try {
				Thread.sleep(500);
				a = a+1;
				b = b+1;
				CalcThread03 th3 = new CalcThread03("th3", a, b);
				
				state = true;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(name + " thread stop");
	}
	
	public int getA() {
		return a;
	}
	
	public int getB() {
		return b;
	}

}
