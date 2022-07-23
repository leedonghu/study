package algorithm.tree;

public class Floyd_Warshall_Alorithm {
	static int number = 4;
	static int inf = 10000000;
	static int[][] arr = {{0,5,inf,8},
			{7,0,9,inf},
			{2,inf,0,4},
			{inf,inf,3,0}};
	static int[][] d;
	
	static void floydWarshall() {
		for(int k=0; k<number;k++) { //거쳐가는 노드
			for(int i=0; i<number; i++) { //출발 노드
				for(int j=0; j<number; j++) {
					if(arr[i][j] > arr[i][k] + arr[k][j]) { //저장된 값보다 거쳐가는 값이 더 작다면
						arr[i][j] = arr[i][k] + arr[k][j];  //더 작은 값으로 초기화
					}
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		floydWarshall();
		
		for(int i=0; i<number; i++) {
			for(int j=0; j<number; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.printf("\n");
		}
	}
}
