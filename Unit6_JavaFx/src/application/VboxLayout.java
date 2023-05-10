package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VboxLayout extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		Button btn1 = new Button("Button1");
		Button btn2 = new Button("Button2");
		TextField tf=new TextField("Test Tf");
		tf.setMaxWidth(200);
		
		VBox vb = new VBox();
		
		vb.setSpacing(30);//among all components
		vb.setAlignment(Pos.CENTER);
		//vb.setMargin(btn1,new Insets(5,5,5,5));
		vb.setFillWidth(false);
		vb.getChildren().addAll(btn1,btn2,tf);
		Scene scene = new Scene(vb,200,200);
		stage.setScene(scene);
		stage.show();
		
	}

}
