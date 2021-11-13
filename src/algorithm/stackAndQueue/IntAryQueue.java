package algorithm.stackAndQueue;

public class IntAryQueue {
	private int max;
	private int num; //현재 데이터 수
	private int[] que;
	
	public class EmptyIntAryQueueException extends RuntimeException{
		public EmptyIntAryQueueException() {}
	}
	
	public class OverflowIntAryQueueException extends RuntimeException{
		public OverflowIntAryQueueException() {}
	}
	
	public IntAryQueue(int capacity) {
		max = capacity;
		num =0;
		try {
			que = new int[max];
		}catch(OutOfMemoryError e) {
			max = 0;
		}
	}
	
	public int enque(int x) throws OverflowIntAryQueueException {
		if(num >= max) {
			throw new OverflowIntAryQueueException();
		}
		que[num++] = x;
		return x;
	}
	
	public int deque() throws EmptyIntAryQueueException {
		if(num<=0) {
			throw new EmptyIntAryQueueException();
		}
		int x = que[0];
		for(int i=0; i<num; i++) {
			que[i] = que[i+1];
			num--;
		}
		return x;
	}
	
	public int peek() throws EmptyIntAryQueueException {
		if(num <= 0) {
			throw new EmptyIntAryQueueException();
		}
		
		return que[0];
	}
	
	public int indexOf(int x) {
		for(int i=0; i<num; i++) {
			if(que[i] == x) {
				return i;
			}
		}
		
		return -1;
	}
	
	public void clear() {
		num = 0;
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
			System.out.println("큐가 비어 있습니다.");
		}else {
			for(int i=0 ;i<num; i++) {
				System.out.print(que[i] + " ");
				
			}
			System.out.println();
		}
	}
}
