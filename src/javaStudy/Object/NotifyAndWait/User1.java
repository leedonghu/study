package javaStudy.Object.NotifyAndWait;

public class User1 extends Thread {
	private Ash ash;
	
	public void setAsh(Ash ash) {
		this.setName("User1");
		this.ash = ash;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		ash.setItem("도란검");
	}
}
