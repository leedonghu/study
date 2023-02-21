package programmers;

public class Ongali {
    public static void main(String[] args) {
        String[] babblings = {"ayayeaya", "yeye", "ayayemawoo", "maa"};
        int answer = solution(babblings);
        System.out.println(answer);
    }

    static int solution(String[] babbling){
        int answer = 0;
        String[] ongali = { "aya", "ye", "woo", "ma"};
        for(int i=0; i<babbling.length; i++){
            String str = babbling[i];
            boolean bool = true;
            for(int j=0; j<ongali.length; j++){
                String check = ongali[j] + ongali[j];
                if(str.contains(check)){
                    bool = false;
                    break;
                }
                while(str.contains(ongali[j])){

                    str = str.replaceFirst(ongali[j], " ");
                }
            }
            
            if(bool && str.replaceAll(" ", "").equals("")){
                answer++;
            }
            System.out.println(str);
        }
        return answer;
    }
}