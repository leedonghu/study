package programmers;

public class MinimumRect {
	public static void main(String[] args) {
		int[][] sizes = {{10,7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
		System.out.println(solution(sizes));
	}
	
	static int solution(int[][] sizes) {
		
		
		for(int i =0; i<sizes.length; i++) {
			if(sizes[i][0] < sizes[i][1]) {
				int t = sizes[i][0];
				sizes[i][0] = sizes[i][1];
				sizes[i][1] = t;
			}
		}
		
		int max1 = 0;
		int max2 = 0;
		for(int i=0; i<sizes.length; i++) {
			if(sizes[i][0] > max1) {
				max1 = sizes[i][0];
			}
			if(sizes[i][1] > max2) {
				max2 = sizes[i][1];
			}
		}
		
		return max1 * max2;
	}
}
