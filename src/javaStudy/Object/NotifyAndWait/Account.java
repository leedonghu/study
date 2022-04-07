package javaStudy.Object.NotifyAndWait;

public class Account {
	private int balance;
	
	public synchronized void withdraw(int money) {
		while(balance < money) {

			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		balance -= money;
	}
	
	public synchronized void deposit(int money) {
		balance += money;
		notify();
	}
}
