package view;

import java.util.Arrays;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.PeopleBag;
import model.Course;
import model.CourseBag;
import model.MasterCourseBag;
import model.Student;
import model.TextBookBag;
import model.Textbook;
import model.CourseCategory;
import model.Person;
import model.HomeAddress;
import model.Faculty;
public class MainWindow extends Application {
	private Button okBtn;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String street;
	private String city;
	private String state;
	private String zip;
	private String major;
	private String office;
	private String title;
	private String department;
	private int pay;
	private double gpa;
	private Button courseButton;
	private Button toTakeButton;
	private Button takenButton;
	private MenuItem fa;
	private MenuItem st;
	private MenuBar menuBar;
	private Menu menu;
	private PeopleBag peopleBag;
	private MasterCourseBag masterCourseBag;
	private CheckBox courseBox;

	public void start(Stage stage) throws Exception {
		//Data because i cant get the load and save methods to work.
		MasterCourseBag masterCourseBag = new MasterCourseBag(20);
		CourseBag courseBag = new CourseBag(100);
		TextBookBag textBookBag = new TextBookBag(5);
		HomeAddress homeAddress = new HomeAddress(street, city, state, zip);

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
		//Gui



		PaneMainWindow4Student paneMainWindow4Student = new PaneMainWindow4Student();
		PaneMainWindow4Faculty paneMainWindow4Faculty = new PaneMainWindow4Faculty();
		Scene scene = new Scene(paneMainWindow4Student.getPane(), 1000, 750);
		Scene scene2 = new Scene(paneMainWindow4Faculty.getPane(), 1000, 950);
		paneMainWindow4Student.getMenuItem().setOnAction(e ->{
			
		stage.setScene(scene2);
		});
		paneMainWindow4Faculty.getMenuItem().setOnAction(e ->{
			
			stage.setScene(scene);
			paneMainWindow4Faculty.getOkBtn().setText("Save Faculty");
			okBtn.setOnAction(g -> {
				firstName = paneMainWindow4Faculty.getFirstName();
				lastName = paneMainWindow4Faculty.getLastName();
				phoneNumber = paneMainWindow4Faculty.getPhone();
				street = paneMainWindow4Faculty.getStreet();
				state = paneMainWindow4Faculty.getState();
				city = paneMainWindow4Faculty.getcity();
				zip = paneMainWindow4Faculty.getzip();
				office = paneMainWindow4Faculty.getOfficeAddress();
				title = paneMainWindow4Faculty.getTitleField();
				department = paneMainWindow4Faculty.getDepartment();
				pay = paneMainWindow4Faculty.getPay();
				homeAddress.setStreet(street);
				homeAddress.setCity(city);
				homeAddress.setState(state);
				homeAddress.setZip(zip);

				Faculty s = new Faculty(firstName, lastName, phoneNumber, homeAddress, office, title, department, pay);
				peopleBag.addFaculty(s);
				System.out.println(s);
				peopleBag.display();
				System.out.println(s.getPhone());
				
			});
		});
		
		
		PaneFaculty paneFaculty = new PaneFaculty();
		okBtn = paneMainWindow4Student.getOkBtn();
		peopleBag = new PeopleBag(100);
		courseButton = paneMainWindow4Student.getCourseButton();
		toTakeButton = paneMainWindow4Student.getToTakeButton();
		takenButton = paneMainWindow4Student.getTakenButton();
		ComboBox cBox = paneMainWindow4Student.getComboBox();
		
		


		courseButton.setOnAction(f -> {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Select Majors");
			if (cBox.getValue() == "CST 112"){
			alert.setHeaderText(masterCourseBag.findByCourseNumber("1").getCourseTitle() + " has been added to your courses taking.");
			courseBag.add(masterCourseBag.findByCourseNumber("1").getCourseTitle(), CourseCategory.TAKING);
			}
			if (cBox.getValue() == "CST 141"){
				alert.setHeaderText(masterCourseBag.findByCourseNumber("2").getCourseTitle()+ " has been added to your courses taking.");
				courseBag.add(masterCourseBag.findByCourseNumber("2").getCourseTitle(), CourseCategory.TAKING);
			}
			if (cBox.getValue() == "BIO 101"){
				alert.setHeaderText(masterCourseBag.findByCourseNumber("3").getCourseTitle()+ " has been added to your courses taking.");
				courseBag.add(masterCourseBag.findByCourseNumber("3").getCourseTitle(), CourseCategory.TAKING);
			}
			if (cBox.getValue() == "BIO 115"){
				alert.setHeaderText(masterCourseBag.findByCourseNumber("4").getCourseTitle()+ " has been added to your courses taking.");
				courseBag.add(masterCourseBag.findByCourseNumber("4").getCourseTitle(), CourseCategory.TAKING);
			}
			if (cBox.getValue() == "PSY 111"){
				alert.setHeaderText(masterCourseBag.findByCourseNumber("5").getCourseTitle()+ " has been added to your courses taking.");
				courseBag.add(masterCourseBag.findByCourseNumber("5").getCourseTitle(), CourseCategory.TAKING);
			}
			if (cBox.getValue() == "PSY 212"){
				alert.setHeaderText(masterCourseBag.findByCourseNumber("6").getCourseTitle()+ " has been added to your courses taking.");
				courseBag.add(masterCourseBag.findByCourseNumber("6").getCourseTitle(), CourseCategory.TAKING);
			}
			if (cBox.getValue() == "PHY 100"){
				alert.setHeaderText(masterCourseBag.findByCourseNumber("7").getCourseTitle()+ " has been added to your courses taking.");
				courseBag.add(masterCourseBag.findByCourseNumber("7").getCourseTitle(), CourseCategory.TAKING);
			}
			if (cBox.getValue() == "PHY 102"){
				alert.setHeaderText(masterCourseBag.findByCourseNumber("8").getCourseTitle()+ " has been added to your courses taking.");
				courseBag.add(masterCourseBag.findByCourseNumber("8").getCourseTitle(), CourseCategory.TAKING);
			}
			if (cBox.getValue() == "MUS 212"){
				alert.setHeaderText(masterCourseBag.findByCourseNumber("9").getCourseTitle()+ " has been added to your courses taking.");
				courseBag.add(masterCourseBag.findByCourseNumber("9").getCourseTitle(), CourseCategory.TAKING);
			}
			if (cBox.getValue() == "MUS 214"){
				alert.setHeaderText(masterCourseBag.findByCourseNumber("10").getCourseTitle()+ " has been added to your courses taking.");
				courseBag.add(masterCourseBag.findByCourseNumber("10").getCourseTitle(), CourseCategory.TAKING);
			}
			
			alert.showAndWait();
		});
		takenButton.setOnAction(f -> {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Select Majors");
			if (cBox.getValue() == "CST 112"){
			alert.setHeaderText(masterCourseBag.findByCourseNumber("1").getCourseTitle() + " has been added to your courses taken.");
			courseBag.add(masterCourseBag.findByCourseNumber("1").getCourseTitle(), CourseCategory.TOOK);
			}
			if (cBox.getValue() == "CST 141"){
				alert.setHeaderText(masterCourseBag.findByCourseNumber("2").getCourseTitle()+ " has been added to your courses taken.");
				courseBag.add(masterCourseBag.findByCourseNumber("2").getCourseTitle(), CourseCategory.TOOK);
			}
			if (cBox.getValue() == "BIO 101"){
				alert.setHeaderText(masterCourseBag.findByCourseNumber("3").getCourseTitle()+ " has been added to your courses taken.");
				courseBag.add(masterCourseBag.findByCourseNumber("3").getCourseTitle(), CourseCategory.TOOK);
			}
			if (cBox.getValue() == "BIO 115"){
				alert.setHeaderText(masterCourseBag.findByCourseNumber("4").getCourseTitle()+ " has been added to your courses taken.");
				courseBag.add(masterCourseBag.findByCourseNumber("4").getCourseTitle(), CourseCategory.TOOK);
			}
			if (cBox.getValue() == "PSY 111"){
				alert.setHeaderText(masterCourseBag.findByCourseNumber("5").getCourseTitle()+ " has been added to your courses taken.");
				courseBag.add(masterCourseBag.findByCourseNumber("5").getCourseTitle(), CourseCategory.TOOK);
			}
			if (cBox.getValue() == "PSY 212"){
				alert.setHeaderText(masterCourseBag.findByCourseNumber("6").getCourseTitle()+ " has been added to your courses taken.");
				courseBag.add(masterCourseBag.findByCourseNumber("6").getCourseTitle(), CourseCategory.TOOK);
			}
			if (cBox.getValue() == "PHY 100"){
				alert.setHeaderText(masterCourseBag.findByCourseNumber("7").getCourseTitle()+ " has been added to your courses taken.");
				courseBag.add(masterCourseBag.findByCourseNumber("7").getCourseTitle(), CourseCategory.TOOK);
			}
			if (cBox.getValue() == "PHY 102"){
				alert.setHeaderText(masterCourseBag.findByCourseNumber("8").getCourseTitle()+ " has been added to your courses taken.");
				courseBag.add(masterCourseBag.findByCourseNumber("8").getCourseTitle(), CourseCategory.TOOK);
			}
			if (cBox.getValue() == "MUS 212"){
				alert.setHeaderText(masterCourseBag.findByCourseNumber("9").getCourseTitle()+ " has been added to your courses taken.");
				courseBag.add(masterCourseBag.findByCourseNumber("9").getCourseTitle(), CourseCategory.TOOK);
			}
			if (cBox.getValue() == "MUS 214"){
				alert.setHeaderText(masterCourseBag.findByCourseNumber("10").getCourseTitle()+ " has been added to your courses taken.");
				courseBag.add(masterCourseBag.findByCourseNumber("10").getCourseTitle(), CourseCategory.TOOK);
			}
			
			alert.showAndWait();
		});
		toTakeButton.setOnAction(f -> {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Select Majors");
			if (cBox.getValue() == "CST 112"){
			alert.setHeaderText(masterCourseBag.findByCourseNumber("1").getCourseTitle() + " has been added to your courses that need to be taken.");
			courseBag.add(masterCourseBag.findByCourseNumber("1").getCourseTitle(), CourseCategory.TO_TAKE);
			}
			if (cBox.getValue() == "CST 141"){
				alert.setHeaderText(masterCourseBag.findByCourseNumber("2").getCourseTitle()+ " has been added to your courses that need to be taken.");
				courseBag.add(masterCourseBag.findByCourseNumber("2").getCourseTitle(), CourseCategory.TO_TAKE);
			}
			if (cBox.getValue() == "BIO 101"){
				alert.setHeaderText(masterCourseBag.findByCourseNumber("3").getCourseTitle()+ " has been added to your courses that need to be taken.");
				courseBag.add(masterCourseBag.findByCourseNumber("3").getCourseTitle(), CourseCategory.TO_TAKE);
			}
			if (cBox.getValue() == "BIO 115"){
				alert.setHeaderText(masterCourseBag.findByCourseNumber("4").getCourseTitle()+ " has been added to your courses that need to be taken.");
				courseBag.add(masterCourseBag.findByCourseNumber("4").getCourseTitle(), CourseCategory.TO_TAKE);
			}
			if (cBox.getValue() == "PSY 111"){
				alert.setHeaderText(masterCourseBag.findByCourseNumber("5").getCourseTitle()+ " has been added to your courses that need to be taken.");
				courseBag.add(masterCourseBag.findByCourseNumber("5").getCourseTitle(), CourseCategory.TO_TAKE);
			}
			if (cBox.getValue() == "PSY 212"){
				alert.setHeaderText(masterCourseBag.findByCourseNumber("6").getCourseTitle()+ " has been added to your courses that need to be taken.");
				courseBag.add(masterCourseBag.findByCourseNumber("6").getCourseTitle(), CourseCategory.TO_TAKE);
			}
			if (cBox.getValue() == "PHY 100"){
				alert.setHeaderText(masterCourseBag.findByCourseNumber("7").getCourseTitle()+ " has been added to your courses that need to be taken.");
				courseBag.add(masterCourseBag.findByCourseNumber("7").getCourseTitle(), CourseCategory.TO_TAKE);
			}
			if (cBox.getValue() == "PHY 102"){
				alert.setHeaderText(masterCourseBag.findByCourseNumber("8").getCourseTitle()+ " has been added to your courses that need to be taken.");
				courseBag.add(masterCourseBag.findByCourseNumber("8").getCourseTitle(), CourseCategory.TO_TAKE);
			}
			if (cBox.getValue() == "MUS 212"){
				alert.setHeaderText(masterCourseBag.findByCourseNumber("9").getCourseTitle()+ " has been added to your courses that need to be taken.");
				courseBag.add(masterCourseBag.findByCourseNumber("9").getCourseTitle(), CourseCategory.TO_TAKE);
			}
			if (cBox.getValue() == "MUS 214"){
				alert.setHeaderText(masterCourseBag.findByCourseNumber("10").getCourseTitle()+ " has been added to your courses that need to be taken.");
				courseBag.add(masterCourseBag.findByCourseNumber("10").getCourseTitle(), CourseCategory.TO_TAKE);
			}
			
			alert.showAndWait();
		});
		okBtn.setOnAction(e -> {
			firstName = paneMainWindow4Student.getFirstName();
			lastName = paneMainWindow4Student.getLastName();
			phoneNumber = paneMainWindow4Student.getPhone();
			street = paneMainWindow4Student.getStreet();
			state = paneMainWindow4Student.getState();
			city = paneMainWindow4Student.getcity();
			zip = paneMainWindow4Student.getzip();
			homeAddress.setStreet(street);
			homeAddress.setCity(city);
			homeAddress.setState(state);
			homeAddress.setZip(zip);
			major = paneMainWindow4Student.getMajor();
			gpa = paneMainWindow4Student.getGpa();
			Student s = new Student(firstName, lastName, phoneNumber, homeAddress, gpa, major, courseBag);
			peopleBag.addStudent(s);
			System.out.println(s);
			peopleBag.displayStudent();
			System.out.println(s.getPhone());
			//As a result of the comment in my demo class, this also i can not get to work because of the courses.
		});

		stage.setScene(scene);
		stage.show();
	}
}
