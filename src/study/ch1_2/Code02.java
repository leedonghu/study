package study.ch1_2;

public class Code02 {
	//소수찾기 프로그램
	//메소드 이용
	
	public static void main(String[] args) {
		
		for(int i=0; i<100000; i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}
	
	static boolean isPrime(int n) {
		if(n <2) {
			return false; //n이 1일때를 걸러줌
		}
		
		for(int i=2; i*i <=n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}
