package br.com.techjumpers;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {	
	private static Stage stage;
	@Override	
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/br/com/techjumpers/view/Main.fxml"));
			Scene scene = new Scene(root);			
			scene.getStylesheets().add(getClass().getResource("/style/application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);			
			primaryStage.show();
			
			Main.stage= primaryStage; //Com isso podemos fechar esta tela 1
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Stage getStage() {
		return stage;
	}

	
	public static void main(String[] args) {
		launch(args);
	}
}
