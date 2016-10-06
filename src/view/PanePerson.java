package view;

import java.util.Arrays;

import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import model.MasterCourseBag;

public class PanePerson {
	private HBox pane;
	private Label firstNameLbl;
	private TextField firstNameField;
	private Label lastNameLbl;
	private TextField lastNameField;
	private Label idLbl;
	private TextField idField;
	private Label phone;
	private TextField phoneField;
	private Label homeAddress;
	private Label street;
	private TextField streetField;
	private Label city;
	private TextField cityField;
	private Label state;
	private TextField stateField;
	private Label zip;
	private TextField zipField;
	private ComboBox<MasterCourseBag> majorBox;
	private MasterCourseBag masterCourseBag;
	private VBox pane2;
	private VBox pane3;


	public PanePerson() {
		
		
		pane = new HBox(20);
		pane2 = new VBox(20);
		pane3 = new VBox(20);
		firstNameLbl = new Label("First Name");
		firstNameField = new TextField();
		lastNameLbl = new Label("Last Name");
		lastNameField = new TextField();
		idLbl = new Label("ID");
		idField = new TextField();
		phone = new Label("Phone");
		phoneField = new TextField();
		homeAddress = new Label("Home Address");
		street = new Label("Street");
		streetField = new TextField();
		city = new Label("City");
		cityField = new TextField();
		state = new Label("State");
		stateField = new TextField();
		zip = new Label("Zip Code");
		zipField = new TextField();
		idField.setEditable(false);
		pane.setPadding(new Insets(20,20,20,20));
		pane2.setPadding(new Insets(20,20,20,20));
		
		pane2.getChildren().addAll(homeAddress,street,streetField,city,cityField,state,stateField,zip,zipField);
		pane.getChildren().addAll( firstNameLbl, firstNameField,lastNameLbl,lastNameField, idLbl, idField, phone, phoneField);
	}

	
	
	public void setPane(HBox h){
		this.pane = h;
}
	


	
	public String getFirstName(){
		return firstNameField.getText();
	}
	public void setFirstName(String firstName) {
		firstNameField.setText(firstName);
	}
	public String getLastName(){
		return lastNameField.getText();
	}
	public void setLastName(String lastName){
		lastNameField.setText(lastName);
	}

	public String getID(){
		return idField.getText();
	}
	public String getPhone(){
		return phoneField.getText();
	}
	public void setPhone(String phone) {
		phoneField.setText(phone);
	}

	public String getStreet(){
		return streetField.getText();
	}
	public void setStreet(String street) {
		streetField.setText(street);
	}

	public String getCity(){
		return cityField.getText();
	}
	public void setCity(String city) {
		cityField.setText(city);
	}

	public String getState(){
		return stateField.getText();
	}
	public void setState(String state) {
		stateField.setText(state);
	}

	public String getZip(){
		return zipField.getText();
	}
	public void setzip(String zip) {
		zipField.setText(zip);
	}
	public Pane getPane() {
		return pane;
	}
	public Pane getPane2(){
		return pane2;
	}
	

}

