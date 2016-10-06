package view;

import java.util.Arrays;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import model.MasterCourseBag;


public class PaneStudent extends PanePerson {
	
	private Label gpaLbl;
	private TextField gpaField;
	private Label courses;
	private HBox pane;
	private Button selectCourses;
	private Button tookButton;
	private Button toTakeButton;
	private MasterCourseBag masterCourseBag;
	private Button courseButton;
	private HBox majorBox;
	private ComboBox<String> comboBox;
	private ObservableList<String> options;
	private Label major;
	private TextField majorField;
	private Label textBook;
	private ComboBox<String> textBookBox;
	private ObservableList<String> textBookOptions;
	



	public PaneStudent() { 
		
		//comboBox.getItems().add("1");
		
		
		ObservableList<String> options = FXCollections.observableArrayList(
		        "CST 112",
		        "CST 141",
		        "BIO 101",
		        "BIO 115",
		        "PSY 111",
		        "PSY 212",
		        "PHY 100",
		        "PHY 102",
		        "MUS 212",
		        "MUS 214"
		    );
		comboBox = new ComboBox<String>(options);
		
		pane = new HBox(20);
		
		gpaLbl = new Label("GPA ");
		
		gpaField = new TextField();
		courses = new Label("Courses : ");
		courseButton = new Button("Taking Course");
		tookButton = new Button("Course Taken");
		toTakeButton = new Button("To Take Course");
		major = new Label("Major");
		majorField = new TextField();
		
		majorBox = new HBox(20);
		majorBox.setPadding(new Insets(20,20,20,20));
		pane.setPadding(new Insets(20,20,20,20));
		majorBox.getChildren().addAll(major,majorField);
		pane.getChildren().addAll(gpaLbl, gpaField,courses,comboBox,courseButton,tookButton,toTakeButton);
	}
	
	

	public ComboBox<String> getComboBox() {
		return comboBox;
	}
	public String getComboBoxValue(){
		return comboBox.getValue();
	}

	public void setComboBox(ComboBox<String> comboBox) {
		this.comboBox = comboBox;		
	}

	public double getGpa() {
		return Double.parseDouble(gpaField.getText());
	}

	public void setGpa(double gpa) {
		gpaField.setText(String.valueOf(gpa));
	}

	public Pane getPane() {
		return pane;
	}
	public String getMajor(){
		return majorField.getText();
	}
	public Pane getMajorBox(){
		return majorBox;
	}
	public Button getCourseButton(){
		return courseButton;
	}
	public Button getToTakeButton(){
		return toTakeButton;
	}
	public Button getTakenButton(){
		return tookButton;
	}


}
