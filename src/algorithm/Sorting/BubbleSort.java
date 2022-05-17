package algorithm.Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BubbleSort {
	
	static void swap(int[]a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void bubbleSort(int[]a, int n) {
		int cnt = 0;
		for(int i=0; i<n-1; i++) { //패스 횟수
			for(int j=n-1; j>i; j--) { //배열의 오른쪽 끝부터 비교 교환
				if(a[j-1] > a[j]) {
					swap(a, j-1, j);
				}
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	
	static void bubbleLeftSort(int[]a, int n) {
		int cnt = 0;
		for(int i=n-1; i>0; i--) {
			for(int j=0; j<i; j++) { //왼쪽에서 오른쪽으로 스캔
				if(a[j] > a[j+1]) {
					swap(a, j, j+1);
				}
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	
	static void improvementBubbleSort(int[]a, int n) {
		int cnt = 0;
		for(int i=n-1; i>0; i--) {
			int exchg = 0; //패스에서 교환이 일어나는지 체크
			for(int j=0; j<i; j++) {
				if(a[j] > a[j+1]) {
					swap(a, j, j+1);
					exchg++;
				}
				cnt++;
			}
			
			if(exchg == 0) { //교환이 일어나지 않는 패스가 있다면 정렬이 완료된 것임으로 종료
				break;
			}
		}
		System.out.println(cnt);
	}
	
	static void improvementBubbleSort02(int[] a, int n) {
		int cnt = 0;
		int k = 0; //첫번째 패스에서 모든 요소를 검사해야 하기 때문에 0으로 초기화
		while(k < n-1) {
			int last = n-1; //맨 오른쪽 인덱스 값 저장
			for(int j=n-1; j>k; j--) { //맨 오른쪽부터 k인덱스까지만 교환 일어나게함
				if(a[j-1]> a[j]) {
					swap(a, j-1, j);
					last = j; //교환을 마친 후 오른쪽 값의 인덱스
				}
				cnt++;
			}
			k = last; 
		}
		System.out.println(cnt);
	}
	
	static void bidirectionBubbleSort(int[] a, int n) {
		int cnt = 0;
		for(int i=0; i<n-1; i++) {
			if(i % 2 == 0) {
				for(int j=n-1; j>i; j--) {
					if(a[j-1] >a[j]) {
						swap(a, j-1, j);
					}
					cnt++;
				}
			}else {
				for(int j=i;j<n-1; j++) {
					if(a[j] > a[j+1] ) {
						swap(a, j, j+1);
					}
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
	
	static void shakerSort(int[] a, int n) {
		int left = 0;
		int right = n - 1;
		int last = right;

		while (left < right) {
			for (int j = right; j > left; j--) {
				if (a[j - 1] > a[j]) {
					swap(a, j - 1, j);
					last = j;
				}
			}
			left = last;

			for (int j = left; j < right; j++) {
				if (a[j] > a[j + 1]) {
					swap(a, j, j + 1);
					last = j;
				}
			}
			right = last;
		}
	}
	
	static void test(int[]a, int n) {
		for(int i=0; i<n-1; i++) {
			
			int test = 0;
			System.out.println("r" +test);
			for(int j = n-1; j>i; j--) {
				if(a[j-1] > a[j]) {
					swap(a,j-1,j);
					test++;
				}
			}
			System.out.println("s"+test);
			if(test == 0) {
				break;
			}
			
		}
	}
	

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		System.out.println("버블 정렬(버전1)");
//		System.out.print("요솟수 : ");
//		int nx = Integer.parseInt(br.readLine());
//		int[] x = new int[nx];
		
		int nx = 7;
		int[] x = {1, 33, 20, 25, 34, 90, 32};
		
//		for(int i=0; i<nx; i++) {
//			System.out.print("x[" + i + "] :");
//			x[i] = Integer.parseInt(br.readLine());
//		}
		
//		bidirectionBubbleSort(x, nx); // 21번
		improvementBubbleSort02(x, nx); // 15번
//		improvementBubbleSort(x, nx);  // 18번
//		bubbleLeftSort(x, nx); //21번
//		bubbleSort(x, nx); //21번
		test(x, nx);
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i=0; i<nx; i++) {
			System.out.println("x[" + i + "] =" + x[i]);
		}
	}
}
