package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q3055 {
	static char[][] map;
	
	static Queue<int[]> q1 = new LinkedList<>();
	static Queue<int[]> q2 = new LinkedList<>();
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,1,0,-1};
	static int n, m;
	static int answer = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		map = new char[n][m];
		
		
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			for(int j=0;j<m;j++) {
				char a = str.charAt(j);
				map[i][j] = a;
				if(a == 'S') {
					q1.add(new int[] {i,j,0});
				}else if(a =='*') {
					q2.add(new int[] {i,j});
				}
			}
		}
		
		dfs();
		System.out.println(answer == Integer.MAX_VALUE ? "KAKTUS" : answer);
	}
	
	static void dfs() {
		
//		while(!q1.isEmpty()) {
//			for(int i=0;i<q2.size(); i++) {
//				int[] water = q2.poll();
//				for(int j=0;j<4;j++) {
//					int nx = water[0] + dx[j];
//					int ny = water[1] + dy[j];
//					
//					if(nx>=0 && ny>=0 && nx<n && ny <m) {
//						if(map[nx][ny] == '.') {
//							map[nx][ny] = '*';
//							q2.add(new int[] {nx,ny});
//						}
//					}
//				}
//			}
//			
//			for(int i=0; i<q1.size(); i++) {
//				int[] q = q1.poll();
//				for(int j=0; j<4; j++) {
//					int nx = q[0]+dx[j];
//					int ny = q[1] + dy[j];
//					
//					if(nx>=0 && ny>=0 && nx<n && ny <m) {
//						if(map[nx][ny] == '.') {
//							
//							map[nx][ny] = 'S';
//							q1.add(new int[] {nx,ny,q[2]+1});
//						}else if(map[nx][ny] == 'D') {
//							
//							answer = Math.min(answer, q[2]+1);
//							return;
//						}
//					}
//				}
//			}
//		}
		
		while (!q1.isEmpty()) {
            // 물 퍼뜨림
            int len = q2.size();
            for(int i=0;i<len;i++){
                int[] t =q2.poll();
                int x = t[0];
                int y = t[1];
                for (int k = 0; k < 4; k++) {
                    int nx = x + dx[k];
                    int ny = y + dy[k];
                    if (nx >= 0 && nx < n && ny >= 0 && ny < m && map[nx][ny]=='.') {
                        map[nx][ny] = '*';
                        q2.add(new int[]{nx,ny});
                    }
                }
            }

            // 고슴도치 이동
            len = q1.size();
            for(int i=0;i<len;i++){
                int[] t = q1.poll();
                int x = t[0];
                int y = t[1];
                int time = t[2];
                for (int k = 0; k < 4; k++) {
                    int nx = x + dx[k];
                    int ny = y + dy[k];
                    if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                        if(map[nx][ny]=='D'){
                            answer=Math.min(answer,time+1);
                            return;
                        }else if(map[nx][ny]=='.'){
                            map[nx][ny] = 'S';
                            q1.add(new int[]{nx,ny,time+1});
                        }
                    }
                }
            }
        }
	}
}
