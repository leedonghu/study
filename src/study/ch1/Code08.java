package study.ch1;

public class Code08 {
	public static void main(String[] args) {
		
		//1~100000 사이 소수찾기
		
		// 2~n/2사이의 수로 나눔
		// 8의 약수가 4보다 클 수는 없음
		int n = 11023;
		
		boolean is = true;
		for(int i=2; i<= n/2; i++) {
			if(n % i==0) {
				//소수가 아닐때 for문 멈추게
				is = false;
				break;
			}
		}
		
		//for문을 도는 조건문에서 소수가 아닐때 멈추게 함
//		for(int i=2; i<=n/2 && is; i++) {
//			if(n % i == 0) {
//				is = false;
//			}
//		}
		
		if(is) {
			System.out.println(n);
		}
	}
}
