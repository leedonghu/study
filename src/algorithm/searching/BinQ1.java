package algorithm.searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinQ1 {
	
	static int binSearch(int[] a, int n, int key) {
		int pl = 0;
		int pr = n-1;
		for(int i=0; pl <= pr; i++) {
			int pc =(pl + pr) / 2;
			if(a[pc] == key) {
				return pc;
			}else if(a[pc] > key) {
				pr = pc - 1;
			}else {
				pl = pc + 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("요솟수 : ");
		int num = Integer.parseInt(br.readLine());
		int[] x = new int[num];
		
		System.out.println("오름차순으로 입력하세요");
		
		System.out.print("x[0] :");
		x[0] = Integer.parseInt(br.readLine());
		
		for(int i=1; i<num; i++) {
			do {
				System.out.print("x[" + i + "] :");
				x[i] = Integer.parseInt(br.readLine());
			}while(x[i] < x[i-1]); //바로 앞의 요소보다 작으면 다시 입력
		}
		
		System.out.print("검색할 값 : ");
		int ky = Integer.parseInt(br.readLine());
		int idx = binSearch(x, num, ky);
		
		if(idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		}else {
			System.out.println(ky +"은 x[" + idx + "]에 있습니다");
		}
	}
}
