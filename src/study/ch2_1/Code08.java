package study.ch2_1;

import java.util.Scanner;

public class Code08 {
	//다항함수 출력
	//creat f -> f=0
	//add f 2 3 -> 2x^3
	
	static Polynomial[] polys = new Polynomial[100]; //다항식 보관 자료구조
	static int n = 0; //저장된 다항식 갯수
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("$ ");
			String command = sc.next();
			if(command.equals("creat")) {
				char name = sc.next().charAt(0); //이름 생성
				//다항함수 생성
				polys[n] = new Polynomial();
				polys[n].name = name;
				polys[n].nTerms = 0; //항이 없는 함수
				polys[n].terms = new Term[100];
				
				
				
				n++;
				
			}else if(command.equals("add")) { // add f 2 3
				
				char name = sc.next().charAt(0);
				int index = find(name);
				if(index == -1) {
					System.out.println("no such polynomial");
				}else {
					int c = sc.nextInt();
					int e = sc.nextInt();
					addTerm(polys[index], c, e);
				}
				
			}else if(command.equals("calc")) {
				
				char name = sc.next().charAt(0);
				int index = find(name);
				if(index == -1) {
					System.out.println("no such polynomial");
				}else {
					int x = sc.nextInt();
					int result = calcPolynomial(polys[index], x);
					System.out.println(result);
				}
				
			}else if(command.equals("print")) {
				
				char name = sc.next().charAt(0);
				int index = find(name);
				if(index == -1) {
					System.out.println("no such polynomial");
				}else {
					printPolynomial(polys[index]);
				}
			}else if(command.equals("exit")) {
				break;
			}
			
			
			
		}
		
		sc.close();
	}

	private static int calcPolynomial(Polynomial p, int x) {
		int result = 0;
		for(int i=0; i<p.nTerms; i++) {
			result += calcTerm(p.terms[i], x);
		}
		return result;
	}

	private static int calcTerm(Term term, int x) {
		
		return (int) (term.coef * Math.pow(x, term.exp));
	}

	private static void printPolynomial(Polynomial p) {
		for(int i=0; i<p.nTerms; i++) {
			printTerm(p.terms[i]);
			System.out.print("+");
		}
		System.out.println();
		
	}

	private static void printTerm(Term term) {
		System.out.print(term.coef + "x^" + term.exp);
		
	}

	private static void addTerm(Polynomial p, int c, int e) {
		//다항함수 지수 내림차순
		//배열에 2x^3이 있고 4x^3을 추가하려고 하면 2에다 4를 더하기만 하면 됨
		
		int index=findTerm(p,e); //e의 제곱인 항이 있는지 검색
		if(index != -1) {
			p.terms[index].coef += c; //e의 제곱인 항이 있다면 계수만 더해줌
		}else {
			//삽입 알고리즘
			int i = p.nTerms -1;
			while(i >=0 && p.terms[i].exp < e) {
				p.terms[i+1] = p.terms[i]; //들어오려는 항의 지수가 더 크다면 앞의 항을 뒤로 한칸 
			}
			
			p.terms[i+1] = new Term();
			p.terms[i+1].coef = c;
			p.terms[i+1].exp = e;
			p.nTerms++;
		}
		
	}

	private static int findTerm(Polynomial p, int e) {
		for(int i=0; i<p.nTerms && p.terms[i].exp >=e; i++) { //내림차순으로 정렬되어있다면 e보다 작은 경우는 탐색 안해도됨
			if(p.terms[i].exp == e) {
				return i;
			}
		}
		return -1;
	}

	private static int find(char name) {
		for(int i=0; i<n; i++) {
			if(polys[i].name == name) {
				return i;
			}
		}
		return -1;
	}
}
