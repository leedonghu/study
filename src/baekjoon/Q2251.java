package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2251 {
	static int[] vol;
	static boolean[][][] check;
	static int a;
	static int b;
	static int c;
	static Queue<int[]> q;
	static List<Integer> list;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		list = new ArrayList<>();
		
		bfs();
		Collections.sort(list);
		for(Integer i : list) {
			System.out.print(i + " ");
		}
	}
	
	static void bfs() {
		q = new LinkedList<int[]>();
		check = new boolean[a+1][b+1][c+1];
		q.offer(new int[] {0,0,c});
		
		while(!q.isEmpty()) {
			int[] arr = q.poll();
			int x = arr[0];
			int y = arr[1];
			int z = arr[2];
			
			if(check[x][y][z]) {
				continue;
			}
			
			if(x == 0) {
				list.add(z);
			}
			
			check[x][y][z] = true;
			
			//b -> a
			if(x + y <= a) {
				q.offer(new int[] {x+y, 0, z});
			}else {
				q.offer(new int[] {a, x+y-a, z});
			}
			
			//c->a
			if(x+z <=a) {
				q.offer(new int[] {x+z, y, 0});
			}else {
				q.offer(new int[] {a, y, x+z-a});
			}
			
			//b->c
			if(y+z <= c) {
				q.offer(new int[] {x,0,y+z});
			}else {
				q.offer(new int[] {x,y+z-c, c});
			}
			
			
			//a->c
			if(x+z <= c) {
				q.offer(new int[] {0,y,x+z});
			}else {
				q.offer(new int[] {x+z-c, y, c});
			}
			
			//a->b
			if(x+y <=b) {
				q.offer(new int[] {0,x+y,z});
			}else {
				q.offer(new int[] {x+y-b, b,z});
			}
			
			//c->b
			if(y+z <=b) {
				q.offer(new int[] {x,y+z,0});
			}else {
				q.offer(new int[] {x,b,y+z-b});
			}
			
		}
	}
}
