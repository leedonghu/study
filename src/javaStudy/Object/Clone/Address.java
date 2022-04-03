package javaStudy.Object.Clone;

public class Address implements Cloneable {
	private long zipCode;
	private String city;
	
	public Address(){
		
	}
	
	public Address(long zipCode, String city) {
		this.zipCode = zipCode;
		this.city = city;
	}
	
	@Override
	protected Address clone() throws CloneNotSupportedException {
		
		return (Address)super.clone();
	}
	
	public long getZipCode() {
		return zipCode;
	}
	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
