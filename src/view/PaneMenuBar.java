package view;

import javafx.application.Platform;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class PaneMenuBar {
	private MenuBar menuBar;
	private MenuItem st = new MenuItem("Person");
	private MenuItem fa = new MenuItem("Faculty");
	private MenuItem exit = new MenuItem("Exit");
	private Menu menu1;
	private HBox pane;

	public PaneMenuBar(){

		MenuBar menuBar = new MenuBar();
		final Menu menu1 = new Menu("Person Type");
		menu1.getItems().addAll(st,fa,exit);
		menuBar.getMenus().addAll(menu1);
		exit.setOnAction(e ->{
			Platform.exit();
		});
		pane = new HBox(20);
		pane.getChildren().add(menuBar);
		
	}
	public MenuBar getMenuBar() {
		return menuBar;
	}
	
	public MenuItem getSt() {
		return st;
	}
	
	public void setMenuBar(MenuBar menuBar) {
		this.menuBar = menuBar;
	}
	public void setSt(MenuItem st) {
		this.st = st;
	}
	public void setFa(MenuItem fa) {
		this.fa = fa;
	}
	public void setMenu1(Menu menu1) {
		this.menu1 = menu1;
	}
	public void setPane(HBox pane) {
		this.pane = pane;
	}
	public MenuItem getFa() {
		return fa;
		
	}
	
	public Menu getMenu1() {
		return menu1;
	}
	
	public HBox getPane() {
		return pane;
	}

}
