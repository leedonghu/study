package javaStudy.Object.Clone;

public class Member implements Cloneable {
	private String name;
	private int age;
	private Address address;
	
	public Member() {
		
	}
	
	public Member(String name, int age, Address address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	@Override
	protected Member clone()  {
		try {
			Address cloneAddress = address.clone();
			Member cloneMember = (Member)super.clone();
			cloneMember.setAddress(cloneAddress);
			return cloneMember;
		} catch (CloneNotSupportedException e) {
			// TODO: handle exception
			return null;
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}


