package programmers;



public class FunctionDevelopment {
	public static void main(String[] args) {
		int[] progresses = {93, 30, 55};
		int[] speeds = {1, 30, 5};
		
		int[] answer = solution(progresses, speeds);
		
		for(int i=0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
		
	}
	
	public static int[] solution(int[] progresses, int[] speeds) {
		int[] answer = new int[progresses.length];
		
		int[] leftDayArr = new int[progresses.length];
		
		for(int i=0; i<progresses.length; i++) {
			int leftDay = 100 - progresses[i];
			if(leftDay % speeds[i] == 0) {
				leftDayArr[i] = leftDay / speeds[i];
			}else {
				leftDayArr[i] = (leftDay / speeds[i]) + 1;
			}
		}
		
//		for(int i=0; i<progresses.length; i++) {
//			System.out.println(leftDayArr[i]);
//		}
		
		int first = leftDayArr[0];
		int n = 0;
		int k = 0;
		for(int i=0; i<leftDayArr.length; i++) {
			if(first >= leftDayArr[i] ) {
				n++;
			}else if(first < leftDayArr[i]){
				first = leftDayArr[i];
				answer[k] = n;
				n = 1;
				k++;
			}
		}
		answer[k] = n;
		
//		
		int[] answerArr = new int[k+1];
		for(int i=0; i<answerArr.length; i++) {
			answerArr[i] = answer[i];
			
		}
		
		
		return answerArr;
		
	}
}
