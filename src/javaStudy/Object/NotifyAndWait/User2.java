package javaStudy.Object.NotifyAndWait;

public class User2 extends Thread {
	private Ash ash;
	
	public void setAsh(Ash ash) {
		this.setName("User2");
		this.ash = ash;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		ash.setItem("도란링");
	}
}
