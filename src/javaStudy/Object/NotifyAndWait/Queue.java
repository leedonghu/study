package javaStudy.Object.NotifyAndWait;

import java.util.NoSuchElementException;

public class Queue {
	private int size;
	private Node head, tail;
	
	private static class Node{
		private String value;
		private Node next;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void enque(String item) {
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
	}
	
	public String deque() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		String value = head.value;
		head = head.next;
		size--;
		if(isEmpty()) {
			tail = null;
		}
		return value;
	}
}
