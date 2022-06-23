package programmers;

public class ArcheryCompetition {
	
	static int[] solution(int n, int[] info) {
		int api = 0;
		int rion = 0;;
		int point1 = 10;
		int point2 = 10;
		int[] result = {0,2,2,0,1,0,0,0,0,0,0};
		
		
		for(int i=0; i<info.length; i++) {
			if(info[i] >= result[i] && info[i] != 0) {
				api += point1;
				point1--;
			}else if(info[i] < result[i]) {
				rion += point1;
				point1--;
			}
		}
		
		System.out.println(api);
		System.out.println(rion);
		return null;
	}
	
	public static void main(String[] args) {
		int[] info = {2,1,1,1,0,0,0,0,0,0,0};
		int n = 5;
		solution(n, info);
	}
}
