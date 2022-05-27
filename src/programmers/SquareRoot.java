package programmers;

public class SquareRoot {
	public static void main(String[] args) {
		long n = 3;
		System.out.println(solution(n));
	}
	
	static long solution(long n) {
		long answer = (long)Math.sqrt(n);
        if(n == Math.pow(answer, 2)){
            return (long)Math.pow(answer+1, 2);
        }else{
            return -1;
        }
	}
}
