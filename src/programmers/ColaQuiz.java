package programmers;

public class ColaQuiz {
    public static void main(String[] args) {
        int a = 3;
        int b = 1;
        int n = 20;
        int answer = solution(a, b, n);
        System.out.println(answer);
    }

    static int solution(int a, int b, int n){
        int answer = 0;

        int cola = n;
        while(cola >= a){
            int rest = cola % a;
            int re = (cola / a) * b;
            System.out.println("re " + re);
            // cola += cola / a;
            
            answer += re;
            // cola += re;
            // cola += rest;
            cola = rest + re;
            System.out.println(cola);
        }
        // answer += cola % a;
        // System.out.println(cola);
        return answer;
    }
}