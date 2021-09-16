package study.ch2_3;

public class Code01 {
	//클래스는 타입. 설계도이지 실체는 아님
	//데이터를 저장할 수도 메소드를 실행할 수도 없음
	//new 명령으로 객체를 만든후 사용가능
	//예외 -> static
	//static 멤버는 class멤버 non-static 멤버는 object멤버
	//static 상수 혹은 클래스 당 하나만 유지하면 되는 값 -> Math.PI, System.out
	//순서하게 기능만으로 정의되는 메서드 -> 수학함수들 Math.abs(k), Math.sqrt(n), Math.min(a,b)
	
	static int s =0;
	int t= 0;
	
	public static void print1() {
		System.out.println("s :" + s);
//		System.out.println("t" + t); t는 object멤버 -> 실제로 존재하지 않음
	}
	
	public void print2() {
		//print2는 object멤버이기 때문에 t 를 접근할 수 있음
		System.out.println("s :" + s);
		System.out.println("t :" + t); 
	}
	
	public static void main(String[] args) {
		s = 100;
//		t = 100; 오류
		
		
	}
}
