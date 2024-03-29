package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;


public class Q11286 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Abs> q = new PriorityQueue<>();
		
		for(int i=0; i<n; i++) {
			int x = Integer.parseInt(br.readLine());
			if(x != 0) {
				q.offer(new Abs(x));
			}else {
				if(q.isEmpty()) {
					System.out.println(0);
				}else {
					
					System.out.println(q.poll().num);
				}
			}
		}
	}
	

}

class Abs implements Comparable<Abs>{
	int num;
	int abs;
	
	public Abs(int num) {
		this.num = num;
		abs = Math.abs(num);
	}

	@Override
	public int compareTo(Abs o) {
		if(this.abs == o.abs) {
			return this.num - o.num;
		}else {
			return this.abs - o.abs;
		}
		
	}

	
}
