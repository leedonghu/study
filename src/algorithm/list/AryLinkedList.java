package algorithm.list;

public class AryLinkedList<E> {
	
	
	class Node<E>{
		private E data; //데이터
		private int next; //리스트의 뒤쪽 포인터
		private int dnext; //free리스트의 뒤쪽 포인터
		
		void set(E data, int next) {
			this.data = data;
			this.next = next;
		}
	}
	
	private Node<E>[] n;
	private int size;
	private int max;
	private int head;
	private int crnt;
	private int deleted; //free리스트의 머리노드
	private static final int NULL = -1;
	
	public AryLinkedList(int capacity) {
		head = crnt = max = deleted = NULL;
		
		try {
			n = new Node[capacity];
			for(int i=0; i<capacity; i++)
				n[i] = new Node<E>();
			size = capacity;
		} catch (OutOfMemoryError e) {
			// TODO: handle exception
			size = 0;
		}
	}
	
	//다음에 삽입하는 레코드 인덱스구함
	private int getInsertIndex() {
		if(deleted == NULL) { //삭제할 레코드가 없음
			if(max < size) {
				return ++max; //새 레코드사용
			}else {
				return NULL; //용량 넘침
			}
		}else {
			int rec = deleted;  //프리 리스트에서
			deleted = n[rec].dnext; //머리 rec를 꺼냄
			return rec;
		}
	}
}
