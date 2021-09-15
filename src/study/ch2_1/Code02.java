package study.ch2_1;

public class Code02 {
	public static void main(String[] args) {
		
		Person01 first; //person01 타입의 변수 a 
		first = new Person01(); //object
		
		first.name = "john";
		first.number = "01055555555";
		
		System.out.println(first.name + ", " + first.number);
		
		Person01 second = first; //같은 객체를 참조
		second.name = "tom"; //first의 name도 tom으로 바뀜
		
		System.out.println(first.name + ", " + first.number);
		System.out.println(second.name + ", " + second.number);
		
		Person01[] members = new Person01[10]; //배열의 각각의 칸도 참조변수, 객체를 각 칸이 참조, 각각의 칸이 Person01타입
		members[0] = first;
		members[1] = second;
		//아래와 같이 해주면 nullpointexception발생
		//객체를 생성해주지 않음
		//그 객체에 name과 number를 넣어줘야함
//		members[2].name ="lee"; 
//		members[2].number = "201040231";

		
		System.out.println(members[0].name + ", " + members[0].number);
		System.out.println(members[1].name + ", " + members[1].number);
//		System.out.println(members[2].name + ", " + members[2].number);
		
		int[] numbers = new int[8]; //int는 프리미티브 타입이지만 배열은 아님, numbers는 참조변수임, 배열의 참조값 저장
	}
}
