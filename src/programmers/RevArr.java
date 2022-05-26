package programmers;

public class RevArr {
	public static void main(String[] args) {
		long n = 12345;
		solution(n);
	}
	
	static int[] solution(long n) {
		int x = 0;
		long nx = n;
		while(n >0) {
			n = n /10;
			x++;
		}
		
		int[] arr = new int[x];
		int i =0;
		while(nx > 0) {
			arr[i] = (int)(nx  % 10);
			nx = nx / 10;
			i++;
		}
		
		return arr;
	}
}
