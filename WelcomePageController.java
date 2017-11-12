package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class WelcomePageController {

	@FXML
	private Label email;
	
	@FXML
	private Label pswd;
	
	@FXML
	private TextField email_text;
	
	@FXML
	private PasswordField pswd_text;
	
	@FXML
	private Button login;
	
	@FXML
	private Button signup;
	
	@FXML
	private Button for_pswd;
	
	@FXML
	private Label stat;
	
	public void SignUpButtonHandler(ActionEvent e) throws IOException
	{
		Stage stage = null;
		Parent root = null;
		
		if(e.getSource()== signup)
		{
			stage = (Stage) signup.getScene().getWindow();
			root = FXMLLoader.load(getClass().getResource("/application/SignUp.fxml"));
		}
		
		Scene scene = new Scene(root);
	      stage.setScene(scene);
	      stage.show();

	}
	

}
