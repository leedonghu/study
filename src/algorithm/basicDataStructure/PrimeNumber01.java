package algorithm.basicDataStructure;

public class PrimeNumber01 {
	public static void main(String[] args) {
		int counter = 0; //나눗셈 횟수
		int ptr = 0; //찾은 소수의 개수
		int[] prime = new int[500]; //소수 저장
		
		prime[ptr++] = 2; //소수 2 저장
		
		for(int n=3; n<=1000; n+=2) { //3부터 홀수만 대상으로
			int i;
			for(i=1; i<ptr; i++) { //이미 찾은 소수로 나누어봄
				counter++;
				if(n%prime[i] == 0) {
					break;  //소수가 아니면 멈춤
				}
			}
			if(ptr == i) { //마지막까지 나누어 떨어지지 않음
				prime[ptr++] = n;
			}
		}
		
		for(int i=0; i<ptr; i++) {
			System.out.println(prime[i]);
		}
		System.out.println("나눗셈을 수행한 횟수: " + counter); //14622번만에 완료
	}
}
