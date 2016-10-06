package view;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class PaneFaculty extends PanePerson{
	private Label officeAddress;
	private TextField officeField;
	private Label title;
	private TextField titleField;
	private Label department;
	private TextField departmentField;
	private Label pay;
	private TextField payField;
	VBox pane;
	public PaneFaculty() {
		officeAddress = new Label("Office Address");
		officeField = new TextField();
		title = new Label("Title");
		titleField = new TextField();
		department = new Label("Department");
		departmentField = new TextField();
		pay = new Label("Pay (1-10)");
		payField = new TextField();
		pane = new VBox(20);
		pane.setPadding(new Insets(20,20,20,20));
		pane.getChildren().addAll(officeAddress,officeField,title,titleField,department,departmentField,pay,payField);
		
	}
	public String getOfficeAddress() {
		return officeField.getText();
	}
	public String getTitle() {
		return titleField.getText();
	}

	public String getDepartment() {
		return departmentField.getText();
	}

	public int getPay() {
		return Integer.parseInt(payField.getText());
	}

	public VBox getPane() {
		return pane;
	}
	public void setPane(VBox pane) {
		this.pane = pane;
	}
	
	
}
