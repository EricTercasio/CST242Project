package model;

public class CourseType {
	private CourseCategory courseCategory;
	private String courseNumber;
	public CourseType(String courseNumber, CourseCategory courseCategory) {
		
		this.courseCategory = courseCategory;
		this.courseNumber = courseNumber;
	}
	public CourseCategory getCourseCategory() {
		return courseCategory;
	}
	public void setCourseCategory(CourseCategory courseCategory) {
		this.courseCategory = courseCategory;
	}
	public String getCourseNumber() {
		return courseNumber;
	}
	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}
	@Override
	public String toString() {
		return "CourseType [courseCategory=" + courseCategory + ", courseNumber=" + courseNumber + "]";
	}
	
	
}
