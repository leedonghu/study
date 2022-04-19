package programmers;

import java.util.Arrays;

public class SkillCheck02 {
	
//	["muzi", "frodo", "apeach", "neo"]	["muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"]	2	[2,1,1,0]
//			["con", "ryan"]	["ryan con", "ryan con", "ryan con", "ryan con"]	3	[0,0]
	public static void main(String[] args) {
		String[] arr = {"muzi frodo","apeach frodo","frodo neo","muzi neo", "muzi neo", "apeach muzi"};
		String[] temp = new String[arr.length];
		int j =0;
		
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] != arr[i+1]) {
				temp[j++] = arr[i];
				
			}
			System.out.println("i : "+i);
			System.out.println("j: " + j);
		}
		temp[j++] = arr[arr.length-1];
		for(int i=0; i<j; i++) {
			arr[i] = temp[i];
		}
		
		
		for(int i=0; i<j; i++) {
			System.out.println(arr[i]);
			
		}
	}
	
	public static int[] solution(String[] id, String[] report, int k) {
		String[] temp = new String[id.length];
		int j =0;
		for(int i=0; i<id.length-1; i++) {
			if(id[i] != id[i+1]) {
				temp[j++] = id[i];
				System.out.println("not same");
			}
		}
		temp[j++] = id[id.length-1];
		for(int i=0; i<j; i++) {
			id[i] = temp[i];
		}
		
		
		for(int i=0; i<j; i++) {
			System.out.println(id[i]);
		}
		return null;
	}
}
