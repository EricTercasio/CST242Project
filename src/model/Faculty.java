package model;

public class Faculty extends Person{

	private String title;
	private String department;
	private String officeAddress;
	private int payScale; //1-10
	
	public Faculty(String firstName, String lastName, String phone, HomeAddress homeAddress,String officeAddress,String title, String department, int payScale) {
		super(firstName, lastName, phone, homeAddress);
		this.officeAddress = officeAddress;
		this.title = title;
		this.department = department;
		this.payScale = payScale;
	}
	public String getOfficeAddres(){
		return officeAddress;
	}
	public void setOfficeAddress(String office){
		this.officeAddress = office;
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getPayScale() {
		return payScale;
	}

	public void setPayScale(int payScale) {
		this.payScale = payScale;
	}

	@Override
	public String toString() {
		return "Faculty [title=" + title + ", department=" + department + ", payScale=" + payScale + "]";
	}
	
	
}
