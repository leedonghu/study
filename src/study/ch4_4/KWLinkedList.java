package study.ch4_4;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class KWLinkedList<E> {
	
	private Node<E> head = null;
	private Node<E> tail = null;
	private int size = 0;
	
	//inner class, static class, class member
	//non static field가 접근할 수 없음
	//class의 타입파라미터와 다름
	private static class Node<T>{
		public T data;
		public Node<T> next;
		public Node<T> previous;
		
		public Node(T item) {
			data = item;
			next = null;
		}
	}
	
	public Iterator<E> iterator(){
		return new KWListIterator(0);
	}
	
	public ListIterator<E> listIterator(){
		return new KWListIterator(0);
	}
	
	public ListIterator<E> listIterator(int index){
		return new KWListIterator(index);
	}
	
	private class KWListIterator implements ListIterator<E>{
		
		private Node<E> nextItem;
		private Node<E> lastItemReturned;
		private int index;
		
		public KWListIterator(int i) {
			if(i < 0 || i >size) {
				throw new IndexOutOfBoundsException("invalid index " + i);
			}
			
			lastItemReturned = null;
			if(i == size) {
				index = size;
				nextItem = null;
			}else {
				nextItem = head;
				for(index =0; index<i; index++) {
					nextItem = nextItem.next;
				}
			}
		}
		
		@Override
		public void add(E obj) {
			if(head == null) { //empty 리스트일때
				head = new Node<E>(obj);//새로운 노드 생성
				tail = head;
			}else if(nextItem == head) {
				Node<E> newNode = new Node<E>(obj);
				newNode.next = nextItem;
				nextItem.previous = newNode;
				head = newNode;
			}else if(nextItem == null) {
				Node<E> newNode = new Node<E>(obj);
				tail.next = newNode;
				newNode.previous = tail;
				tail = newNode;
			}else {
				Node<E> newNode = new Node<E>(obj);
				newNode.previous = nextItem.previous;
				nextItem.previous.next = newNode;
				newNode.next = nextItem;
				nextItem.previous = newNode;
			}
			size++;
			index++;
			
		}

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return nextItem != null;
		}

		@Override
		public boolean hasPrevious() {
			// TODO Auto-generated method stub
			return (nextItem == null && size != 0) || nextItem.previous != null;
		}

		@Override
		public E next() {
			if(!hasNext()) {
				throw new NoSuchElementException();
			}else {
				lastItemReturned = nextItem;
				nextItem = nextItem.next;
				index++;
				return lastItemReturned.data;
			}
		}

		@Override
		public int nextIndex() {
			// TODO Auto-generated method stub
			return index;
		}

		@Override
		public E previous() {
			if(!hasPrevious()) {
				throw new NoSuchElementException();
			}
			
			if(nextItem == null) {
				nextItem = tail;
			}else {
				nextItem = nextItem.previous;
			}
			lastItemReturned = nextItem;
			index--;
			return lastItemReturned.data;
		}

		@Override
		public int previousIndex() {
			// TODO Auto-generated method stub
			return index -1;
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void set(E arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public int indexOf(E item) {
		return 0;
	}
	
	public void add(int index, E item) {
		listIterator(index).add(item);
	}
	
	public E get(int index) {
		return listIterator(index).next();
	}
	
	public boolean remove(int index) {
		return true;
	}
	
	public void remove(E obj) {
		
	}
	
	public int size() {
		return size;
	}
}
