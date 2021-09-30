package study.ch4_1;

public class MySingleLinkedList<T> {
	public Node<T> head;
	public int size;
	
	public MySingleLinkedList(){
		head = null;
		size = 0;
	}
	
	public void addFirst(T item) {
		//1. 새로운 노드 생성
		Node<T> newNode = new Node<T>(item); // T : type parameter
//		Node<T> [] arr = new Node<T>[100]; // NOT OK
//		T t = new T(); NOT OK 가상의 객체를 생성하지 못함
//		T[] array = new T[100] NOT OK
		
		//2. 새로운 노드의 NEXT필드가 현재의 HEAD노드를 가리키도록
		newNode.next = head;
		//3. 새로운 노드를 새로운 HEAD노드로 함
		head = newNode;
		size++;
	}
	
	public void addAfter(Node<T> before ,T item) {
		//1. 새로운 노드를 만들고 데이터 저장
		Node<T> temp = new Node<T>(item);
		//2. 새로운 노드의 next필드가 before의 다음 노드를 가리키도록 함
		temp.next = before.next;
		//3. 새로운 노드를 before의 다음 노드로 만듬
		before.next = temp;
		size++;
	}
	
	public T removeFirst() {
		//1. head가 null이 아니라면 head가 노드의 다음 노드를 가리키게함
		if(head == null) {
			return null;
		}
		T temp = head.data;
		head = head.next;
		size--;
		return temp;
	}
	
	public T removeAfter(Node<T> before) {
		//1. before의 다음 노드가 null이 아니라면 before의 next 필드가 현재 next노드의 다음 노드를 가리키게 만듬
		if(before.next == null) {
			return null;
		}
		T temp = before.next.data;
		before.next = before.next.next;
		return temp;
	}
	
	public void add(int index, T item) {
		if(index <0 || index > size) {
			return ;
		}
		
		if(index == 0) {
			addFirst(item);
		}else {
			Node<T> node = getNode(index-1);
			addAfter(node, item);
		}
	}
	
	public T remove(int index) {
		if(index <0 || index >= size) {
			return null;
		}
		if(index == 0) {
			return removeFirst();
		}
		Node<T> prev = getNode(index -1); //앞의 노드를 알아야 삭제 가능
		return removeAfter(prev);
	}
	
	public T remove(T item) {
		Node<T> p = head;
		Node<T> q = null;
		while(p != null && !p.data.equals(item)) {
			q=p; //p의 한칸 뒤를 따라가도록
			p=p.next;
		}
		if(p==null) {
			return null;
		}
		if(q==null) {
			return removeFirst(); //첫번째 노드가 내가 찾는 것일때 p.data.equals(item) 참이됨으로 while문 돌지 못함
		}else {
			return removeAfter(q);
		}
	}
	
	public T get(int index) {
		if(index <0 || index >= size) {
			return null;
		}
//		
//		Node<T> p = head; 같은 코드 제거
//		for(int i=0; i<index; i++) {
//			p=p.next;
//		}
		return getNode(index).data; //index가 유효한 범위가 아니면 오류발생
	}
	
	public Node<T> getNode(int index){
		if(index <0 || index >= size) {
			return null;
		}
		
		Node<T> p = head;
		for(int i=0; i<index; i++) {
			p=p.next; //한칸 전진, 한칸 앞의 노드
		}
		return p;
	}
	
	public int indexOf(T item) {
		Node<T> p = head; //첫번째 노드
		int index = 0;
		while(p != null) {
			if(p.data.equals(item)) {
				return index;
			}
			p = p.next; //다음 노드의 주소
			index++;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		MySingleLinkedList<String> list = new MySingleLinkedList<String>();
		list.add(0, "Saturday");
		list.add(1, "Friday");
		list.add(0, "Monday"); // m, s, f
		list.add(2, "Tuesday");// m, s, t, f
		
		String str = list.get(2);// str = "Tuesday"
		list.remove(2); // m, s, f
		int pos = list.indexOf("Friday"); // pos = 2
	}
}
