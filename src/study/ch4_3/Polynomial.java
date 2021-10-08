package study.ch4_3;

import java.util.Iterator;

public class Polynomial {
	public char name;
	public MySingleLinkedList<Term> terms;
	
	public Polynomial(char name) {
		this.name = name;
		terms = new MySingleLinkedList<Term>();
	}
	
	public void addTerm(int coef, int expo) {
		if(coef == 0) {
			return;
		}
		
		Node<Term> p = terms.head, q = null;
		while(p != null && p.data.expo > expo ) { //차수가 같거나 작아지면 멈춤, 내림차순으로 정렬이기 때문에
			q = p;
			p = p.next;
		}
		
		if(p != null && p.data.expo == expo) {
			p.data.coef += coef; //지수가 같으면 계수만 더해주면 됨
			if(p.data.coef == 0) {
				//remove node 계수가 0이면 항 삭제
				if(q == null) {
//					terms.removeFirst();
				}else {
					
					terms.removeAfter(q);
				}
			}
		}else {//지수가 더 작을때 뒤에 추가
			Term t = new Term(coef, expo);
			if(q == null) {
//				terms.addFirst(t);
			}else {
				
				terms.addAfter(q, t);
			}
		}
	}
	
	public int calc(int x) {
		int result = 0;
		
//		Node<Term> p = terms.head;
//		while(p != null) {
//			result += p.data.calc(x);
//			p = p.next;
//		}
		Iterator<Term> iter = terms.iterator();
		while(iter.hasNext()) {
			Term t = iter.next();
			result += t.calc(x);
		}

		return result;
	}
	
	public String toString() {
		String result = "";
		Iterator<Term> iter = terms.iterator();
		while(iter.hasNext()) {
			Term t = iter.next();
			result += ("+"+ t.toString());
		}
		return result;
	}
}
