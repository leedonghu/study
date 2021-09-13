package study.ch1_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code06 {
	
	static int n;
	static int[][] grid;
	public static void main(String[] args) {
		
		//n*n 배열
		//모든 가능한 수열 
		//하나의 수열은 시작점, 방향, 길이에 의해서 정의
		//방향은 0부터 7까지의 수로 표현 ex) 시작점 x,y기준으로 북 - 0, 북동 - 1, 동 - 2, 동남 - 3 ....
		
		Scanner inFile;
		try {
			inFile = new Scanner(new File("data.txt"));
			n = inFile.nextInt();
			grid = new int[n][n];
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					grid[i][j] = inFile.nextInt();
					System.out.println(grid[i][j]);
				}
			}
			
			System.out.println("---------------------");
			
			inFile.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int x=0; x<n; x++) { //x좌표 시작점 0부터 n
			for(int y=0; y<n; y++) {  //y좌표 시작점 0부터 n
				for(int dir=0; dir<8; dir++) { //위의 for문에서 시작점이 결정되고 방향 결정
					for(int length=1; length<=n; length++) {
						int value = computerValue(x, y, dir, length);
						if(value != -1 && isPrime(value)) { //존재하지 않는 수열이 있을때 computerValue에서 -1 리턴 ex) 1,1에서 북쪽으로 가는 길이 3짜리 수열은 없음
							System.out.println(value);
							
							
						}
					}
				}
			}
		}
	}
	
	public static int computerValue(int x, int y, int dir, int len) {
		int value = 0;
		for(int i=0; i<len; i++) {
			int digit = getDigit(x, y, dir, i); //xy기준으로 dir 방향으로 i칸 떨어진 수. 없으면 -1 리턴
			if(digit == -1) {
				return -1;
			}
			value = value*10 + digit; //수열을 정수로 환산 [1,2,3] 0*10+1-> 1*10+2 -> 12*10+3 ->123
		}
		return value;
	}
	
	public static int getDigit(int x, int y, int dir, int k) {
		int newX = x;
		int newY = y;
		
		switch(dir) { //컴퓨터에서는 원점 기준으로 y가 아래로 증가하게 하는 것이 관습
			case 0: newY -= k; //북쪽방향으면 y좌표만 -k만큼
					break;
			case 1: newX += k; //북동쪽방향이면 y좌표 -k, x좌표 +k
					newY -= k;
					break;
			case 2: newX += k; //동쪽방향이면 x좌표만 +k
					break;
			case 3: newY += k;
					newX += k;
					break;
			case 4: newY += k;
					break;
			case 5: newX -= k;
					newY += k;
					break;
			case 6: newX -= k;
					break;
			case 7: newX -= k;
					newY -= k;
					break;

				
		}
		int[] offsetX = {0,1,1,1,0,-1,-1,-1};
		int[] offsetY = {-1,-1,0,1,1,1,0,-1};
		//xy에서 dir방향으로 k칸 떨어진 위치의 좌표는
		//(x+k*offsetX[dir] , y+k*offsetY[dir])
		
		if(newX < 0 || newX >= n || newY <0 || newY >= n) {
			return -1;
		}else {
			return grid[newX][newY];
		}
				
	}
	
	static boolean isPrime(int n) {
		if(n <2) {
			return false; //n이 1일때를 걸러줌
		}
		
		for(int i=2; i*i <=n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}
