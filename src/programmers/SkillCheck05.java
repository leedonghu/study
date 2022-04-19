package programmers;

public class SkillCheck05 {
	
	class Solution {
	    int count = 0;
	    public int solution(int[] numbers, int target) {
	        int answer = 0;
	        dfs(numbers, 0, target, 0);
	        answer = this.count;
	        
	        return answer;
	    }
	    
	    public void dfs(int[] numbers, int depth, int target, int result){
	        if (depth == numbers.length){
	            if (target == result){
	                this.count++;
	            }
	            return;
	        }
	        
	        int add = result + numbers[depth];
	        int sub = result - numbers[depth];
	        
	        dfs(numbers, depth+1, target, add);
	        dfs(numbers, depth+1, target, sub);
	        
	    }
	    
	    //핵심코드, 푸는법:

	    //완전탐색, DFS, 재귀
	}
}
