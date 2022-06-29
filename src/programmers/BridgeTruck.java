package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class BridgeTruck {
	static int solution(int bridge_length, int weight, int[] truck_weights) {
		Queue<Integer> que = new LinkedList<Integer>();
		
		int time = 0;
		int sum = 0;
		
		for(int i=0; i<truck_weights.length; i++) {
			int truck = truck_weights[i];
			
			while(true) {
				if(que.isEmpty()) {
					que.add(truck);
					sum += truck;
					time++;
					break;
				}
			}
		}
		
		return 0;
	}
	
	static int solution2(int bridge_length, int weight, int[] truck_weights) {
		Queue<Integer> que = new LinkedList<Integer>();
		int sum = 0;
		int time = 0;
		
		for(int truck : truck_weights) {
			while(true) {
				if(que.isEmpty()) {
					que.add(truck);
					time++;
					sum += truck;
					break;
				}else if(que.size() == bridge_length) {
					sum -= que.poll();
				}else {
					if(sum + truck <= weight) {
						que.add(truck);
						sum += truck;
						time++;
						break;
					}else {
						que.add(0); //0을 넣어 트럭이 지나가게 함
						time++;
					}
				}
			}
		}
		return bridge_length + time;
		
	}
	public static void main(String[] args) {
		int bridge_length = 100;
		int weight = 100;
		int[] truck_weights = {10};
		System.out.println(solution2(bridge_length, weight, truck_weights));
	}
}
