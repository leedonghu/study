package javaStudy.Object.NotifyAndWait;

public class ThreadTest {
	public static void main(String[] args) {
		Thread th1 = new Thread();
		
		
		try {
			for(int i=0;i<10; i++) {
				System.out.println("thread sleep");
				th1.sleep(1000);
				System.out.println(i);
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
