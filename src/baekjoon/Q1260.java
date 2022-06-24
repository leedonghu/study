package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Q1260 {
	static int[][] check; //간선 연결 상태
	static boolean[] checked; //확인 여부
	static int n; //정점갯수
	static int m; //간선갯수
	static int start; //시작정점
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		m = Integer.parseInt(br.readLine());
		start = Integer.parseInt(br.readLine());
		
		check = new int[1001][1001]; //좌표를 그대로 받기 위해 +1함
		checked = new boolean[1001];
		
		//간선 연결상태 저장
		for(int i=0; i<m; i++) {
			int x = Integer.parseInt(br.readLine());
			int y = Integer.parseInt(br.readLine());
			
			check[x][y] = check[y][x] = 1;
		}
		
		dfs(start); //dfs호출
		
		checked = new boolean[1001]; //확인상태 초기화
		System.out.println(); //줄바꿈
		
		dfs(); //dfs호출
	}
	
	//시작점을 변수로 받아 확인, 출력 후 다음 연결점을 찾아 시작점을 변경하여 재호출
	public static void dfs(int i) {
		checked[i] = true;
		System.out.print(i + " ");
		
		for(int j=1; j<=n; j++) {
			if(check[i][j] == 1 && checked[j] == false) {
				dfs(j);
			}
		}
	}
	
	public static void dfs() {
		Queue<Integer>queue = new LinkedList<Integer>();
		queue.offer(start); //시작점 넣음
		checked[start] = true;
		System.out.print(start + " ");
		
		//queue가 빌 때까지 반복. 방문 정점은 확인, 출력 후 Queue에 넣어 순서대로 확인
		while(!queue.isEmpty()) {
			int temp = queue.poll();
			
			for(int j=1; j<=n; j++) {
				if(check[temp][j] == 1 && checked[j] == false) {
					queue.offer(j);
					checked[j] = true;
					System.out.print(j + " ");
				}
			}
		}
	}
}
