package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.StringTokenizer;

public class Q27445 {
    static List<int[]> list;
    static int n;
    static int m;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int[] rdis = new int[n];
        int[] cdis = new int[m];
        for(int i=0; i<n-1; i++){
            rdis[i] = Integer.parseInt(br.readLine());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<m; i++){
            cdis[i] = Integer.parseInt(st.nextToken());
        }
        
        rdis[n-1] = cdis[0];

        int min = Integer.MAX_VALUE;
        int r = 0;
        for(int i=0; i<n; i++){
            if(rdis[i] < min){
                min = rdis[i];
                r++;
            }
        }

        min = Integer.MAX_VALUE;
        int c = 0;
        for(int i=0; i<m; i++){
            if(cdis[i] < min){
                min = cdis[i];
                c++;
            }
        }

        System.out.println(r + " " + c);
    }


}