package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Gimsuit {
	public static void main(String[] args) {
		int n =5;
		int[] lost = {2,4};
		int[] reserve = {1,3,5};		
		
		System.out.println(solution(n, lost, reserve));
	}
	
	public static int solution(int n, int[] lost, int[] reserve) {
		int[] arr = new int[n];
		
		for(int i=0; i<=n-1; i++) {
			arr[i] = 1;
		}
		
		for(int i=0; i<reserve.length; i++) {
			arr[reserve[i]-1] = 2;
		}
		
		for(int i=0; i<lost.length; i++) {
			
			for(int j=0; j<reserve.length; j++) {
				if(lost[i] == reserve[j]) {
					arr[lost[i]-1] = 1;
					break;
				}else {
					
					arr[lost[i]-1] = 0;
				}
			}
			
		}
		

		
		for(int i=0; i<arr.length-1; i++) {
			
			if(arr[i]== 0 && arr[i+1] == 2) {
				arr[i] = 1;
				arr[i+1] = 1;
			}
			
		}
		
		for(int i=arr.length-1; i>0; i--) {
			if(arr[i] == 0 && arr[i-1] == 2) {
				arr[i] = 1;
				arr[i-1] = 1;
			}
		}
		
		int cnt = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != 0) {
				cnt++;
			}
			System.out.println(arr[i]);
		}
		
		
		return cnt;
	}
}
