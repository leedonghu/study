package algorithm.tree;

import java.util.Comparator;

public class BinTree<K,V> {
	
	static class Node<K,V>{
		private K key;
		private V data;
		private Node<K,V> left; //왼쪽 자식 노드
		private Node<K,V> right; //오른쪽 자식 노드
		
		Node(K key, V data, Node<K,V> left, Node<K,V> right){
			this.key = key;
			this.data = data;
			this.left = left;
			this.right = right;
		}
		
		K getKey() {
			return key;
		}
		
		V getValue() {
			return data;
		}
		
		void print() {
			System.out.println(data);
		}
	}
	
	private Node<K,V> root; //루트
	private Comparator<? super K> comparator = null; // 비교자, 키 값을 비교
	
	public BinTree() { //노드가 없는 이진트리 생성
		root = null;   //노드 키값의 대소관계를 판단할 때 자연순서에 따라 수행
	}                  //comparable을 구현하고 있는 Integer나 String 사용
	                   //comparator은  null
	public BinTree(Comparator<? super K> c) { //비교자를 통헤 대소관계 판단
		this();
		comparator = c;
	}
	
	private int comp(K key1, K key2) {
		return (comparator == null) ? ((Comparable<K>) key1).compareTo(key2) : comparator.compare(key1, key2);
	}
	
	public V search(K key) {
		Node<K,V> p = root;
		
		while(true) {
			if(p == null)
				return null;
			int cond = comp(key,p.getKey());
			if(cond == 0)
				return p.getValue(); //검색 성공
			else if(cond < 0) //key쪽이 작으면
				p = p.left; //왼쪽 서브트리에서 검색
			else
				p = p.right; //크면 오른쪽 서브트리에서 검색
		}
	}
	
	public void add(K key, V data) {
		if(root == null) {
			root = new Node<K,V>(key, data, null, null);
		}else {
			addNode(root, key, data);
		}
	}
	
	public void addNode(Node<K,V> node , K key, V data) {
		int cond = comp(key, node.getKey());
		
		if(cond == 0) {
			return;
		}else if(cond < 0) {
			if(node.left == null) {
				
				node.left = new Node<K,V>(key, data, null, null);
			}else {
				addNode(node.left, key, data);
			}
		}else {
			if(node.right == null) {
				node.right = new Node<K,V>(key, data, null, null);
			}else {
				addNode(node.right, key, data);
			}
		}
	}
	
	public boolean remove(K key) {
		Node<K,V> p = root;
		Node<K,V> parent = null;
		boolean isLeftChild = true;
		
		
		//삭제할 키를 검색, 검색에 성공하면 p는 찾는 노드를 참조, parent는 부모노드 참조
		while(true) {
			if(p == null) {
				return false;
			}
			int cond = comp(key, p.getKey());
			if(cond == 0) {
				break;
			}else {
				parent = p;
				if(cond < 0) {
					isLeftChild = true;
					p = p.left;
				}else {
					isLeftChild = false;
					p = p.right;
				}
			}
		}
		//자식 노드가 없는 노드를 삭제, 자식노드가 1개인 노드를 삭제
		if(p.left == null) { //왼쪽에 자식이 없다면
			if(p == root) {
				root = p.right;
			}else if(isLeftChild) {
				parent.left = p.right; //부모의 왼쪽 포인터가 오른쪽 자식을 가리킴
			}else {
				parent.right = p.right; //부모의 오른쪽 포인터가 오른쪽 자식을 가리킴
			}
		}else if(p.right == null) {
			if(p == root) {
				root= p.left;
			}else if(isLeftChild) {
				parent.left = p.left;
			}else {
				parent.right = p.left;
			}
		}else {
			//자식노드가 2개인 노드 삭제
			parent = p;
			Node<K,V> left = p.left; //서브 트리 가운데 가장 큰 노드
			isLeftChild = true;
			while(left.right != null) { //가장 큰 노드 left를 검색
				parent = left;
				left = left.right;
				isLeftChild = false;
			}
			p.key = left.key;
			p.data = left.data;
			if(isLeftChild) {
				parent.left = left.left;
			}else {
				parent.right = left.left;
				
			}
		}
		return true;
	}
	
	private void printSubTree(Node node) {
		if(node != null) {
			printSubTree(node.left); //왼쪽 서브 트리를 키 값의 오름차순으로 출력
			System.out.println(node.key + " " + node.data);
			printSubTree(node.right); //오른쪽 서브 트리를 기 값의 오름차순으로 출력
		}
	}
	
	public void print() {
		printSubTree(root);
	}
	
}
