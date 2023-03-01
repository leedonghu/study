package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2587 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        int sum = 0;
        for(int i=0; i<5; i++){
            int n = Integer.parseInt(br.readLine());
            arr[i] = n;
            sum += n;
        }

        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        sb.append(sum / 5).append("\n");
        sb.append(arr[2]);
        System.out.println(sb.toString());
    }
}