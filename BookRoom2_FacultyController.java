package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class BookRoom2_FacultyController {
	
	@FXML
	Button btnc01;

	@FXML
	Button btnc02;
	
	@FXML
	Button btnc03;

	@FXML
	Button btnc11;

	@FXML
	Button btnc12;

	@FXML
	Button btnc13;

	@FXML
	Button btnc21;

	@FXML
	Button btnc22;

	@FXML
	Button btnc23;

	@FXML
	Button btnc24;

	@FXML
	Button btns01;

	@FXML
	Button btns02;

	@FXML
	Button btnlr1;

	@FXML
	Button btnlr2;

	@FXML
	Button btnlr3;

	@FXML
	Button btnlr4;

	@FXML
	Button btnbookroom;

	@FXML
	Button btnback;
	
	public void BackButtonHandler(ActionEvent e) throws IOException
	{
		Stage stage = null;
		Parent root = null;
		
		if(e.getSource()== btnback)
		{
			stage = (Stage) btnback.getScene().getWindow();
			root = FXMLLoader.load(getClass().getResource("/application/BookRoom_FacultyPage.fxml"));
		}
		
		Scene scene = new Scene(root);
	      stage.setScene(scene);
	      stage.show();

	}
	
	
	
}
