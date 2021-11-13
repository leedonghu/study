package algorithm.stackAndQueue;

public class IntQueue {
	private int max;
	private int front;
	private int rear;
	private int num;
	private int[] que;
	
	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {}
	}
	
	public class OverflowIntQueueException extends RuntimeException{
		public OverflowIntQueueException() {}
	}
	
	public IntQueue(int capacity) {
		max = capacity;
		num = front = rear = 0;
		
		try {
			que = new int[max];
		}catch(OutOfMemoryError e) {
			max = 0;
		}
	}
	
	public int enque(int x) throws OverflowIntQueueException {
		if(num >= max) {
			throw new OverflowIntQueueException();
		}
		que[rear++] = x; //rear은 마지막 요소의 다음칸을 가리키고 있음
		num++;
		if(rear == max) { // rear(마지막 요소 다음칸을 가리키는 변수)가 max와 같아지면 실제 배열보다 큰 index를 가지게됨
						  // ex) max 10, 8-9-0-1-2 순으로 가야함
			rear = 0;
		}
		return x;
	}
	
	public int deque() throws EmptyIntQueueException {
		if(num <= 0) {
			throw new EmptyIntQueueException();
		}
		
		int x = que[front++]; //맨 앞의 요소를 빼고 front를 하나 증가
		num--;
		if(front == max) {
			front = 0;
		}
		return x;
	}
	
	public int peek() throws EmptyIntQueueException {
		if(num <= 0) {
			throw new EmptyIntQueueException();
		}
		
		return que[front];
	}
	
	public int indexOf(int x) {
		for(int i=0;i<num;i++) {
			int idx = (i+front) % max;
			if(que[idx] == x) {
				return idx;
			}
		}
		return -1;
	}
	
	public int search(int x) {
		for(int i=0; i<num; i++) {
			int idx = ((i+front) % max);
			if(que[idx] == x) {
				return idx - front + 1;
			}
		}
		return -1;
	}
	
	public void clear() {
		num = front = rear = 0;
	}
	
	public int capacity() {
		return max;
	}
	
	public int size() {
		return num;
	}
	
	public boolean isEmpty() {
		return num<=0;
	}
	
	public boolean isFull() {
		return num >= max;
	}
	
	public void dump() {
		if(num <= 0) {
			System.out.println("큐가 비어 있습니다.");
		}else {
			for(int i=0; i<num; i++) {
				System.out.print(que[(i+front)%max] + " ");
			}
			System.out.println();
		}
	}
	
}
