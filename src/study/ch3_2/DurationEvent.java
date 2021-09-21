package study.ch3_2;

public class DurationEvent extends Event {
//	public String title;
	public MyDate begin;
	public MyDate end;
	
	public DurationEvent(String t, MyDate b, MyDate e) {
		super(t);
		
		begin = b;
		end = e;
	}
	
	public String toString() {
		return title + ", " +begin.toString() + "~" + end.toString();
	}
	
	public boolean isRelevant(MyDate date) {
		
		return begin.compareTo(date) <= 0 && end.compareTo(date)>=0;
	}
	public MyDate getRepresentativeDate() {
		return begin;
	}
}
