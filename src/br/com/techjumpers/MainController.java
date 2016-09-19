package br.com.techjumpers;

import java.io.IOException;
import java.lang.invoke.SwitchPoint;
import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class MainController  {

	@FXML
	private PasswordField pass;

	@FXML
	private Button btnEntrar;

	private Button btSair;
	

	public void btnEntrar(ActionEvent event) {
		if (pass.getText().equals("admin")) {
			try {
				segundaTela();
			} catch (IOException e) {				
				e.printStackTrace();
			}
		} else {
			JOptionPane.showMessageDialog(null, "Senha Incorreta!");
		}
	}

	public void btnEnter(KeyEvent e) {
		if (e.getCode() == KeyCode.ENTER) {
			if (pass.getText().equals("admin")) {
				System.out.println("Entrou com o Enter!");
			} else {
				System.out.println("Senhas Incorretas!");
			}
		}
	}
	
	

	public void btnSair(ActionEvent event) {
		System.exit(0);
	}

	public void segundaTela() throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/br/com/techjumpers/view/Principal.fxml"));
		Scene scene = new Scene(root);
		Stage segunda = new Stage();
		segunda.setScene(scene);
		segunda.setMaximized(true);
		segunda.show();
	}
	
	public Button getBtnEntrar() {
		return btnEntrar;
	}
	

	

}
