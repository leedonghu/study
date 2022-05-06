package algorithm.recursiveAlgorithm;

import algorithm.stackAndQueue.IntStack;

public class Recur02 {
	public static void main(String[] args) {
		int n=4;
		recur1(n);
//		recur2(n);
//		recur3(n);
	}
	
	static void recur1(int n) {
		IntStack s = new IntStack(n);
		long time1;
		long time2;
		while(true) {
			time1 = System.nanoTime();
			if(n>0) {
				s.push(n);
				n=n-1;
				continue;
			}
			
			if(s.isEmpty() != true) {
				n = s.pop();
				System.out.println(n);
				n = n-2;
				continue;
			}
			time2 = System.nanoTime();
			break;
		}
		
		System.out.println("1)계산에 " + (time2-time1) + "가 소요되었습니다");
	}
	
	static void recur2(int n) {
		
		long time1;
		long time2;
		time1 = System.nanoTime();
		while(n>0) {
			recur2(n-1);
//			System.out.println(n);
			n = n-2;
			
		}
		time2 = System.nanoTime();
		System.out.println("2)계산에 " + (time2-time1) + "가 소요되었습니다");
	}
	
	static void recur3(int n) {
		long time1 = System.nanoTime();
		System.out.println(n);
		if(n>0) {
			recur3(n-1);
			System.out.println("n" +n);
			recur3(n-2);
		}
		
		long time2 = System.nanoTime();
		System.out.println("3)계산에 " + (time2-time1) + "가 소요되었습니다");
	}
}
