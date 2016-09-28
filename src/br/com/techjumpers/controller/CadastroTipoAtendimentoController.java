package br.com.techjumpers.controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CadastroTipoAtendimentoController extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Parent root = FXMLLoader.load(getClass().getResource("/br/com/techjumpers/view/TelaCadEspecialista.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("/style/application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();			
	}

}
