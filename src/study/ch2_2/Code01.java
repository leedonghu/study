package study.ch2_2;

import java.util.Scanner;

import study.ch2_2.Polynomial;
import study.ch2_2.Term;

public class Code01 {
	//클래스는 데이터뿐만 아니라 관련이 깊은 메소드도 묶어둘 수 있음
	//응집도를 높이고 결합도(클래스와 클래스 사이 관련도)를 낮춤
	
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
				polys[n].terms = new Term[100];
				polys[n].nTerms = 0; //항이 없는 함수
				
				
				
				n++;
				
			}else if(command.equals("add")) { // add f 2 3
				
				char name = sc.next().charAt(0);
				int index = find(name);
				if(index == -1) {
					System.out.println("no such polynomial");
				}else {
					int c = sc.nextInt();
					int e = sc.nextInt();
					polys[index].addTerm(c, e);
				}
				System.out.println("aaa");
				
			}else if(command.equals("calc")) {
				
				char name = sc.next().charAt(0);
				int index = find(name);
				if(index == -1) {
					System.out.println("no such polynomial");
				}else {
					int x = sc.nextInt();
					int result = polys[index].calcPolynomial(x);
					System.out.println(result);
				}
				
			}else if(command.equals("print")) {
				
				char name = sc.next().charAt(0);
				int index = find(name);
				if(index == -1) {
					System.out.println("no such polynomial");
				}else {
					polys[index].printPolynomial();
				}
			}else if(command.equals("exit")) {
				break;
			}
			
			
			
		}
		
		sc.close();
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
