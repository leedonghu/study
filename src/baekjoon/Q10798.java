package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] arr = new char[5][15];
        for(int i=0; i<5; i++){
            String s = br.readLine();
            for(int j=0; j<s.length(); j++){
                arr[i][j] = s.charAt(j);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr[0].length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[j][i] != '\0'){

                    sb.append(arr[j][i]);
                }
            }
            
        }

        System.out.println(sb.toString().trim());
    }
}