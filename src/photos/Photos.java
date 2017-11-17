package photos;
	
import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;


public class Photos extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add("resources/photos.css");

			primaryStage.setTitle("Enter Authentication");
			primaryStage.getIcons().add(new Image("resources/icon.png"));
            primaryStage.setScene(scene);
            primaryStage.setResizable(false);

            primaryStage.show();


		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
