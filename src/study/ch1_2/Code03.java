package study.ch1_2;

import java.util.Scanner;

public class Code03 {
	public static void main(String[] args) {
		//버블정렬 메소드 활용
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] data = new int[n];
		for(int i=0; i<n; i++) {
			data[i] = kb.nextInt();
		}
		kb.close();
		
		bubbleSort(n, data);
		
		System.out.println("sorted data: ");
		for(int i=0; i<n; i++) {
			System.out.println(data[i]);
		}
	}
	
	static void bubbleSort(int x, int[] data) {
		for(int i= x-1; i>0; i-- ) {
			for(int j=0; j<i; j++ ) {
				if(data[j]>data[j+1]) {
					//swap
//					int tmp = data[j];
//					data[j] = data[j+1];
//					data[j+1] = tmp;
					
					swap(data[j], data[j+1]);//메소드로 만들었더니 정렬 안됨
											 
					//값에의한 호출
					//actual parameter vs formal parameter
					//data[j]의 값이 a로 복사 data[j+1]이 b로 복사
					//a와 b의 값을 바꾸어주었지만 data[j]와 data[j+1]이 자리를 바꾸지는 않음
					//참조에의한 호출이 아님, java에서는 지원하지 않음
					
					//프리미티브타입의 매개변수는 호출된 메소드에서 값을 변경하더라도 호출한 쪽에 영향을 주지 못함
					//(int,long,boolean 등등)
					//값에 의한 호출이기 때문에
					
					//하지만 그 밖의 타입은 변경가능
				}
			}
		}
		return;
	}
	
	static void swap(int a, int b) {
		int tmp = a;
		a = b;
		b = tmp;
	}
}
