package javaStudy.Object.NotifyAndWait;

public class Ash extends Thread {
	private String item;
	
	public synchronized void setItem(String item)  {
		this.item = item;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " 현재 아이템 :" + this.item );
	}
}
