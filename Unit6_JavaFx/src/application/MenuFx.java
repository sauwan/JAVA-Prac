package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MenuFx extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
	
		Label name = new Label("Demonstration of Menu"); 
		MenuBar bar = new MenuBar();
		Menu file = new Menu("File");
		MenuItem open = new MenuItem("open");
		MenuItem save = new MenuItem("save");
		MenuItem exit = new MenuItem("exit");
		
		Menu edit = new Menu("Edit");
		MenuItem paste=new MenuItem("Paste");
		MenuItem delete = new MenuItem("Delete");
		
		BorderPane root = new BorderPane();
		root.setTop(bar);//layout's north part
		root.setCenter(name);
		file.getItems().addAll(open,save,exit);
		edit.getItems().addAll(paste,delete);
		
		bar.getMenus().addAll(file,edit);
		Scene scene = new Scene(root,300,300);
		stage.setScene(scene);
		stage.setTitle("Sauwan Thapa");
		stage.show();
		
		
	}

}
