package algorithm.basicDataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompareArrangment {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//두 배열이 같은지 비교
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("배열 a의 요솟수:");
		int na = Integer.parseInt(br.readLine());
		int[] a = new int[na];
		
		for(int i=0; i<na; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.println("배열 b의 요솟수:");
		int nb = Integer.parseInt(br.readLine());
		int[] b = new int[nb];
		
		for(int i=0; i<nb; i++) {
			b[i] = Integer.parseInt(br.readLine());
			
		}
		
		System.out.println("배열 a와 b는" + (equals(a,b) ? "같습니다": "같지 않습니다"));
	}
	
	static boolean equals(int[] a, int[] b) {
		if(a.length != b.length) { //1단계 배열의 길이가 같은지 비교
			return false;
		}
		
		for(int i=0; i<a.length; i++) {// 2단계 요소값이 같은지 비교
			if(a[i] != b[i]) {
				return false;
			}
		}
		
		return true; //모두 통과하면 true리턴
	}
}
