package programmers;



public class FoodFight {
    public static void main(String[] args) {
        int[] food = {1, 3, 4, 6};
        String answer = solution(food);
        System.out.println(answer);
    }

    static String solution(int[] food) {
        
        int len = 0;
        for(int i=0; i<food.length; i++){
            len += (food[i] / 2) * 2;
        }
        System.out.println(len);
        int[] arr = new int[len + 1];

        int idx = 0;
        for(int i=1; i<food.length; i++){
            int t = food[i]/2;
            for(int j=idx; j<idx+t; j++){
                arr[j] = i;
                arr[len-j] = i;
                
                
            }
            idx += t;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr.length; i++){
            sb.append(arr[i]);
        }

        return sb.toString();
    }
}