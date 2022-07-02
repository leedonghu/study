package programmers;

public class Network {
	
	static boolean[] check;
	static int answer = 0;
	
	static int solution(int n, int[][] computers) {
		
		check = new boolean[n];
		
		for(int i=0; i<n; i++) {
			if(!check[i]) {
				answer++;
				dfs(i, n, computers);
			}
		}
		
		return answer;
	}
	
	static void dfs(int i,int n, int[][] computers) {
		check[i] = true;
		
		for(int t=0; t<n; t++) {
			if(computers[i][t] == 1 && !check[t] ) {
				dfs(t, n, computers);
			}
		}
	}
	
	public static void main(String[] args) {
		int n = 3;
		int[][] computers = {{1,1,0},{1,1,1},{0,1,1}};
		System.out.println(solution(n, computers));
	}
	
}
