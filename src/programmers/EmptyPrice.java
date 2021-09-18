package programmers;

public class EmptyPrice {
	public static void main(String[] args) {
		System.out.println(solution(3, 20, 4));
	}
	
	static long solution(int price, int money, int count) {
		
		//총 사용하게 될 금액을 구함
		//내가 가지고 있는 돈과 비교
		//money에서 총 비용을 뺐을때 0보다 크면 0을 리턴
		//그 외에는 총 비용에서 money를 뺀 금액을 리턴
		
		int TotalPrice = 0; //int타입이면 오류가나고 long으로 바꾸면 오류가 나지 않음
		
		for(int i=0; i<count; i++) {
			TotalPrice += price * (i+1);
		}
		
//		if(money - TotalPrice >= 0) {
//			return 0;
//		}else {
//			return TotalPrice - money;
//		}
		return (money - TotalPrice) >=0 ? 0 : TotalPrice - money; //3항 연산식
	}
	
	
	 public long solution(long price, long money, long count) {
	        return Math.max(price * (count * (count + 1) / 2) - money, 0);
	    }
	
}
