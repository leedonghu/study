package programmers;

public class IntegerDescending {
	public static void main(String[] args) {
		long n = 118372;
		System.out.println(solution(n));
	}
	
	static long solution(long n) {
		StringBuilder sb = new StringBuilder();
		String str = String.valueOf(n);
		
		char[] arr = str.toCharArray();
		for(int i = 0; i<arr.length-1; i++) {
			for(int j=arr.length-1; j>i; j--) {
				if(arr[j-1]< arr[j]) {
					char tmp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			sb.append(arr[i]);
		}
		
		long answer = Long.parseLong(sb.toString());
		return answer;
	}
}
