package programmers;

public class WeeklyChallenge2 {
	public static void main(String[] args) {
		int[][] data = {{100, 90, 98, 88, 65}, {50, 45, 99, 85, 77}, {47, 88, 95, 80, 67}, {61, 57, 98, 88, 65}, {24, 90, 94, 75, 65} };
 		
		for(int i=0; i<data.length; i++) {
			System.out.println(solution(data)[i]);
		}
	}
	
	static double[] solution(int[][] scores) {
        String answer = "";
        double[] avgArr = new double[scores.length]; 
        double sum = 0;
        
        //평균을 구하자 
        //clear
        for(int i=0; i<scores.length; i++) {
        	
        	int max = scores[i][0];
        	int min = scores[i][0];
        	int maxCount = 0;
        	int minCount = 0;
        	for(int j=0; j<scores.length; j++) {
        		
        			
    			if(scores[i][j]>max) { //최댓값
    				max = scores[i][j];
    			}
    			if(scores[i][j]<min) { //최솟값
    				min = scores[i][j];
    			}
        		
        		sum += scores[i][j];
        		
        	}
        	avgArr[i] = sum / scores.length;
        	sum = 0;
        }
        
        return avgArr;
    }
}
