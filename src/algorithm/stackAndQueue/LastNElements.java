package algorithm.stackAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LastNElements {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final int N = 10;
		int[] a = new int[N];
		int cnt = 0; //입력받은 갯수
		int retry; 
		
		System.out.println("정수를 입력하세요.");
		
		do {
			System.out.printf("%d번째 정수 : ", cnt + 1);
			a[cnt++ % N] = Integer.parseInt(br.readLine()); // CNT가 10이상이 되면 다시 0번부터 채워넣기 시작함
			
			System.out.print("계속 할까요? (예.1/아니요.2)  :");
			retry = Integer.parseInt(br.readLine());
		}while(retry == 1);
		
		int i = cnt - N;
		if(i < 0) {
			i = 0;
		}
		
		for(; i<cnt; i++) {
			System.out.printf("%2d번쨰의 정수 = %d\n", i+1, a[i%N]);
		}
	}
}
