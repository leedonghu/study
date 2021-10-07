package study.ch4_3;

public class Term {
	public int coef;
	public int expo;
	
	public Term(int c, int e) {
		coef = c;
		expo = e;
	}
	
	public int calc(int x) {
		return coef *(int) Math.pow(x, expo);
	}
	
	public String toString() {
		if(coef == 1) {
			return "x^" + expo;
		}else {
			
			return coef + "x^" + expo;
		}
	}
}
