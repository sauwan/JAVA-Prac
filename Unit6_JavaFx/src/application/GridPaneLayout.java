package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneLayout extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		Button btn1 = new Button("Button1");
		btn1.setId("btn1Id");
		Button btn2 = new Button("Button2");
		btn2.setId("btn2Id");
		Button btn3 = new Button("Button3");
		btn3.setId("btn3Id");
		Button btn4 = new Button("Button4");
		btn4.setId("btn4Id");
		
		
		
		GridPane root = new GridPane();
		root.setMinSize(300,300);
		root.setVgap(5);
		root.setHgap(10);
		root.setAlignment(Pos.CENTER);
		root.setGridLinesVisible(false);
		
		//arranging the components in Gridpane
		root.add(btn1, 0, 0);root.add(btn3, 1, 0);//0,0 cell
		//0->columm,1->row
		root.add(btn2, 0, 1);root.add(btn4, 1, 1);
		
		Scene scene = new Scene(root);
		//adding external css file
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		stage.setScene(scene);
		stage.show();
		
	}

}
