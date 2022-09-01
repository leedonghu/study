package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q10814 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Member> pq = new PriorityQueue<Member>();
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			Member member = new Member(age, name, i);
			pq.offer(member);
		}
		
		StringBuilder sb = new StringBuilder();
		while(!pq.isEmpty()) {
			Member m = pq.poll();
			sb.append(m.age + " " + m.name).append("\n");
		}
		
		System.out.println(sb);
	}
}
class Member implements Comparable<Member>{
	int age;
	String name;
	int number;
	
	public Member(int age, String name, int number){
		this.age = age;
		this.name = name;
		this.number = number;
	}

	@Override
	public int compareTo(Member o) {
		if(this.age == o.age) {
			return this.number - o.number;
		}
		return this.age - o.age;
	}
}
