package study.ch3_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Scheduler {
	
	//셋이 비슷하지만 다름
	//상위클래스를 만든 후 상속하게 함
//	OnedayEvent[] oneday = new OnedayEvent[100];
//	DurationEvent[] duration = new DurationEvent[100];
//	DeadlineEvent[] deadline = new DeadlineEvent[100];
//	int n1 =0, n2 =0, n3 =0;
	
	//event타입의 배열
	//각 칸에 OnedayEvent,DurationEvent,DeadlineEvent가 들어갈 수 있음
	//다형성 
	//다른타입의 객체들을 같은 배열에 넣을 수 있음
//	private int capacity = 10;
	public ArrayList<Event> events = new ArrayList<>();
//	public Event[] events = new Event[capacity]; //배열 재할당 배열크기늘림
//	int n =0;
	private Scanner kb;
	
	
	public void processCommand() {
		kb = new Scanner(System.in);
		while(true) {
			System.out.println("$ ");
			String command = kb.next();
			
			if(command.equalsIgnoreCase("addEvent")) {
				String type = kb.next();
				if(type.equalsIgnoreCase("oneday")) {
					handleAddOnedayEvent();
				}else if(type.equalsIgnoreCase("duration")) {
					handleAddDurationEvent();
				}else if(type.equalsIgnoreCase("deadline")) {
					handleAddDeadlineEvent();
				}
				
			}else if(command.equals("list")) {
				handleList();
				
			}else if(command.equals("show")) {
				handleShow();
				
			}else if(command.equals("sort")) {
				Collections.sort(events);
			}
			else if(command.equals("exit")) {
				break;
			}
		}
		kb.close();
	}
	
	private void handleShow() {
		String dateString = kb.next();
		MyDate theDate = paresDateString(dateString);
		
		for(Event ev : events) {
			if(ev.isRelevant(theDate)) { //event 클래스를 추상 클래스로 만듬
				System.out.println(ev.toString());
			}
		}
		
	}

	private void handleList() {
		for(Event ev: events) {
			System.out.println("  " + ev.toString());
		}
		
	}
	
	private void addEvent(Event ev) {
//		if(n >= capacity) {
//			reallocate();
		events.add(ev);
	}

//	private void reallocate() {
//		Event[] tmp = new Event[capacity * 2];
//		for(int i=0; i<n; i++) {
//			tmp[i] = events[i];
//		}
//		events = tmp;
//		capacity *=2;
//		
//	}

	private void handleAddDeadlineEvent() {
		// TODO Auto-generated method stub
		
	}

	private void handleAddDurationEvent() {
		System.out.print("   begin: ");
		String begin = kb.next(); //2021/5/17
		MyDate date = paresDateString(begin);
		
		System.out.print("   end: ");
		String end = kb.next();
		MyDate date2 = paresDateString(end);
		
		System.out.print("   title: ");
		String title = kb.next();
		
		DurationEvent dv = new DurationEvent(title, date, date2);
		System.out.println(dv.toString());
		events.add(dv); //다형성

		
	}

	private void handleAddOnedayEvent() {
		System.out.print("   when: ");
		String dateString = kb.next(); //2021/5/17
		
		MyDate date = paresDateString(dateString);
		
		System.out.print("   title: ");
		String title = kb.next();
		
		OnedayEvent ov = new OnedayEvent(title, date);
		System.out.println(ov.toString());
		events.add(ov);
		
	}

	private MyDate paresDateString(String dateString) {
		String[] tokens = dateString.split("/"); //dateString = 2021/5/17
		//tokens[0] = "2021"
		int year = Integer.parseInt(tokens[0]);
		int month = Integer.parseInt(tokens[1]);
		int day = Integer.parseInt(tokens[2]);
		
		MyDate d = new MyDate(year, month, day);
		
		return d;
	}

	public static void main(String[] args) {
		Scheduler app = new Scheduler();
		app.processCommand();
	}
}
