package programmers;

import java.util.Arrays;

public class NumberMate {
    public static void main(String[] args) {
        String X = "100";
        String Y = "1045";
        solution(X, Y);
    }

    static String solution(String X, String Y){
        String answer = "";
        char[] charX = X.toCharArray();
        char[] charY = Y.toCharArray();
        char[] test = new char[charX.length >= charY.length ? charY.length : charX.length];

        int t = 0;
        for(int i=0; i<charX.length; i++){
            for(int j=0; j<charY.length; j++){
                if(charX[i] == charY[j] && charX[i] != 'a'){
                    test[t] = charX[i];
                    charX[i] = 'a';
                    charY[j] = 'a';
                    t++;
                }
            }
        }
        int size = 0;
        for(int i=0; i<test.length; i++){
            if(test[i] != '\0'){
                size++;
            }
        }
        int[] test2 = new int[size];
        for(int i=0; i<test.length; i++){
            if(test[i] != '\0'){
                test2[i] = test[2];
            }
        }

        Arrays.sort(test2, new Comparator<String>() {
            public int compare(String a, String b) {
                return (b + a).compareTo(a + b);
            }
        });
        return answer;
    }
}