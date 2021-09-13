package study.ch1_1;

import java.util.Scanner;

public class Code13 {
	public static void main(String[] args) {
		//정수가 입력될때마다 오름차순으로 정렬
		//앞에서부터 검사해서 입력된 수보다 더 큰 수를 처음 만나는 곳에 삽입
		//뒤에서부터 검사해서 입력된 수보다 더 작은 수를 처음 만나는 곳에 삽입
		//뒤에서부터 검사해서 한칸씩 옮기는것이 더 효율적
		//수가 덮어씌워질 걱정 안해도 됨
		//앞에서부터 검사해서 한칸씩 이동시키면 값을 한번 변수에 저장해야함
		
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int[] data = new int[n];
		
		for(int i=0; i<n;i++) { //i==0 인것은 data가 없다는 뜻
			int tmp = kb.nextInt();
			
			int j = i-1;
			while(j>=0 && data[j] > tmp ) { //두 조건의 순서가 중요 data[j]>tmp && j>=0으로 쓰면 오류. j가 0보다 크거나 같을 경우를 먼저 확인
				data[j+1] = data[j];
				j--;
			}
			data[j+1] = tmp;
			
			for(int k=0; k<=i; k++) {
				System.out.print(data[k] + " ");
			}
			System.out.println();
		}
		
		kb.close();
	}
}
