package programmers;

public class Homework03 {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		String hand = "right";
		System.out.println(solution2(numbers, hand));
	}
	
	public static String solution(int[] numbers, String hand) {
		StringBuilder sb = new StringBuilder();
		int[][] point = {{0,0},{-1,3}, {0,3},{1,3}, {-1,2}, {0,2},{1,2}, {-1,1}, {0,1}, {1,1}};//키패드 좌표화
		int[] leftPoint = {-1,0};//왼손 시작 좌표
		int[] rightPoint = {1,0};//오른손 시작 좌표
		
		for(int i=0; i<numbers.length; i++) {
			
			if(numbers[i]==1 || numbers[i] == 4 || numbers[i]== 7) {
				sb.append("L");
				leftPoint = point[numbers[i]];
				
			}else if(numbers[i]==3 || numbers[i] == 6 || numbers[i]== 9) {
				sb.append("R");
				rightPoint = point[numbers[i]];
				
			}else if(numbers[i]==2 || numbers[i] == 5 || numbers[i]== 8 || numbers[i] == 0) {
				int ld =(int)( Math.pow(leftPoint[0] - point[numbers[i]][0] , 2) + Math.pow(leftPoint[1] - point[numbers[i]][1] , 2));
				int rd = (int)( Math.pow(rightPoint[0] - point[numbers[i]][0] , 2) + Math.pow(rightPoint[1] - point[numbers[i]][1] , 2));;
				
				if(ld>rd) {
					sb.append("R");;
					rightPoint = point[numbers[i]];
					
				}else if(rd> ld) {
					sb.append("L");
					leftPoint = point[numbers[i]];
					
					
				}else {
					
					if(hand.equals("left")) {
						sb.append("L");
						leftPoint = point[numbers[i]];
						
					}else {
						sb.append("R");;
						rightPoint = point[numbers[i]];
						
					}
				}
			}
			
			
			
		}
		//9월27일
		//1차 출력까지 50분가량걸림
		//하지만 원하는 답 나오지 않음
		
		//1차수정 10분가량
		//두 점사이의 거리 가 더 클때 출력하는 문자를 반대로 해놓는 실수 수정
		//point배열 만들때 실수 수정
		
		//답안 제출시 테스트에서 실패함
		//효율적인 코드를 찾아야 하는듯
		
		return sb.toString();
	}
	
	public static String solution2(int[] numbers, String hand) {
		StringBuilder sb = new StringBuilder();
		int leftPoint = 10;
		int rightPoint = 12;
		
		for(int num : numbers) {
			if(num == 0) {
				num = 11;
			}
			if(num % 3 == 1) {
				sb.append("L");
				leftPoint = num;
			}else if(num % 3 == 0) {
				sb.append("R");
				rightPoint = num;
			}else {
				int ld1 = leftPoint > num ? leftPoint - num : num - leftPoint;
				int rd1 = rightPoint > num ? rightPoint - num : num - rightPoint;
				
				int ld2 = (ld1 / 3) + (ld1 % 3); //거리를 구하는 식이 왜?
				int rd2 = (rd1 / 3) + (rd1 % 3);
				
				if(ld2 > rd2) {
					sb.append("R");
					rightPoint = num;
				}else if(ld2 < rd2) {
					sb.append("L");
					leftPoint = num;
				}else {
					if(hand.equals("right")) {
						sb.append("R");
						rightPoint = num;
					}else {
						sb.append("L");
						leftPoint = num;
					}
				}
			}
		}
		
		return sb.toString();
	}
}
