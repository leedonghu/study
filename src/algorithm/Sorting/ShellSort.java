package algorithm.Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShellSort {
	public static void shellSort(int[] a, int n){
		for(int h = n/2; h>0; h /= 2) {
			for(int i = h; i<n; i++) {
				int j;
				int tmp = a[i];
				for(j=i-h; j>=0 && a[j] > tmp; j -= h) {
					a[j+h] = a[j];
					
				}
				a[j+h] = tmp;
			}
		}
	}
	
	public static void upgradeShellSort(int[] a, int n) {
		int h; //h의 값이 서로 배수가 되지 않도록 하면서 너무 큰 값은 아니여야 효율이 높음
		for(h = 1; h<n/9; h = h*3 + 1) { //h의 초기값을 구함 n/9보다 크지 않으면서 가장 큰 수
			
		}
		
		for( ; h>0; h/=3) {
			for(int i=h; i<n; i++) {
				int j;
				int tmp = a[i];
				for(j = i-h; j>=0 && a[j] > tmp; j -=h) {
					a[j+h] = a[j];
				}
				a[j+h] = tmp;
			}
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("셸 정렬(버전1)");
		System.out.print("요솟수 : ");
		int nx = Integer.parseInt(br.readLine());
		int[] x = new int[nx];
		
		for(int i=0; i<nx; i++) {
			System.out.print("x[" + i + "] :");
			x[i] = Integer.parseInt(br.readLine());
		}
		
//		shellSort(x, nx);
		upgradeShellSort(x, nx);
		
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i=0; i<nx; i++) {
			System.out.println("x[" + i + "] = " + x[i]);
		}
	}
}
