package programmers;

public class SkillCheck06 {
	public static void main(String[] args) {
		int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};
		solution(80, dungeons);
	}
	
	public static int solution(int k, int[][] dungeons) {
		
		int[] arr1 = new int[dungeons.length];
		for(int i=0; i<dungeons.length; i++) {
			arr1[i] = k - dungeons[i][1];
			System.out.println(i + "  " + arr1[i]);
		}
		return 0;
	}
}
