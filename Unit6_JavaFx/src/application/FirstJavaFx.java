package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class FirstJavaFx extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage stage) throws Exception {
		
		Button btn= new Button("Exit Button");
		Button open= new Button("Open Folder");
		
		open.setOnAction(e->new FileChooser().showOpenDialog(stage));//event handling
		btn.setOnAction(e->System.exit(0));//event handling
		
		btn.setStyle("-fx-background-color:green");//CSS
		FlowPane root = new FlowPane();//default left alignment
		
		root.getChildren().addAll(btn,open);
		stage.show();
		Scene scene = new Scene(root,300,300);//size of scene
		stage.setScene(scene);
	}

}
