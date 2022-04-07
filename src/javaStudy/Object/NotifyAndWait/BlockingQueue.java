package javaStudy.Object.NotifyAndWait;

import java.util.NoSuchElementException;


public class BlockingQueue {
	
	

	
	
	private int size;
	private Node head, tail;
	private int capacity;
	
	public BlockingQueue(int capacity) {
		if(capacity < 0) {
			throw new IllegalArgumentException();
		}
		this.capacity = capacity;
	}
	
	
	private static class Node{
		private String value;
		private Node next;
	}
	
	
	
	public synchronized void enque(String item) {
		
		while(isFull()) {
			try {
				System.out.println("enque wait");
				wait();
				System.out.println("enque notified");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Node oldTail = tail;
		tail = new Node();
		tail.value = item;
		tail.next = null;
		if(isEmpty()) {
			head = tail;
		}else {
			oldTail.next = tail;
		}
		size++;
		
		notifyAll();
	}
	
	public synchronized String deque() {
		try {
			while(isEmpty()) {
				System.out.println("deque wait");
				wait();
				System.out.println("deque notified");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		String value = head.value;
		head = head.next;
		size--;
		if(isEmpty()) {
			tail = null;
		}
		notifyAll();
		return value;
	}
	
	public synchronized boolean isFull() {
		return size == capacity;
	}
	
	public synchronized boolean isEmpty() {
		return head == null;
	}
	
	public static void main(String[] args) {
		BlockingQueue q = new BlockingQueue(1);
		Thread t = new Thread(() -> {
			try {
				Thread.sleep(200);
				q.enque("가");
				Thread.sleep(200);
				q.enque("나");
				q.enque("다");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		t.setName("work");
		t.start();
		
		try {
			System.out.println("{}" + q.deque());
			Thread.sleep(1000);
			System.out.println("{}" + q.deque());
			System.out.println("{}" + q.deque());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
