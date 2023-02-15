package programmers;

public class SecretCode {
    public static void main(String[] args) {
        String s = "aukks";
        String skip = "wbqd";
        int index = 5;
        String answer = solution(s, skip, index);
        System.out.println(answer);
    }

    static String solution(String s, String skip, int index){
        char[] letter = s.toCharArray();
        for(int i=0; i<s.length(); i++){
            for(int j=0; j<index; j++){
                do{
                    letter[i]++;
                    if(letter[i] > 'z'){
                        letter[i] -= 26;
                    }
                }while(skip.contains(String.valueOf(letter[i]))); //skip에 걸리는 문자가 있다면 반복
            }
        }
        return String.valueOf(letter);
    }
}