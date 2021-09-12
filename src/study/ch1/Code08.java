package study.ch1;

public class Code08 {
	public static void main(String[] args) {

		//1~100000 사이 소수찾기

		// 2~n/2사이의 수로 나눔
		// 8의 약수가 4보다 클 수는 없음
		//sqrt(n) 루트n 약수는 두 수의 곱인데 약수가 루트n보다 클 수 없음
		//for문이 도는 조건은 n이 i의 제곱보다 작고 소수가 아닐때까지

		for(int n=2; n<=100000; n++) {

			boolean is = true;
			for(int i=2; i*i<= n && is; i++) {
				if(n % i==0) {
					//소수가 아닐때 for문 멈추게
					is = false;
					break;
				}
			}
			if(is) {
				System.out.println(n);
			}
		}



	}
}
