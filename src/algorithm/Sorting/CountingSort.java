package algorithm.Sorting;

public class CountingSort {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		int[] arr = {1,5,1,4,3};
		int max = Integer.MIN_VALUE; //카운팅 배열과 누적합 배열의 최대 인덱스 값을 구함
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		int[] counting = new int[max+1];
		int[] sum = new int[max+1];
		int[] ans = new int[arr.length];
		//1단계
		//카운팅 배열
		for(int i=0; i<arr.length; i++) {
			counting[arr[i]]++;
			sum[arr[i]]++;
		}
		
		//2단계
		//누적합 배열
		for(int i=1; i<counting.length; i++) {
			sum[i] += sum[i-1];
		}
		
		//3단계
		for(int i = ans.length-1; i>=0; i--) {
			int value = arr[i];
			counting[value]--;
			sum[value]--;
			ans[sum[value]] = value;
		}
		for(int i=0; i<ans.length; i++) {
			sb.append(ans[i] + " ");
		}
		
		System.out.println(sb);
	}
}
