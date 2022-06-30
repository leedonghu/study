package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Q2606 {
	static int answer = 0; //감염된 컴퓨터수
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); //정점의 수
		int test = Integer.parseInt(br.readLine()); //간선의 수
		
		int[][] a = new int[n+1][n+1]; //인접행렬
		boolean check[] = new boolean[n+1]; //정점방문여부
		
		int t = 0;
		while(t < test) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			a[x][y] = 1;
			a[y][x] = 1;
			t++;
		}
		
		dfs(a, check, 1);
		System.out.println(answer-1);
	}
	
	static void dfs(int[][] a, boolean[] check, int start) {
		if(check[start] == true) {
			return;
		}
		
		check[start] = true; //방문처리
		answer++; //감염된 컴퓨터 수 증가
		
		for(int i=0; i<a[start].length; i++) {
			if(a[start][i] == 1 && !check[i]) { //연결된 정점이면서 방문하지 않은 경우
				dfs(a, check, i);
			}
		}
	}
	
	
}
