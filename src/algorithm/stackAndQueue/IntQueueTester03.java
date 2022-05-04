package algorithm.stackAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntQueueTester03 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		QueQ4 s = new QueQ4(3);
		
		while(true) {
//			System.out.println("현재 테이터 수 : " + s.size() + "/" +s.capacity());
			System.out.print("(1)인큐  (2)디큐  (3)피크  (4)덤프 (0)종료 :");
			
			int menu = Integer.parseInt(br.readLine());
			if(menu == 0) {
				break;
			}
			
			int x;
			switch(menu) {
				case 1:
					System.out.print("데이터 :");
					x = Integer.parseInt(br.readLine());
					try {
						s.enque(x);
						
					}catch(IntQueue.OverflowIntQueueException e) {
						System.out.println("큐가 가득 찼습니다.");
					}
					break;
					
				case 2:
					try {
						x = s.deque();
						System.out.println("디큐한 데이터는 " + x + "입니다.");
					}catch(IntQueue.EmptyIntQueueException e) {
						System.out.println("큐가 비어 있습니다.");
					}
					break;
					
				case 3:
					try {
						//x = s.peek();
//						System.out.println("피크한 데이터는 " + x + "입니다.");
					}catch(IntQueue.EmptyIntQueueException e) {
						System.out.println("큐가 비어 있습니다.");
					}
					break;
					
				case 4:
					//s.dump();
					break;
			}
		}
	}
}
