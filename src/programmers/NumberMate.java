package programmers;

import java.util.Arrays;
import java.util.Comparator;

public class NumberMate {
    public static void main(String[] args) {
        String X = "100";
        String Y = "203045";
        String s = solution(X, Y);
        System.out.println(s);
    }

    static String solution(String X, String Y){
        
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

        if(size == 0){
            return "-1";
        }

        String[] test2 = new String[size];
        for(int i=0; i<test.length; i++){
            if(test[i] != '\0'){
                test2[i] = String.valueOf(test[i]);
            }
        }

        Arrays.sort(test2, new Comparator<String>() {
            public int compare(String a, String b) {
                return (b + a).compareTo(a + b);
            }
        });

        if(test2[0].equals("0")){
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        for(String s : test2){
            sb.append(s);
        }
        return sb.toString();
    }
}