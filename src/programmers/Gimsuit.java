package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Gimsuit {
	public static void main(String[] args) {
		int n =10;
		int[] lost = {2,4,7,8};
		int[] reserve = {1,3,5};		
		
		System.out.println(solution(n, lost, reserve));
	}
	
	public static int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
		Arrays.sort(lost);
		Arrays.sort(reserve);
		int[] ok = new int[n];
		for(int i=0; i<n; i++) {
			ok[i] = 1;
		}

		for(int i=0; i<lost.length; i++) {
			for(int j=i; j<reserve.length; j++) { //j의 시작을 i부터 함으로써 중복제거
				if(lost[i] -1 == reserve[j]) {
					System.out.println(lost[i] + "break");
					break;
					
				}else if(lost[i]+1 == reserve[j]) {
					System.out.println(lost[i]);
					break;
				}else if(lost[i] == reserve[j]) {
					System.out.println(lost[i]);
					break;
				}
				else {
					System.out.println(lost[i]);
					ok[lost[i] -1] = 0;
					
				}
				
			}
		}
		
		for(int i=0; i<n; i++) {
			System.out.println("ok["+i+"]:"+ok[i]);
			answer += ok[i];
		}
		
		
		

		return answer;
	}
}
