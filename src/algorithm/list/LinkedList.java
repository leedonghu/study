package algorithm.list;

import java.util.Comparator;

public class LinkedList<E> {
	
	class Node<E>{
		private E data;
		private Node<E> next;
		
		Node(E data, Node<E> next){
			this.data = data;
			this.next = next;
		}
	}
	private Node<E> head; //머리 노드
	private Node<E> crnt; //선택 노드
	
	public LinkedList() {
		head = crnt = null; //비어있다면 head도 노드도 없기 떄문에 null
	}
	
	public E search(E obj, Comparator<? super E> c) {
		Node<E> ptr = head; //현재 스캔중인 노드
		
		while(ptr != null) {
			
			if(c.compare(obj, ptr.data) == 0) { //같으면 검색 성공
				crnt = ptr;
				return ptr.data;
			}
			
			ptr = ptr.next; //다음 노드 선택
		}
		return null; //검색 실패
	}
	
	public void addFirst(E obj) { //머리에 노드 삽입
		Node<E> ptr = head; //머리노드를 ptr에 대입
		head = crnt = new Node<E>(obj, ptr); //head가 새로 생성된 노드를 참조하도록 함
	}
	
	public void addLast(E obj) {
		if(head == null) {
			addFirst(obj);
		}else {
			Node<E> ptr = head;
			while(ptr.next != null) { //while문 종료시 ptr은 꼬리노드를 가리킴
				ptr = ptr.next;
			}
			ptr.next = crnt = new Node<E>(obj, null);
		}
	}
	
	public void removeFirst() {
		if(head != null) {
			head = crnt = head.next;
		}
	}
	
	public void removeLast() {
		if(head != null) {
			if(head.next == null) {
				removeFirst();
			}else {
				Node<E> ptr = head; //스캔중인 노드
				Node<E> pre = head; //스캔중인 노드의 앞쪽
				
				while(ptr.next != null) { //while문 종료시 ptr은 꼬리노드를 가리키고 pre는 꼬리에서 두번째 노드를 가리킴
					pre = ptr;
					ptr = ptr.next;
				}
				
				pre.next = null; //꼬리에서 두번째 노드가 참조하는 노드를 null로
				crnt = pre;
			}
		}
	}
	
	public void remove(Node p) {
		if(head != null) {
			if(p == head) {
				removeFirst();
			}else {
				Node<E> ptr = head;
				
				while(ptr.next != p) {
					ptr = ptr.next;
					if(ptr == null) {
						return;
					}
				}
				
				ptr.next = p.next;
				crnt = ptr;
			}
		}
	}
	
	public void removeCurrentNode() { //선택 노드 삭제
		remove(crnt);
	}
	
	public void clear() {
		while(head != null) {
			removeFirst();
		}
		crnt = null;
	}
	
	public boolean next() {
		if(crnt == null || crnt.next == null) {
			return false;
		}else {
			crnt =crnt.next;
			return true;
		}
	}
	
	public void printCurrentNode() {
		if(crnt == null) {
			System.out.println("선택한 노드가 없습니다");
		}else {
			System.out.println(crnt.next);
		}
	}
	
	public void dump() {
		Node<E> ptr = head;
		
		while(ptr != null) {
			System.out.println(ptr.data);
			ptr = ptr.next;
		}
	}
}


