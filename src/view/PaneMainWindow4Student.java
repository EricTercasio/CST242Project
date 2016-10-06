package view;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class PaneMainWindow4Student {
	private PanePerson panePerson;
	private PaneStudent paneStudent;
	private PaneButtons paneButtons;
	private PaneMenuBar paneMenuBar;
	private VBox pane;

	public PaneMainWindow4Student() {
		
		panePerson = new PanePerson();
		paneStudent = new PaneStudent();
		paneButtons = new PaneButtons();
		paneButtons.getOkButton().setText("Save Student");
		paneButtons.getDeleteButton().setText("Delete Student");
		paneMenuBar = new PaneMenuBar();
		pane = new VBox(20);
		pane.getChildren().addAll(paneMenuBar.getPane(),panePerson.getPane(),panePerson.getPane2(),
				paneStudent.getPane(),paneStudent.getMajorBox(), paneButtons.getPane());
	}

	public Pane getPane() {
		return pane;
	}

	public String getFirstName() {
		return panePerson.getFirstName();
	}
	public String getLastName(){
		return panePerson.getLastName();
	}

	public String getId() {
		return panePerson.getID();
	}
	public String getPhone() {
		return panePerson.getPhone();
	}

	public String getStreet() {
		return panePerson.getStreet();
	}
	public String getcity() {
		return panePerson.getCity();
	}
	public String getState() {
		return panePerson.getState();
	}
	public String getzip() {
		return panePerson.getZip();
	}

	public double getGpa() {
		return paneStudent.getGpa();
	}
	public String getMajor(){
		return paneStudent.getMajor();
	}
	public Button getOkBtn() {
		return paneButtons.getOkButton();
	}
	public Button getCourseButton(){
		return paneStudent.getCourseButton();
	}
	public Button getToTakeButton(){
		return paneStudent.getToTakeButton();
	}
	public Button getTakenButton(){
		return paneStudent.getTakenButton();
	}
	public ComboBox getComboBox(){
		return paneStudent.getComboBox();
	}
	public MenuBar getMenuBar(){
		return paneMenuBar.getMenuBar();
	}
	public Menu getMenu(){
		return paneMenuBar.getMenu1();
	}
	public MenuItem getMenuItem(){
		return paneMenuBar.getFa();
	}

}

