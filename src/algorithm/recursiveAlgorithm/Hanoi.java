package algorithm.recursiveAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hanoi {
	private static String[] top = {"A기둥", "B기둥", "C기둥"};
	static void move(int no, int x, int y) {
		
		if(no > 1) {
			move(no - 1, x, 6-x-y); //6-x-y 는 시작기둥과 목표기둥이 아닌 나머지 기둥, 6은 기둥이 3개일때 1번 2번 3번 기둥의 합
			                        //no-1개를 그룹으로 묶어서 중간기둥으로 옮김
						
		}
		System.out.println("원반[" + no + "]을 " + top[x-1] + "에서" + top[y-1] + "으로 옮김");
		
		if(no>1) {
			move(no-1, 6-x-y, y); //
		}
		
		
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("하노이의 탑");
		System.out.print("원반 갯수 : ");
		int n = Integer.parseInt(br.readLine());
		
		move(n, 1, 3);
	}
}
