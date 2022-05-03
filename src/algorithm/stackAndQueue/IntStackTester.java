package algorithm.stackAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import algorithm.stackAndQueue.IntStack.OverflowIntStackException;

public class IntStackTester {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StackQ3 s = new StackQ3(64);
		
		while(true) {
			System.out.println("현재 데이터 수 : " + s.size() + " / " + s.capacity());
			System.out.print("(1)푸시  (2)팝  (3)피크  (4)덤프  (0)종료");
			
			int menu = Integer.parseInt(br.readLine());
			if(menu == 0) {
				break;
			}
			
			int x;
			int y;
			switch(menu) {
			case 1: //푸시
				System.out.print("외쪽에 넣기 (1)  오른쪽에 넣기 (2)");
				int side = Integer.parseInt(br.readLine());
				System.out.print("데이터 : ");
				if(side == 1) {
					
					x = Integer.parseInt(br.readLine());
					try {
						s.leftPush(x);
					}catch(OverflowIntStackException e) {
						System.out.println("스택이 가득 찼습니다");
					}
					break;
				}else if(side == 2) {
					
					y = Integer.parseInt(br.readLine());
					try {
						s.rightPush(y);
					}catch(OverflowIntStackException e) {
						System.out.println("스택이 가득 찼습니다");
					}
					break;
				}else {
					System.out.println("1과 2중에 하나만 눌러주세요");
					break;
				}
			
			case 2: //팝
				System.out.print("외쪽에서 빼기 (1)  오른쪽에서 빼기 (2)");
				int side1 = Integer.parseInt(br.readLine());
				
				if(side1 == 1) {
					
					try {
						
						x = s.leftPop();
						System.out.println("팝한 데이터는 " + x + "입니다.");
					}catch(IntStack.EmptyIntStackException e) {
						System.out.println("스택이 비어 있습니다.");
					}
					break;
					
				}else if(side1 == 2) {
					try {
						
						y = s.rightPop();
						System.out.println("팝한 데이터는 " + y + "입니다.");
					}catch(IntStack.EmptyIntStackException e) {
						System.out.println("스택이 비어 있습니다.");
					}
					break;
				}else {
					System.out.println("1과 2중에 하나만 눌러주세요");
					break;
				}
			case 3: //피크
				System.out.print("외쪽보기 (1)  오른쪽보기 (2)");
				int side2 = Integer.parseInt(br.readLine());
				
				if(side2 == 1) {
					
					try {
						x = s.leftPeek();
						System.out.println("피크한 데이터는 " + x + "입니다.");
					}catch(IntStack.EmptyIntStackException e) {
						System.out.println("스택이 비어 있습니다.");
					}
					break;
					
				}else if(side2 == 2) {
					
					try {
						y = s.rightPeek();
						System.out.println("피크한 데이터는 " + y + "입니다.");
					}catch(IntStack.EmptyIntStackException e) {
						System.out.println("스택이 비어 있습니다.");
					}
					break;
				}else {
					System.out.println("1과 2중에 하나만 눌러주세요");
					break;
				}
				
			case 4: //덤프
				s.dump();
				break;
			}
		}
	}
}
