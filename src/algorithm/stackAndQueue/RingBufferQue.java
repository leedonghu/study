package algorithm.stackAndQueue;

public class RingBufferQue {
	private int max;
	private int front;
	private int rear;
	private int num;
	private int[] que;
	
	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {
			System.out.println("큐가 비었습니다.");
		}
		
	
	}
	
	public class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() {
			System.out.println("큐가 가득찼습니다.");
		}
	}
	
	public RingBufferQue(int capacity) {
		num = front = rear =0;
		max = capacity;
		que = new int[capacity];
	}
	
	public int enque(int x) throws OverflowIntQueueException {
		if(num>= max) {
			throw new OverflowIntQueueException();
		}
		que[rear++] = x;
		num++;
		//끝이 max보다 커지면 존재하지 않는 배열이 생김
		if(rear == max) {
			rear = 0;
		}
		
		return x;
	}
	
	public int deque() throws EmptyIntQueueException{
		if(num <= 0) {
			throw new EmptyIntQueueException();
		}
		
		int x = que[front++]; //맨 앞쪽부터 하나씩 나가게 되니까 front 증가
		
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
		for(int i=0; i<num; i++) {
			int idx = (i + front) % max;
			if(que[idx] == x) {
				return idx;
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
		return num <= 0;
	}
	
	public boolean isFull() {
		return num >= max;
	}
	
	public void dump() {
		if(num <= 0) {
			System.out.println("큐가 비어있습니다.");
		}
		
		for(int i=0; i<num; i++) {
			System.out.print(que[(i+front) % max] + " ");
		}
		System.out.println();
	}
}
