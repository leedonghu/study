package study.ch3_2;

public class DeadlineEvent extends Event {
//	public String title;
	public MyDate deadline;
	
	public DeadlineEvent(String t, MyDate d) {
		super(t);
		deadline = d;
	}
	
	public String toString() {
		return title + ", " + deadline.toString();
	}
	
	public boolean isRelevant(MyDate date) {
		return deadline.compareTo(date) >=0;
	}
	
	public MyDate getRepresentativeDate() {
		return deadline;
	}
}
