package algorithm.stackAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Practice01 {
    static int[][] map;
    static boolean[] check;
    static int n;
    static int m;
    static int start;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());
        map = new int[n+1][n+1];
        check = new boolean[n+1];
        sb = new StringBuilder();
        for(int i=1; i<=n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            map[a][b] = map[b][a] = 1;

        }

        dfs(start);
        System.out.println(sb.toString());
    }

    static void dfs(int start){
        check[start] = true;
        sb.append(start).append(" ");
        for(int i=1; i<=n; i++){
            if(map[start][i] == 1 && check[i] == false){
                dfs(i);
            }
        }
    }
}