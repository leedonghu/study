package algorithm.recursiveAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecQ2 {
	static int gcd(int x, int y) {
		if(y==0) {
			return x;
		}else {
			int n1 = x;
			int n2 = y;
			int tmp;
			if(n1 < n2) {
				n1 = y;
				n2 = x;
			}
			
			if(n1 % n2 == 0) {
				System.out.println("here");
				return n2;
			}else {
				while(!(n1 % n2 == 0)) {
					tmp = n1;
					n1 = n2;
					System.out.println("n1: " + n1);
					
					n2 = tmp % n2;
					System.out.println("n2: " + n2);
				}
				return n2;
			}
			
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		
		System.out.println("최대 공약수는 " + gcd(x, y) + "입니다");
	}
}
