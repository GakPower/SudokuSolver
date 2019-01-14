import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

public class Main extends Application {

	private static Stage stage;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws IOException {
		stage = primaryStage;

		primaryStage.setTitle("Sudoku Solver");
		primaryStage.setResizable(false);
		//primaryStage.initStyle(StageStyle.TRANSPARENT);


		Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("app.fxml"));
		Scene scene = new Scene(root);

		setTransparentFillScene(scene);
		makeDraggable(root);

		primaryStage.setScene(scene);

		primaryStage.show();
	}

	private void setTransparentFillScene(Scene scene){
		scene.setFill(Color.TRANSPARENT);
	}
	private void makeDraggable(Parent root){

		AtomicReference<Double> xOffset = new AtomicReference<>((double) 0);
		AtomicReference<Double> yOffset = new AtomicReference<>((double) 0);

		root.setOnMousePressed(event -> {
			xOffset.set(event.getSceneX());
			yOffset.set(event.getSceneY());
		});

		root.setOnMouseDragged(event -> {
			stage.setX(event.getScreenX() - xOffset.get());
			stage.setY(event.getScreenY() - yOffset.get());
		});

	}
}
