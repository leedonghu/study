package javaStudy.Object.NotifyAndWait;

public class CalcThread02 implements Runnable {
	private int a;
	private int b;
	private String name;
	boolean state;
	Thread thread;
	
	public CalcThread02(String name, int a, int b) {
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
				sum(a, b);
				sub(a, b);
				multi(a, b);
				divide(a, b);
				state = true;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(name + " thread stop");
	}
	
	public void sum(int a, int b) {
		int result = a + b;
		System.out.println(result);
	}
	
	public void sub(int a, int b) {
		int result = a - b;
		System.out.println(result);
	}
	
	public void multi(int a, int b) {
		int result = a * b;
		System.out.println(result);
	}
	
	public void divide(int a, int b) {
		int result;
		if(b != 0) {
			result = a / b;
			System.out.println(result);
		}else {
			System.out.println("can`t divide");
		}
	}
}
