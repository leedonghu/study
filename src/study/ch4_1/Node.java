package study.ch4_1;

public class Node<T> {
	public T data;
	public Node<T> next; //다음 노드를 참조해야 함
	
	public Node(T item) {
		data = item;
		next = null;
	}
}
