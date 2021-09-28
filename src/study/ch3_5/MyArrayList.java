package study.ch3_5;

import java.util.Arrays;

public class MyArrayList<T> {
	
	private static final int INIT_CAPACITY = 10;
	private T [] theData;
	private int size;
	private int capacity = 0;
	
	public MyArrayList() {
		theData = (T[])new Object[INIT_CAPACITY]; //new 명령어 다음에 실제 존재하는 타입을 사용해야 함 임의의 T쓸수 없음
		size = 0;
	}
	
	public void add(int index, T anEntry) {
		
		if(index<0 || index >size) {//적절하지 못한 상황, 유효하지 않은 상황, error or exception , exception handling
			throw new ArrayIndexOutOfBoundsException(index);
		}
		
		if(size >=capacity) {
			reallocate();
		}
		
		for(int i=size-1; i>=index; i--) {
			theData[i+1] = theData[i];
		}
		theData[index]= anEntry;
		size++;
	}
	

	public void add(T anEntry) {
		add(size, anEntry);
	}
	
	public int size() {
		return size;
	}
	
	public int indexOf(T anEntry) {
		for(int i=0; i<size; i++) {
			if(theData[i].equals(anEntry)) {
				return i;
			}
		
		}
		return -1;
	}
	
	public T get(int index) {
		if(index<0 || index >size) {//적절하지 못한 상황, 유효하지 않은 상황, error or exception , exception handling
			throw new ArrayIndexOutOfBoundsException(index);
		}
		return theData[index];
	}
	
	public T set(int index, T newValue) {
		if(index<0 || index >size) {//적절하지 못한 상황, 유효하지 않은 상황, error or exception , exception handling
			throw new ArrayIndexOutOfBoundsException(index);
		}
		
		T oldValue = theData[index];
		theData[index] = newValue;
		return oldValue;
	}
	
	private void reallocate() {
		capacity *= 2;
		theData = Arrays.copyOf(theData, capacity);
	}
}
