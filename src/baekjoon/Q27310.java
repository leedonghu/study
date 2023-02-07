package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q27310 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String imo = br.readLine();
        int dif = imo.length() + 2;
        for(int i=1; i<imo.length()-1; i++){
            if(imo.charAt(i) == '_'){
                dif += 5;
            }
        }

        System.out.println(dif);

    }
}