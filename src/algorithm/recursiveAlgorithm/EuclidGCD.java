package algorithm.recursiveAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EuclidGCD {
	static int gcd(int x, int y) {
		if(y == 0) {
			return x;
		}else {
			return gcd(y, x%y);
		}
	}
	
	static int gcd02(int x, int y) {
		int max = x;
		int min = y;
		int rest;
		
		do {
			rest = max % min;
			max = min;
			min = rest;
		}while(min != 0);
		
		return max;
	}
	
	static int gcdArray(int[] a) {
		int max = a[0];
		for(int i=0; i<a.length; i++) {
			if(max < a[i]) {
				max = a[i];
			}
		}
		
		boolean check = true;
		for(int i=2; i<max; i++) {
//			for()
		}
		
		return (check == true) ? max : 1;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("두 정수의 최대공약수를 구합니다.");
		
		System.out.print("정수를 입력하세요 : ");
		int x = Integer.parseInt(br.readLine());
		System.out.print("정수를 입력하세요 : ");
		int y = Integer.parseInt(br.readLine());
		
		System.out.println("최대공약수는 " + gcd02(x,y) + "입니다.");
	}
}
