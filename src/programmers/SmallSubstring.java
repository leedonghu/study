package programmers;

public class SmallSubstring {
    public static void main(String[] args) {
        String t = "10203";
        String p = "15";
        int answer = solution(t, p);
        System.out.println(answer);
    }

    static int solution(String t, String p){
        int length = p.length();
        int comp = Integer.parseInt(p);
        int cnt = 0;
        for(int i=0; i<=t.length() - length; i++){
            int check = Integer.parseInt(t.substring(i, i+length));
            System.out.println(check);
            if(check <= comp){
                cnt++;
            }
        }
        return cnt;
    }
}