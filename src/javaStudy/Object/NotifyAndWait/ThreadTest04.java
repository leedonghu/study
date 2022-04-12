package javaStudy.Object.NotifyAndWait;

public class ThreadTest04 {
	public static void main(String[] args) {
		System.out.println("시작");
		Ash ash = new Ash();
		User1 user1 = new User1();
		user1.setAsh(ash);
		user1.start();
		
		User2 user2 = new User2();
		user2.setAsh(ash);
		user2.start();
	}
}
