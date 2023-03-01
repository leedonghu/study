package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2567 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] map = new int[26][26];
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            
            for(int j=0; j<10; j++){
                if(map[x+j][y] != 1){

                    map[x+j][y] = 1;
                }
                if(map[x+j][y+10] != 1){

                    map[x+j][y+10] = 1;
                }
                if(map[x][y+j] != 1){

                    map[x][y+j] = 1;
                }
                if(map[x+10][y+j] != 1){

                    map[x+10][y+j] = 1;
                }
                
            }
        }
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<map.length; i++){
            for(int j=0; j<map[1].length; j++){
                sb.append(map[i][j]);
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}