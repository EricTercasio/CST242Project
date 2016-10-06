package view;

import java.util.Arrays;

import javafx.scene.control.ComboBox;
import model.MasterCourseBag;

public class CourseDropBox {
	ComboBox major;
	MasterCourseBag masterCourseBag;

	public CourseDropBox(ComboBox major) {
		super();
		this.major = major;
	}

	public ComboBox getMajor() {
		return major;
	}

	public void setMajor(String string) {
		major.getItems().add(string);
	}
}
