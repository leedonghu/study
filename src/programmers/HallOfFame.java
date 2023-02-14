package programmers;

import java.util.PriorityQueue;

public class HallOfFame {
    public static void main(String[] args) {
        int k = 4;
        int[] score = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        int[] answer =  solution(k, score);
        for(int i =0; i<answer.length; i++){
            System.out.println(answer[i]);
        }
    }

    static int[] solution(int k, int[] score){
        int[] answer = new int[score.length];
        PriorityQueue<Integer> q = new PriorityQueue<>();
        // for(int i=0; i<score.length; i++){
        //     if(i < k){
        //         q.offer(score[i]);
        //         int a = q.peek();
        //         answer[i] = a;
                
        //     }else{
        //        int a = q.peek();
        //        if(a < score[i]){
        //         q.poll();
        //         q.offer(score[i]);
        //         answer[i] = q.peek();
        //        }else{
        //         answer[i] = a;
        //        }
               
        //     }
        // }
        for(int i = 0; i < score.length; i++) {

            q.add(score[i]);
            if (q.size() > k) {
                q.poll();
            }

            answer[i] = q.peek();
        }

        return answer;
    }
}