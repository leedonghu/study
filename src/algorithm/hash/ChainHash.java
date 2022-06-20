package algorithm.hash;

public class ChainHash<K, V> {
	
	class Node<K,V>{
		private K key;
		private V data;
		private Node<K,V> next;
		
		Node(K key, V data, Node next){
			this.key = key;
			this.data = data;
			this.next = next;
		}
		
		K getKey() {
			return key;
		}
		
		V getValue() {
			return data;
		}
		
		public int hashCode() {
			return key.hashCode();
		}
	}
	
	private int size;
	private Node<K,V>[] table;
	
	public ChainHash(int capacity) {
		try {
			table = new Node[capacity];
			this.size = capacity;
		}catch (OutOfMemoryError e) {
			// TODO: handle exception
			this.size = 0;
		}
	}
	
	public int hashValue(Object key) {
		return key.hashCode() % size;
	}
	
	public V search(K key) {
		int hash = hashValue(key); //검색할 데이터의 해시 값
		Node<K,V> p = table[hash]; //선택노드
		
		while(p != null) {
			if(p.getKey().equals(key))
				return p.getValue();
			p = p.next;
		}
		return null;
	}
	
	public int add(K key, V data) {
		int hash = hashValue(key);
		Node<K,V> p =table[hash];
		
		while(p != null) {
			if(p.getKey().equals(key))
				return 1;
			p = p.next;
		}
		Node<K,V> temp = new Node<K,V>(key, data, table[hash]); //기존에 있던 노드에 대한 참조를 받음
		table[hash] = temp; //새로 만들어진 노드를 맨 앞에 채워넣음
		return 0;
	}
	
	public int remove(K key) {
		int hash = hashValue(key);
		Node<K,V> p = table[hash];
		Node<K,V> pp = null; //바로 앞의 선택 노드
		
		while(p != null) {
			if(p.getKey().equals(key)) { //찾으면
				if(pp == null) {
					table[hash] = p.next;
				}else {
					pp.next = p.next;
				}
				return 0;
			}
			
			pp = p;
			p = p.next; //다음 노드를 가리킴
		}
		return 1;
	}
	
	public void dump() {
		for(int i=0; i<size; i++) {
			Node<K,V> p = table[i];
			System.out.printf("%02d ", i);
			while(p != null) {
				System.out.printf("-> %s (%s) " , p.getKey(), p.getValue());
				p = p.next;
			}
			System.out.println();
 		}
	}
}
