package study.ch2_2;

public class Term2 {
	public int coef;
	public int expo;
	
	public Term2(int c, int e) {
		coef = c;
		expo = e;
	}
	
	public int calcTerm(int x) {
		
		return (int) (coef * Math.pow(x, expo));
	}
	
	public void printTerm() {
		System.out.print(coef + "x^" + expo);
		
	}
}
