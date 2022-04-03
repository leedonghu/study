package javaStudy.Object.Clone;

public class CloneTest {
	public static void main(String[] args) {
		Member member1 = new Member("동후", 30, new Address(10101, "광주"));
		Member member2 = member1.clone();
		
		Address address1 = member1.getAddress();
		Address address2 = member2.getAddress();
		
		address2.setCity("서울");
		
		System.out.printf("address1 hashcode : %s\n", address1);
		System.out.printf("address2 hashcode : %s\n", address2);
		
		System.out.printf("member1 hashcode : %s\n", member1);
		System.out.printf("member2 hashcode : %s\n", member2);
		
		System.out.printf("member1 name hashcode : %s\n", member1.getName().hashCode());
		System.out.printf("member2 name hashcode : %s\n", member2.getName().hashCode());
	}
}
