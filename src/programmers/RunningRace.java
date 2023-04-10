package programmers;

import java.util.HashMap;
import java.util.Map;

public class RunningRace {
    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        String[] result = solution(players, callings); 
        for(int i=0;i<result.length; i++){
            System.out.println(result[i]);
        }
        
    }

    public static String[] solution(String[] players, String[] callings){
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<players.length; i++){
            map.put(players[i], i);
        }
        for(int i =0; i<callings.length; i++){
            int index = map.get(callings[i]);
            map.replace(callings[i], index-1);
        }
        // for(int i=0; i<callings.length; i++){
        //     int index = 0;
        //     for(int j=0; j<players.length; j++){
        //         if(callings[i].equals(players[j])){
        //             index = j;
        //             break;
        //         }
        //     }
        //     String temp = players[index-1];
        //     players[index-1] = players[index];
        //     players[index] = temp; 
        // }
        return players;
    }
}