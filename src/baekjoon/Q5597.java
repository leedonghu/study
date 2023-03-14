package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5597 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] check = new boolean[31];
        for(int i=1; i<=28; i++){
            int num = Integer.parseInt(br.readLine());
            check[num] = true;
        }

        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=30; i++){
            if(check[i] == false){
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}