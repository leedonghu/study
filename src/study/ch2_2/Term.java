package study.ch2_2;



public class Term {
	public int coef;
	public int expo;
	
	public int calcTerm(int x) {
		
		return (int) (coef * Math.pow(x, expo));
	}
	
	public void printTerm() {
		System.out.print(coef + "x^" + expo);
		
	}
	
}
