package algorithm.stackAndQueue;

public class IntStack {
	private int max;
	private int ptr;
	private int[] stk;
	
	//실행 시 예외: 스택이 비어있음
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {
			
		}
	}
	
	//실행 시 예외: 스택이 가득 참
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {
			
		}
	}
	
	public IntStack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = new int[max];
		}catch(OutOfMemoryError e) {
			max = 0;
		}
	}
	
	public int push(int x) throws OverflowIntStackException {
		if(ptr >= max) { //스택 가득참
			throw new OverflowIntStackException();
		}
		return stk[ptr++] = x; // 0일때 넣고 1 증가
		                       // ptr이 비어있는 index 1을 가리키고 있음
	}
	
	public int pop() throws EmptyIntStackException {
		if(ptr <= 0) {
			throw new EmptyIntStackException();
		}
		return stk[--ptr]; //1을 감소시킨 index에 해당하는 값을 제거
		                   //ptr 을 1 감소시킴
	}
	
	public int peek() throws EmptyIntStackException {
		if(ptr <= 0) {
			throw new EmptyIntStackException();
		}
		return stk[ptr -1];
	}
	
	public int indexOf(int x) {
		for(int i=ptr -1; i>=0; i--) {
			if(stk[i] == x) {
				return i;
			}
		}
		return -1;
	}
	
	//스택을 비움
	public void clear() {
		ptr = 0;
	}
	
	//스택의 용량을 반환
	public int capacity() {
		return max;
	}
	
	//스택에 쌓여있는 데이터 수를 반환
	public int size() {
		return ptr;
	}
	
	public boolean isEmpty() {
		return ptr <= 0;
	}
	
	public boolean isFull() {
		return ptr >= max;
	}
	
	//스택 안의 모든 데이터를 바닥 -> 꼭대기 순으로 출력
	public void dump() {
		if(ptr <= 0) {
			System.out.println("스택이 비어 있습니다.");
		}else {
			for(int i=0; i<ptr; i++) {
				System.out.print(stk[i] + " ");
			}
			System.out.println();
		}
	}
}
