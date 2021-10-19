package baekjoon;

public class Q4673 {
	public static void main(String[] args) {
		boolean[] answer = new boolean[10001];
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=10000; i++) {
			int n = selfNumber(i);
			
			if(n<=10000) {
				answer[n] = true; //생성자가 있는 값의 자리를 true로 바꿔줌
			}
		}
		
		for(int i=1; i<=10000; i++) {
			if(answer[i] == false) {
				sb.append(i).append("\n");
			}
		}
		
		System.out.println(sb.toString());
		
	}
	
	public static int selfNumber(int num) {
		int sum = num;
		
		while(num != 0) {
			sum = sum +(num % 10); //4 -> 3-> 2-> 1을 더해줌
			num = num/10; //각 자리수 만큼 sum에 더해주기 위해 1234 -> 123 -> 12-> 1 ->0 , 0일때 멈춤
		}
		return sum; //리턴해준 값은 생성자가 있는 값
	}
}
