package algorithm.stackAndQueue;

public class IntDeque {
	private int max;
	private int num;
	private int front;
	private int rear;
	private int[] que;
	
	public class EmptyException extends RuntimeException {
		public EmptyException() {
			System.out.println("큐가 비었습니다.");
		}
	}
	
	public class OverflowException extends RuntimeException {
		public OverflowException() {
			System.out.println("큐가 가득찼습니다.");
		}
	}
	
	public IntDeque(int capacity) {
		max = capacity;
		num = front = rear = 0;
		que = new int[max];
	}
	
//	public int leftEnque(int x) throws OverflowException {
//		if(num >= max) {
//			throw new OverflowException();
//		}
//		
//		que[front++] = x;
//		
//	}
}
