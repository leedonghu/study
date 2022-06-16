package algorithm.list;

import java.util.Comparator;

public class DblLinkedList<E> {
	
	class Node<E>{
		private E data;
		private Node<E> prev; //앞쪽 포인터
		private Node<E> next; //뒤쪽 포인터
		
		Node(){
			data = null;
			prev = next = this;
		}
		
		Node(E obj, Node<E> prev, Node<E> next){
			data = obj;
			this.prev = prev;
			this.next = next;
		}
	}
	
	private Node<E> head;
	private Node<E> crnt;
	
	public DblLinkedList() {
		head = crnt = new Node<E>(); //더미 노드 생성
	}
	
	public boolean isEmpty() {
		return head.next == head; //자기 자신을 가리키면 비어있음
	}
	
	public E search(E obj, Comparator<? super E> c) {
		Node<E> ptr = head.next; //더미 노드 다음
		
		while(ptr != head) {
			if(c.compare(obj, ptr.data) == 0) { //검색 성공
				crnt = ptr;
				return ptr.data; 
			}
			ptr = ptr.next;
		}
		return null;
	}
	
	public void printCurrentNode() {
		if(isEmpty()) {
			System.out.println("선택 노드가 없습니다");
		}else {
			System.out.println(crnt.data);
		}
	}
	
	public void dump() {
		Node<E> ptr = head.next;
		
		while(ptr != head) {
			System.out.println(ptr.data);
			ptr = ptr.next;
		}
	}
	
	public void dumpReverse() {
		Node<E> ptr = head.prev;
		
		while(ptr != head) {
			System.out.println(ptr.data);
			ptr = ptr.prev;
		}
	}
	
	public boolean next() {
		if(isEmpty() || crnt.next == head) {
			return false;
		}else {
			crnt = crnt.next;
			return true;
		}
	}
	
	public boolean prev() {
		if(isEmpty() || crnt.prev == head) {
			return false;
		}else {
			crnt = crnt.prev;
			return true;
		}
	}
	
	public void add(E obj) {
		Node<E> node = new Node(obj, crnt, crnt.next); //prev에 현재 노드, next에 다음 노드
		crnt.next = crnt.next.prev = node; //현재노드의 다음을 가리키는 포인터와 다음 노드의 이전을 가리키는 포인터가 새로 생기는 노드를 가리키게 함
		crnt = node;
	}
	
	public void addFirst(E obj) {
		crnt = head; //더미노드 바로 뒤에 삽입
		add(obj);
	}
	
	public void addLast(E obj) {
		crnt = head.prev; //꼬리노드 바로 뒤에 삽입
		add(obj);
	}
	
	public void removeCurrentNode() {
		if(!isEmpty()) {
			//노드 사이의 연결을 다시해줌
			//삭제되는 노드의 이전노드와 이후 노드를 연결
			crnt.prev.next = crnt.next; 
			crnt.next.prev = crnt.prev;
			crnt = crnt.prev;
			if(crnt == head) crnt = head.next;
		}
	}
	
	public void remove(Node p) {
		Node<E> ptr = head.next;
		
		while(ptr != head) {
			if(ptr == p) {
				crnt = p;
				removeCurrentNode();
				break;
			}
			ptr = ptr.next;
		}
	}
	
	public void removeFirst() {
		crnt = head.next;
		removeCurrentNode();
	}
	
	public void removeLast() {
		crnt = head.prev;
		removeCurrentNode();
	}
	
	public void clear() {
		while(!isEmpty()) {
			removeFirst();
		}
	}
}

