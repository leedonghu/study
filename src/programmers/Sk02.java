package programmers;

public class Sk02 {
	public static void main(String[] args) {
		int[] periods = {24, 59, 59, 60};
		int[][] payments = {{50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000,},
				{50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000,},
				{350000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000},
				{50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000,}};
		int[] estimates = {350000, 50000, 40000, 50000};
		int[] answer = solution(periods, payments, estimates);
		for(int i=0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
	}
	
	static int[] solution(int[] periods, int[][] payments, int[] estimates) {
		int[][] vip = {{24,900000}, {60, 600000}};
		int[] answer = new int[2];
		
		for(int i=0; i<payments.length; i++) {
			
			int sum01 = 0;
			int sum02 = 0;
			
			if(periods[i] >= 23) {
				for(int k=0; k<payments[0].length;k++) {
					sum01 += payments[i][k];
						
				}
				sum02 = sum01;
				sum02 += estimates[i];
				sum02 -= payments[i][0];
			}
			
			System.out.println(i+" " +sum01);
			System.out.println(i+" " +sum02);
			
			if( (periods[i] >=24 && sum01< 900000)) {
				if(sum02 >= 900000 || periods[i] == 59 && sum02 >= 600000) {
					answer[0]++;
					System.out.println(i);
					System.out.println(periods[i]);
				}
				
			}else if(periods[i] >= 60 && sum01 < 600000) {
				if(sum02 >= 600000) {
					answer[0]++;
					System.out.println(i);
					System.out.println(periods[i]);
				}
				
			}else if(periods[i] >=24 && sum01 >=900000) {
				if(sum02 < 900000) {
					answer[1]++;
					System.out.println(i);
					System.out.println(periods[i]);
				}
				
			}else if(periods[i] >= 60 && sum01 >=600000) {
				if(sum02 < 600000) {
					answer[1]++;
					System.out.println(i);
					System.out.println(periods[i]);
				}
				
			}else if(periods[i] == 23) {
				if(sum02 >= 900000) {
					answer[0]++;
					System.out.println(i);
					System.out.println(periods[i]);
				}
				
			}
			
			
			
		}
		
		
		return answer;
	}
}
