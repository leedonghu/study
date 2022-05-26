package programmers;

public class FailRatio {
	public static void main(String[] args) {
		int[] stages = {4,4,4,4,4,};
		int n = 4;
		solution(stages, n);
	}
	
	static int[] solution(int[] stages, int n) {
		double[] arr = new double[n];
		int[] result = new int[n];
		for(int i=1; i<= n; i++) {
			int remain = 0;
			int clear = 0;
			for(int j=0; j<stages.length; j++) {
				if(stages[j] == i) {
					remain++;
				}
				if(stages[j] >= i) {
					clear++;
				}
			}
			
			arr[i-1] = (double)(remain) / (double)(clear);
			result[i-1] = i;
		}
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=arr.length-1;j>i;j--) {
				if(arr[j-1] < arr[j]) {
					double tmp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = tmp;
					
					int tmp2 = result[j-1];
					result[j-1] = result[j];
					result[j] = tmp2;
				}else if(arr[j-1] == arr[j]) {
					if(result[j-1] > result[j]) {
						int tmp = result[j-1];
						result[j-1] = result[j];
						result[j] = tmp;
					}
				}
			}
		}
		
		
		return result;
	}
}
