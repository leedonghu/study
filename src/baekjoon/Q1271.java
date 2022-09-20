package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class Q1271 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger max = sc.nextBigInteger();
		BigInteger n = sc.nextBigInteger();
		
		System.out.println(max.divide(n));
		System.out.println(max.remainder(n));
	}
}
