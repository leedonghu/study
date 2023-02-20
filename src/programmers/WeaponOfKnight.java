package programmers;

public class WeaponOfKnight {
    public static void main(String[] args) {
        int number = 10;
        int limit = 3;
        int power = 2;
        int answer = solution(number, limit, power);
        System.out.println(answer);
    }

    static int solution(int number, int limit, int power){
        int answer = 0;
        for(int i=1; i<=number; i++){
            int t = 0;
            
            for(int j=1; j*j<=i; j++){
                
                if(j*j == i){
                    t++;
                }else if(i % j == 0){
                    t += 2;
                }
            }
            
            if(t<=limit){
                answer += t;
            }else{
                answer += power;
            }
            
        }
        return answer;
        
    }
}