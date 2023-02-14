package programmers;

public class ClosestLetter {
    public static void main(String[] args) {
        String s = "a";
        int[] answer = solution(s);
        for(int i=0; i<answer.length; i++){
            System.out.println(answer[i]);
        }
    }

    static int[] solution(String s){
        int[] answer = new int[s.length()];
        for(int i=1; i<s.length(); i++){
            char c = s.charAt(i);
            for(int j=i-1; j>=0; j--){
                if(c == s.charAt(j)){
                    answer[i] = i-j;
                    break;
                }
            }
            if(answer[i] == 0){
                answer[i] = -1;
            }
        }
        answer[0] = -1;
        return answer;
    }
}