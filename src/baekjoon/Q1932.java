package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1932 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int[][] tri = new int[n+1][n+1];
        int[][] dp = new int[n+1][n+1];

        for(int i=1; i<=n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j=1; j<=i; j++){
                tri[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + tri[i][j]; //이 전의 값의 최대값에 현재 값을 더한것이 원하는 답
            }
        }

        int max = 0;
        for(int i=1; i<=n; i++){
            if(dp[n][i] > max){
                max = dp[n][i];
            }
        }

        System.out.println(max);
    }
}