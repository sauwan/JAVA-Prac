package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class lab25 extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage stage) throws Exception {
		BorderPane borderPane = new BorderPane();
	
		// Create a VBox for the left side of the BorderPane
		VBox leftBox = new VBox();
		leftBox.getChildren().add(new Button("Vbox 1"));
		leftBox.getChildren().add(new Button("Vbox 2"));
		borderPane.setLeft(leftBox);

		// Create an HBox for the bottom of the BorderPane
		HBox bottomBox = new HBox();
		bottomBox.getChildren().add(new Button("Hbox 1"));
		bottomBox.getChildren().add(new Button("Hbox 2"));
		bottomBox.getChildren().add(new Button("Hbox 3"));
		borderPane.setBottom(bottomBox);

		GridPane grid = new GridPane();
		grid.setMinSize(300, 300);
		grid.setVgap(5);
		grid.setHgap(10);
		grid.setAlignment(Pos.CENTER_LEFT);
		grid.setGridLinesVisible(false);

		grid.add(new Button("Grid 1"), 0, 0);
		grid.add(new Button("Grid 2"), 1, 0);
		grid.add(new Button("Grid 3"), 0, 1);
		grid.add(new Button("Grid 4"), 1, 1);
		borderPane.setRight(grid);

		FlowPane flow = new FlowPane();
		flow.getChildren().addAll(new Button("Flow 1"), new Button("Flow 2"), new Button("Flow 3"));
		flow.setMinSize(100, 100);
		flow.setVgap(5);
		flow.setHgap(10);
		flow.setAlignment(Pos.CENTER_LEFT);
		borderPane.setCenter(flow);

		// Create a Scene with the BorderPane as the root node
		Scene scene = new Scene(borderPane, 400, 400);

		stage.setScene(scene);
		stage.setTitle("Name:Sauwan Thapa");
		stage.show();
	}

}
