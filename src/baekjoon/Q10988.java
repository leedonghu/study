package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] arr = str.toCharArray();
        int start = 0;
        int end = arr.length-1;
        boolean check = true;
        while(start<=end){
            if(arr[start] == arr[end]){
                start++;
                end--;
            }else{
                check = false;
                break;
            }
        }
        System.out.println(check == true ? 1 : 0);
    }
}