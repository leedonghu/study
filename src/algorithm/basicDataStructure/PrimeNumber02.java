package algorithm.basicDataStructure;

public class PrimeNumber02 {
	public static void main(String[] args) {
		int counter = 0;
		int ptr = 0;
		int[] prime = new int[500];
		
		prime[ptr++] = 2;
		prime[ptr++] = 3;
		
		for(int n=5; n<= 1000; n += 2) {
			boolean flag = false;
			for(int i=1; prime[i] * prime[i] <= n; i++) {
				counter += 2;  //prime[i] * prime[i] 연산과 n%prime[i] 연산의 수행횟수를 더해줌
				if(n%prime[i] == 0) {
					flag =true;
					break;
				}
			}
			
			if(!flag) { //만약 prime[i]*prime[i] <= n 이 성립하지 않는다면 prime[i]*prime[i]연산의 횟수가 위쪽에서 세어지지 않기 때문에
				        //if문에서 세어줌
				prime[ptr++] = n;
				counter++;
			}
		}
		
		for(int i=0; i<ptr; i++) {
			System.out.println(prime[i]);
		}
		System.out.println("곱셈과 나눗셈을 수행한 횟수: " + counter); //3774로 줄어듬
	}
}
