package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1963 {
	static int[] answer;
	static boolean[] check;
	static boolean[] prime;
	static int n;
	static Queue<Integer> q;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		prime = new boolean[10000];
		//에라토스테네스의 체
		for(int i=2; i<10000; i++) {
			if(!prime[i]) {
				for(int j=i+i; j<10000; j += i) {
					prime[j] = true;
				}
			}
		}
		
		while(n-- > 0) {
			check = new boolean[10000];
			answer = new int[10000];
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			bfs(a, b);
			
			if(!check[b]) {
				System.out.println("Impossible");
			}else {
				System.out.println(answer[b]);
			}
		}
	}
	
	static void bfs(int a, int b) {
		q = new LinkedList<>();
		check[a] = true;
		q.add(a);
		
		while(!q.isEmpty()) {
			int c = q.poll();
			
			for(int i=0; i<4; i++) {//4자리수 변화
				for(int j=0; j<=9; j++) {//각 자리수를 0~9까지 변화
					if(i == 0 && j == 0) { //0번째 자리를 0으로 바꿀때
						continue;
					}
					
					int k = change(c, i, j);
					if(!check[k] && !prime[k]) {
						check[k] = true;
						answer[k] = answer[c] + 1;
						q.add(k);
					}
				}
			}
		}
		
	}
	
	static int change(int a, int i, int j) {
		String s = String.valueOf(a);
		char[] arr = s.toCharArray();
		arr[i] = (char)(j + '0');
		s = String.valueOf(arr);
		return Integer.parseInt(s);
		
	}
}
