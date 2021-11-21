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
	
	static int gcdArray(int[] a) { //A B 의 공약수 D, A B C의 최대공약수는 D 와 C의 최대공약수와 같음
		int n = 0;
		int gcd = 0;
		
		while(n<a.length-1) {
			gcd = gcd(a[n], a[n+1]);
			n++;
		}
		return gcd;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		System.out.println("두 정수의 최대공약수를 구합니다.");
//		
//		System.out.print("정수를 입력하세요 : ");
//		int x = Integer.parseInt(br.readLine());
//		System.out.print("정수를 입력하세요 : ");
//		int y = Integer.parseInt(br.readLine());
//		
//		System.out.println("최대공약수는 " + gcd02(x,y) + "입니다.");
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int t = 0;
		while(t<n) {
			arr[t] = Integer.parseInt(br.readLine());
			t++;
		}
		
		System.out.println("최대공약수는 " + gcdArray(arr) + "입니다.");
	}
}
