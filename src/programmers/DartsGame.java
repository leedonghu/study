package programmers;

public class DartsGame {
	public static void main(String[] args) {
		String dartResult = "1D2S#10S";
		System.out.println(solution(dartResult));
	}
	
	static int solution(String dartResult) {
		int[] result = new int[3];
		int point = 0;
		String s = "";
		int op = -1;
		int answer = 0;
		for(int i=0; i<dartResult.length(); i++) {
			char a = dartResult.charAt(i);
			if(a >= 48 && a<= 57) {
				s += String.valueOf(a);
				
				continue;
			}
			
			if(a == 'S') {
				op++;
				point = Integer.parseInt(s);
				s="";
				
				result[op] = point;
				continue;
			}
			
			if(a == 'D') {
				op++;
				point = Integer.parseInt(s) * Integer.parseInt(s);
				s="";
				
				result[op] = point;
				continue;
			}
			
			if(a == 'T') {
				op++;
				point = Integer.parseInt(s) * Integer.parseInt(s) * Integer.parseInt(s);
				s="";
				
				result[op] = point;
				continue;
			}
			
			if(a == '*') {
				if(op>0) {
					result[op-1] = result[op-1] * 2;
					result[op] = result[op] * 2;
					
					continue;
				}else {
					result[op] = result[op] * 2;
					
					continue;
				}
			}
			
			if(a == '#') {
				result[op] = -1 * result[op];
				
				continue;
			}
		}
		
		for(int i=0; i<result.length; i++) {
			answer += result[i];
			
		}
		
		return answer;
	}
}
