package programmers;

public class CardBundle {
    public static void main(String[] args) {
        String[] cards1 = {"i", "water", "drink"}; 
        String[] cards2 = {"want", "to"}; 
        String[] goal = {"i", "want", "to", "drink", "water"}; 
        String answer = solution(cards1, cards2, goal);
        System.out.println(answer);
    }

    static String solution(String[] cards1, String[] cards2, String[] goal){
        int c1 = 0;
         
        int c2 = 0;
         
        for(int i=0; i<goal.length; i++){
            System.out.println("i :" + i);
            if(c1<cards1.length && goal[i].equals(cards1[c1])){
                
                c1++;
                System.out.println("i :" + i + "c1 : " + c1);
                continue;
            }
            if(c2 < cards2.length && goal[i].equals(cards2[c2])){
                c2++;
                System.out.println("i :" + i + "c2 : " + c2);
                continue;
            }
        }
        
        return (c1 == cards1.length) && (c2 == cards2.length) ? "Yes" : "No";
    }
}