package model;

public class Course {
	private String courseTitle;
	private String courseNumber;
	private Textbook textbook;
	private int credits;
	public Course(String courseTitle, String courseNumber, Textbook textbook, int credits) {
		super();
		this.courseTitle = courseTitle;
		this.courseNumber = courseNumber;
		this.textbook = textbook;
		this.credits = credits;
	}
	public String getCourseTitle() {
		return courseTitle;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	public String getCourseNumber() {
		return courseNumber;
	}
	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}
	public Textbook getTextbook() {
		return textbook;
	}
	public void setTextbook(Textbook textbook) {
		this.textbook = textbook;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	@Override
	public String toString() {
		return "Course [courseTitle=" + courseTitle + ", courseNumber=" + courseNumber + ", textbook=" + textbook
				+ ", numbOfCredits=" + credits + "]";
	}
	
}
