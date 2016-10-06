package model;


public class Student extends Person  {

	private double gpa;
	private String major;
	private int creditsTaking;

	private CourseBag courseBag;
	private MasterCourseBag masterCourseBag;

	public Student(String fName, String lName, String phone, HomeAddress address, double gpa, String major, CourseBag courseBag) {
		super(fName, lName, phone, address);
		this.gpa = gpa;
		this.major = major;
			
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getCreditsTaking() {
		String[] coursesTaking = getCoursesTaking();
		int total = 0;
		for(int i = 0; i < coursesTaking.length; i++) {
			total += masterCourseBag.findByCourseNumber(coursesTaking[i]).getCredits();
		}
		return total;
	}

	public void setCreditsTaking(int creditsTaking) {
		this.creditsTaking = creditsTaking;
	}
	
	public String[] getCoursesTook() {
		return courseBag.getCoursesTook();
	}
	
	public String[] getCoursesTaking() {
		return courseBag.getCoursesTaking();
	}

	public String[] getCoursesToTake() {
		return courseBag.getCoursesTO_TAKE();
	}

	@Override
	public String toString() {
		return "Student [gpa=" + gpa + ", major=" + major + ", creditsTaking=" + creditsTaking + ", courseBag="
				+ courseBag + ", masterCourseBag=" + masterCourseBag + "]";
	}

	

}

