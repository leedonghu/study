package study.ch3_2;

public class OnedayEvent extends Event {
//	public String title; 자동 상속
	public MyDate date;
	
	public OnedayEvent(String t, MyDate d) {
		
		super(t);
//		title = t;
		date = d;
	}
	
	public String toString() {
		return title + ", " + date.toString();
	}
}
