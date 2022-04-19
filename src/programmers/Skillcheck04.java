package programmers;

public class Skillcheck04 {
	public static void main(String[] args) {
		int n = 5;
		int prevPrev=0;
		int prev=1;
		int curNum = 0;
		for(int i=0; i<n-1; i++) {
			curNum = prevPrev + prev;
			prevPrev = prev;
			prev = curNum;
		}
		System.out.println(curNum % 1234567);
	}
}
