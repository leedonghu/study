package algorithm.stackAndQueue;

public class QueQ4 {
	private int max;
	private int num;
	private int[] que;
	
	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {
			System.out.println("큐가 비어있습니다.");
		}
	}
	
	public class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() {
			System.out.println("큐가 가득찼습니다.");
		}
	}
	
	public QueQ4(int capacity) {
		num = 0;
		max = capacity;
		que = new int[max];
	}
	
	public int enque(int x) throws OverflowIntQueueException {
		if(num >= max) {
			throw new OverflowIntQueueException();
		}
		que[num++] = x;
		return x;
	}
	
	public int deque() throws EmptyIntQueueException {
		if(num <= 0) {
			throw new EmptyIntQueueException();
		}
		
		int n = que[0];
		num--;
		for(int i=0; i<num; i++) {
			que[i] = que[i+1];
		}
		
		return n;
	}
}
