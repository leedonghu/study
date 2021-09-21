package study.ch3_2;

public abstract class Event implements Comparable {
	//각각의 event클래스의 상위 클래스
	//공통으로 가지고있는 title필드 가짐
	public String title;
	
	public Event(String title) {
		this.title = title;
	}
	
	public abstract boolean isRelevant(MyDate date); 
	
	public abstract MyDate getRepresentativeDate();
	
	public int compareTo(Object other) { //Comparable 구현하면 compareTo만들어줘야함
		MyDate myDate = getRepresentativeDate();
		MyDate yourDate = ((Event)other).getRepresentativeDate();
		return myDate.compareTo(yourDate);
	}
}
