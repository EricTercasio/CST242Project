package model;

public class Person {
	private String firstName;
	private String lastName;
	private final String id;
	private String phone;
	private HomeAddress homeAddress;
	private static int idInt = 0;
	public Person(String firstName, String lastName, String phone, HomeAddress homeAddress) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.homeAddress = homeAddress;
		id = String.valueOf(idInt++);
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone(){
		return phone;
	}
	
	public String getId() {
		return id;
	}
	public void setHomeAddress(HomeAddress homeAddress) {
		this.homeAddress = homeAddress;
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", id=" + id + ", phone=" + phone
				+ ", homeAddress=" + homeAddress + "]";
	}
}
