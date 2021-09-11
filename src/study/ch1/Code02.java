package study.ch1;

public class Code02 {
	
	//Static 키워드를 통해 생성된 정적멤버들은 Heap영역이 아닌 Static영역에 할당
	//Static영역에 있는 멤버들은 프로그램의 종료시까지 메모리가 할당된 채로 존재
	//정적 메소드는 클래스가 메모리에 올라갈 때 정적 메소드가 자동적으로 생성
	//정적 메소드는 인스턴스를 생성하지 않아도 호출
	static int num;
	
	public static void main(String[] args) {
		
		int anotherNum = 5;
		num = 2;
		
		System.out.println(num + anotherNum);
		System.out.println("num: " + num);
		System.out.println("anotherNum: " + anotherNum);
	}
}
