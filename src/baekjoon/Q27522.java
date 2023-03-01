package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Q27522 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Runner> list = new ArrayList<>();
        int[] score = {10,8,6,5,4,3,2,1,0};
        for(int i=0; i<8; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            list.add(new Runner(st.nextToken(), st.nextToken()));
        }
        Collections.sort(list);
        int red = 0;
        int blue = 0;
        int i =0;
        for(Runner r : list){
            String team = r.getTeam();
            if(team.equals("R")){
                red += score[i];
            }else{
                blue += score[i];
            }
            i++;

        }

        System.out.println(red > blue ? "Red" : "Blue");
    }
}

class Runner implements Comparable<Runner>{
    String time;
    String team;

    Runner(String time, String team){
        this.team = team;
        this.time = time;
    }
    public String getTeam() {
        return team;
    }
    public String getTime() {
        return time;
    }

    @Override
    public int compareTo(Runner o) {
        String t1 = this.time;
        String t2 = o.getTime();
        String[] t1Arr = t1.split(":");
        String[] t2Arr = t2.split(":");
        int t1M = Integer.parseInt(t1Arr[0]);
        int t2M = Integer.parseInt(t2Arr[0]);
        int t1S = Integer.parseInt(t1Arr[1]);
        int t2S = Integer.parseInt(t2Arr[1]);
        int t1SS = Integer.parseInt(t1Arr[2]);
        int t2SS = Integer.parseInt(t2Arr[2]);

        if(t1M != t2M){
            return t1M - t2M; 
        }

        if(t1S != t2S){
            return t1S - t2S;
        }
        
            
        return t1SS - t2SS;
    }
}