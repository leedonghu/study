package programmers;

public class ThreeMusketeers {
    public static void main(String[] args) {
        int[] number = {-3, -2, -1, 0, 1, 2, 3};
        int answer = solution(number);
        System.out.println(answer);
    }

    static int solution(int[] number) {
        int answer = 0;
        for(int i=0; i<number.length; i++){
            for(int j=i+1; j<number.length; j++){
                for(int t=j+1; t<number.length; t++){
                    if(number[i] + number[j] + number[t] == 0){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}