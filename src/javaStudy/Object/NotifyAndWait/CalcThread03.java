package javaStudy.Object.NotifyAndWait;

public class CalcThread03 implements Runnable {
	private int a;
	private int b;
	private String name;
	boolean state;
	Thread thread;
	
	public CalcThread03(String name, int a, int b) {
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
				System.out.println("a + b = " + a+b);
				System.out.println("a - b = " +(a-b));
				System.out.println("a * b = " + a*b);
				System.out.println("a / b = " + a/b);
				state = true;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(name + " thread stop");
	}

}
