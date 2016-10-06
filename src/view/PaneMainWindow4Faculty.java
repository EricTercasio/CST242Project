package view;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class PaneMainWindow4Faculty {
	private PanePerson panePerson;
	private PaneFaculty paneFaculty;
	private PaneButtons paneButtons;
	private PaneMenuBar paneMenuBar;
	private VBox pane;

	public PaneMainWindow4Faculty() {
		
		panePerson = new PanePerson();
		paneFaculty = new PaneFaculty();
		paneButtons = new PaneButtons();
		paneMenuBar = new PaneMenuBar();
		paneButtons.getOkButton().setText("Save Faculty");
		paneButtons.getDeleteButton().setText("Delete Faculty");
		pane = new VBox(20);
		pane.getChildren().addAll(paneMenuBar.getPane(),panePerson.getPane(),panePerson.getPane2(),
				paneFaculty.getPane(), paneButtons.getPane());
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

	public String getTitleField() {
		return paneFaculty.getTitle();
	}

	public Button getOkBtn() {
		return paneButtons.getOkButton();
	}
	public MenuItem getMenuItem(){
		return paneMenuBar.getSt();
	}
	public String getOfficeAddress() {
		return paneFaculty.getOfficeAddress();
	}
	public String getDepartment(){
		return paneFaculty.getDepartment();
	}
	public int getPay(){
		return paneFaculty.getPay();
	}
}