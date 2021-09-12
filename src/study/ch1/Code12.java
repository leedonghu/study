package study.ch1;

import java.util.Scanner;

public class Code12 {
	public static void main(String[] args) {
		//정열(sort)
		//bubblesort
		//가장 큰 값을 찾아서 마지막자리로 옮김
		//두 값을 비교해서 큰 값을 한칸씩 오른쪽으로
		//다음 반복에서 마지막 자리는 생략하고 똑같은일 반복
		
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int[] data = new int[n];
		
		for(int i=0; i<n;i++) {
			data[i] = kb.nextInt();
		}
		
		kb.close();
		
		for(int i= n-1; i>0;i--) {
			for(int j=0; j<i; j++) {
				if(data[j]> data[j+1]) {
					int tmp = data[j];
					data[j] = data[j+1];
					data[j+1] = tmp;
				}
			}
		}
		System.out.println("sorted data:");
		for(int i=0; i<n; i++) {
			System.out.println(data[i]);
		}
	}
}
