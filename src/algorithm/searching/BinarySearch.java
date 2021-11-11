package algorithm.searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinarySearch {
	static int binSearch(int[] a, int n, int key) {
		int pl = 0;
		int pr = n-1;
		
		do {
			int pc = (pl + pr) / 2;
			if(a[pc] == key) {
				return pc; //검색 성공
			}else if(a[pc] < key){ //key는 중앙보다 오른쪽에 존재
				pl = pc + 1; //왼쪽 인덱스를 중앙 +1 값으로 바꿔줌
			}else {
				pr = pc - 1; //오른쪽 인덱스를 중앙 -1 값으로 바꿔줌
			}
			
		}while(pl <= pr); //왼쪽 인덱스가 오른쪽 인덱스보다 클때만, 만약 작다면 모두 검색하고서도 key를 찾지 못한 경우
		
		return -1;  // 검색 실패
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("요솟수 : ");
		int num = Integer.parseInt(br.readLine());
		int[] x = new int[num];
		
		System.out.println("오름차순으로 입력하세요");
		
		System.out.print("x[0]: ");
		x[0] = Integer.parseInt(br.readLine());
		
		for(int i=1; i<num; i++) {
			do {
				System.out.print("x[" + i + "] :");
				x[i] = Integer.parseInt(br.readLine());
			}while(x[i] < x[i-1]); // 바로 앞 요소보다 작으면 다시입력
		}
		
		System.out.print("검색할 값: ");
		int key = Integer.parseInt(br.readLine());
		
		int idx = binSearch(x, num, key);
		
		if(idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		}else {
			System.out.println(key + "은 x[" + idx + "] 에 있습니다.");
		}
	}
}
