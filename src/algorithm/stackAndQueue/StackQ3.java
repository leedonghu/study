package algorithm.stackAndQueue;

public class StackQ3 {
	private int max;
	private int lPtr;
	private int rPtr;
	private int[] stk;
	
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {
			System.out.println("스택이 비어있습니다");
		}
	}
	
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {
			System.out.println("스택이 가득찼습니다.");
		}
	}
	
	public StackQ3(int capacity) {
		this.lPtr = 0;
		this.rPtr = capacity - 1;
		this.max = capacity;
		stk = new int[max];
	}
	
	public int leftPush(int x) throws OverflowIntStackException {
		if(lPtr >= rPtr) {
			throw new OverflowIntStackException();
		}
		return stk[lPtr++] = x;
	}
	
	public int rightPush(int x) throws OverflowIntStackException {
		if(rPtr <= lPtr) {
			throw new OverflowIntStackException();
		}
		return stk[rPtr--] = x;
	}
	
	public int leftPop() throws EmptyIntStackException {
		if(lPtr <= 0) {
			throw new EmptyIntStackException();
		}
		return stk[--lPtr];
	}
	
	public int rightPop() throws EmptyIntStackException {
		if(rPtr >= max) {
			throw new EmptyIntStackException();
		}
		return stk[++rPtr];
	}
	
	public int leftPeek() throws EmptyIntStackException {
		if(lPtr <= 0) {
			throw new EmptyIntStackException();
		}
		return stk[lPtr - 1];
	}
	
	public int rightPeek() throws EmptyIntStackException {
		if(rPtr >= max) {
			throw new EmptyIntStackException();
		}
		return stk[rPtr + 1];
	}
	
	public String indexOf(int x) {
		int lx = -1;
		int rx = -1;
		for(int i=lPtr - 1; i>=0; i--) {
			if(stk[i] == x) {
				lx = i;
			}
		}
		
		for(int i=rPtr + 1; i<=max; i++) {
			if(stk[i] == x) {
				rx = i;
			}
		}
		
		return lx == -1 && rx == -1 ? "검색하는 값이 없습니다" : lx + " " + rx;
	}
	
	public void clear() {
		lPtr = 0;
		rPtr = max;
	}
	
	public int capacity() {
		return max;
	}
	
	public int size() {
		return lPtr +(max - 1 - rPtr);
	}
	
	public boolean isEmpty() {
		return lPtr == 0 && rPtr == max;
	}
	
	public boolean isFull() {
		return lPtr + rPtr == max;
	}
	
	public void dump() {
		if(lPtr <=0 && rPtr >= max) {
			System.out.println("스택이 비어있습니다.");
		}else {
			for(int i=0; i<lPtr; i++) {
				System.out.println("왼쪽 스택 : " + "stk[ " + i + " ]" + stk[i]);
			}
			System.out.println();
			for(int i=max-1; i>rPtr; i--) {
				System.out.println("오른쪽 스택 : " + "stk[ " + i + " ]" + stk[i]);
			}
		}
	}
}
