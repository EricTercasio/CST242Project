package view;



import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public class PaneButtons {
	private Button okBtn = new Button("Save Student");
	private Button deleteButton = new Button("Delete Student");
	private Button courseButton;
	private HBox pane;

	
	public PaneButtons() {
	

		pane = new HBox(20);
		pane.setPadding(new Insets(0,0,20,20));
		pane.getChildren().addAll(okBtn, deleteButton);
		
	}
	
	public Pane getPane() {
		return pane;
	}

	public Button getOkButton() {
		return okBtn;
	}
	public Button getCourseButton(){
		return courseButton;
	}
	public void setOkButton(String name){
		okBtn = new Button(name);
	}
	public Button getDeleteButton(){
		return deleteButton;
	}

}
