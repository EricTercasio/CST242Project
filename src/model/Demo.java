package model;

import java.io.IOException;

public class Demo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		MasterCourseBag masterCourseBag = new MasterCourseBag(20);
		CourseBag courseBag = new CourseBag(2);
		TextBookBag textBookBag = new TextBookBag(5);
		PeopleBag peoplebag = new PeopleBag(100);
		Textbook compSci = new Textbook("Computer Science Introduction", "John Harrison", "Blue Sun", "$100",
				"921-89-01222-02-4", "2010");
		Textbook bioText = new Textbook("Biology Introduction", "Amanda Emert", "Red Dragon", "$200",
				"811-89-01929-42-4", "2006");
		Textbook psychText = new Textbook("Basics to Psychology", "Pete Emert", "Red Dragon", "$250",
				"821-19-22999-20-5", "2014");
		Textbook phyText = new Textbook("What is Physics?", "Joseph Marquez", "Stone House", "$200",
				"841-91-28371-44-1", "2011");
		Textbook musText = new Textbook("Music Theory: SCCC Edition", "Leo Parquo", "Seven Strings", "$400",
				"314-29-09229-45-9", "2009");
		textBookBag.addTextbook(compSci);
		textBookBag.addTextbook(bioText);
		textBookBag.addTextbook(psychText);
		textBookBag.addTextbook(phyText);
		textBookBag.addTextbook(musText);
		Course c1 = new Course("CST 112", "1", compSci, 4);
		Course c2 = new Course("CST 141", "2", compSci, 4);
		Course c3 = new Course("BIO 101", "3", bioText, 4);
		Course c4 = new Course("BIO 115", "4", bioText, 4);
		Course c5 = new Course("PSY 111", "5", psychText, 4);
		Course c6 = new Course("PSY 212", "6", psychText, 4);
		Course c7 = new Course("PHY 100", "7", phyText, 4);
		Course c8 = new Course("PHY 102", "8", phyText, 4);
		Course c9 = new Course("MUS 212", "9", musText, 4);
		Course c10 = new Course("MUS 214", "10", musText, 4);
		masterCourseBag.add(c1);
		masterCourseBag.add(c2);
		masterCourseBag.add(c3);
		masterCourseBag.add(c4);
		masterCourseBag.add(c5);
		masterCourseBag.add(c6);
		masterCourseBag.add(c7);
		masterCourseBag.add(c8);
		masterCourseBag.add(c9);
		masterCourseBag.add(c10);
		CourseType ct1 = new CourseType(c1.getCourseNumber(), CourseCategory.TAKING);
		CourseType ct2 = new CourseType(c2.getCourseNumber(), CourseCategory.TAKING);
		courseBag.add(ct1.getCourseNumber(), ct1.getCourseCategory());
		courseBag.add(ct2.getCourseNumber(), CourseCategory.TO_TAKE);
		 HomeAddress h1 = new HomeAddress("1", "2", "3", "4");
		Student s1 = new Student("Eric", "t", "p", h1, 4.0, "Major", courseBag);
		String name = "Eric";
		String lastName = "Tercasio";
		String phone = "631-512-9104";
		String major = "Computer Science";
		
		s1.setFirstName("Eric");
		s1.setLastName("Tercasio");
		s1.setPhone("631-512-9104");
		s1.setHomeAddress(h1);
		s1.getId();
		
		
		PeopleBag people = new PeopleBag(2);
//		people.addStudent(s1);
//		people.displayStudent();
//		people.saveStudent();
//		people.loadStudent();
//		people.saveFaculty();
//		people.loadFaculty();
//		System.out.println(masterCourseBag.getCourses());
//		String courseNumber = "1";
//		System.out.println(masterCourseBag.findByCourseNumber(courseNumber).getCourseTitle());
//		masterCourseBag.saveCourses();
//		people.displayStudent();
		// 4.0, "Computer Science", courseBag);
		 Student s2 = new Student("Eric", "Tercasios", "Computer Science", h1,
		 4.0, "Computer Science", courseBag);
		 Faculty f1 = new Faculty("Amanda", "Emert", "I dunno", h1, "The Moon","Boss",
		 "Receptionist", 8);

		 PeopleBag pb1 = new PeopleBag(10);
		 pb1.addStudent(s1);
		 pb1.addStudent(s2);
		 pb1.addFaculty(f1);
		 Person p1 = new Person("Bob", "Evans", "631-512-9104", h1 );
		 System.out.println(p1.toString());
		 Person p2 = new Person("Bob", "Evans", "631-222-2222", h1 );
		 System.out.println(p2.toString());
		 System.out.println(s1.toString());
		 courseBag.display();
		 System.out.println(c1.getCredits());
		
		 System.out.println(textBookBag.find(compSci));
		 System.out.println(compSci.getISBN());
		 //pb1.displayStudent();
		 pb1.display();
		 //System.out.println(pb1.find(f1));
		 textBookBag.display();
		 System.out.println(pb1.findStudent(s1));
		 System.out.println(pb1.findFaculty(f1));
		 System.out.println( masterCourseBag.toString());
		 System.out.println(courseBag.toString());
		 System.out.println(s1.toString());
		 pb1.displayStudent();
		 courseBag.getCoursesTaking();
		 courseBag.getCoursesTO_TAKE();
		 courseBag.getCoursesTook();
		 System.out.println(s1.toString());
		 // s1.getCoursesTaking(); I dont know whats wrong with this, or why im returning null for the courseBag and masterCourseBag when displaying a student, i've been trying
		 // for hours to find a solution to this. I've tried switching the methods for getCoursesTaking and to_take and took, but i believe there is some underlying problem somwhere
		 // in my code that makes this not work. I cant figure it out.
	}
}
