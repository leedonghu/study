package study.ch2_3;

public class Polynomial2 {
	public char name;
	public Term2[] terms;
	public int  nTerms;
	
	public Polynomial2() {
		nTerms = 0;
		terms = new Term2[100];
	}
	
	public Polynomial2(char name) {
		this.name = name;
		nTerms = 0;
		terms = new Term2[100];
	}
	
	public void printPolynomial() {
		for(int i=0; i<nTerms; i++) {
			terms[i].printTerm();
			System.out.print("+");
		}
		System.out.println();
		
	}
	
	public int calcPolynomial( int x) {
		int result = 0;
		for(int i=0; i<nTerms; i++) {
			result += terms[i].calcTerm(x);
		}
		return result;
	}
	
	public int findTerm(int e) {
		for(int i=0; i<nTerms && terms[i].expo >=e; i++) { //내림차순으로 정렬되어있다면 e보다 작은 경우는 탐색 안해도됨
			if(terms[i].expo == e) {
				System.out.println(i);
				return i;
			}
		}
		System.out.println("-1");
		return -1;
	}
	
	public void addTerm(int c, int e) {
		//다항함수 지수 내림차순
		//배열에 2x^3이 있고 4x^3을 추가하려고 하면 2에다 4를 더하기만 하면 됨
		
		int index=findTerm(e); //e의 제곱인 항이 있는지 검색
		if(index != -1) {
			terms[index].coef += c; //e의 제곱인 항이 있다면 계수만 더해줌
			System.out.println(terms[index].coef);
		}else {
			//삽입 알고리즘
			int i = nTerms -1;
			while(i >=0 && terms[i].expo < e) {
				terms[i+1] = terms[i]; //들어오려는 항의 지수가 더 크다면 앞의 항을 뒤로 한칸 
				i--;
			}
			
			terms[i+1] = new Term2(c , e);

			nTerms++;
		}
		System.out.println("gogo");
		
	}
}
