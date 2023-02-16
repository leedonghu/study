package programmers;

public class Kakao2023Rec {
    public static void main(String[] args) {
        String today = "2020.01.01";
        String[] terms = {"Z 3", "D 5"};
        String[] privacies = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};
        int[] answer =  solution(today, terms, privacies);
        for(int i=0; i<answer.length; i++){
            System.out.println(answer[i]);
        }
    }

    static int[] solution(String today, String[] terms, String[] privacies){
        int[] answer = new int[privacies.length];
        String[] date = today.split("\\.");
        String[] termType = new String[terms.length];
        int[] term = new int[terms.length];

        for(int i=0; i<terms.length; i++){
            termType[i] = terms[i].split(" ")[0];
            term[i] = Integer.parseInt(terms[i].split(" ")[1]);
        }

        for(int i=0; i<privacies.length; i++){

            String type = privacies[i].split(" ")[1];
            String[] calc = privacies[i].split(" ")[0].split("\\.");
            int a = 0;
            for(int j=0; j<termType.length; j++){
                if(termType[j].equals(type)){
                    a = term[j];
                }
            }

            int year = a / 12;
            int month = a % 12;
            int day = Integer.parseInt(calc[2]);

            year += Integer.parseInt(calc[0]);
            month += Integer.parseInt(calc[1]);
            if(month > 12){
                year++;
                month -= 12;
            }
            if(Integer.parseInt(date[0]) < year){
                answer[i] = i;
                continue;
            }else{
                if(Integer.parseInt(date[1]) < month){
                    answer[i] = i;
                    continue;
                }else{
                    if(Integer.parseInt(date[2]) < day){
                        answer[i] = i;
                        continue;
                    }
                }
            }
        }
        int t = 0;
        for(int i=0; i<answer.length; i++){
            if(answer[i] != 0){
                t++;
            }
        }

        int[] arr = new int[t];
        int j = 0;
        for(int i=0; i<answer.length; i++){
            if(answer[i] != 0){
                arr[j] = answer[i];
                j++;
            }
        }
        return arr;
    }
}