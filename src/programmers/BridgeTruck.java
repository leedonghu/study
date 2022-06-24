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
	
	public static void main(String[] args) {
		int bridge_length = 100;
		int weight = 100;
		int[] truck_weights = {10};
		System.out.println(solution(bridge_length, weight, truck_weights));
	}
}
