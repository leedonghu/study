package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9086 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            String s = br.readLine();
            if(s.length() == 1){
                sb.append(s+s).append("\n");
            }else{
                sb.append(s.charAt(0)).append(s.charAt(s.length()-1)).append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}