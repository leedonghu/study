package study.ch1;

import java.util.Scanner;

public class Code07 {
	
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] data = new int[n];
		
		for(int i=0; i<data.length; i++) {
			data[i]= kb.nextInt();
		}
		
		kb.close();
		
		//배열 오른쪽으로 한칸씩 이동
		//맨 뒤의 수를 빼놓고 나머지를 오른쪽으로 이동시킴
		//그 후에 첫번째 자리에 빼놓은 수를 넣음
		int tmp = data[n-1];
		for(int i=n-2; i>=0; i-- ) {
			data[i+1] = data[i];
		}
		data[0] = tmp;
		
		for(int i=0; i<data.length; i++) {
			System.out.println(data[i]);
		}
	}
}
