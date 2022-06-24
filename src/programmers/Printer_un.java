package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class Printer_un {
	public static void main(String[] args) {
		int[] priorities = {1, 1, 9, 1, 1, 1};
		int location = 0;
		Printer_un sol = new Printer_un();
		System.out.println(sol.solution(priorities, location));
	}
	
	public int solution(int[] priorities, int location) {
		//queue만들기
		Queue<PrintWork> queue = new LinkedList<PrintWork>();
		for(int i=0; i<priorities.length; i++) {
			queue.add(new PrintWork(priorities[i], i));
		}
		
		int turn = 0;
		while(!queue.isEmpty()) {
			//0번째를 꺼내서 max priority가 아니면 다시 넣음
			PrintWork work = queue.poll();
//			if(queue.stream().anyMatch(otherJob -> job.prioritiy < otherJob.prioritiy)) {
//				queue.add(job);
//			}else {
//				//max priority이면 내가 찾는 job이 맞는지 확인
//				turn++;
//				if(location == job.location) {
//					break;
//				}
//			}
			
			boolean flag = false;
			for(PrintWork p : queue) {
				if(work.priority < p.priority) {
					flag = true;
					break;
				}
			}
			
			if(flag) {
				//가장 큰 값이 아닐때
				queue.add(work);
			}else {
				//가장 큰 값일떄
				turn++;
				
				if(work.location == location) {
					return turn;
				}
			}
			
			 
		}
		return turn;
	}
	
	class PrintWork{
		int priority;
		int location;
		
		public PrintWork(int priority, int location) {
			this.priority = priority;
			this.location = location;
		}
	}
}
