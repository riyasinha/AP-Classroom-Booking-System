package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class BookRoom_FacultyController {
	
	@FXML
	private Label lblpage;
	
	@FXML
	private Label lblenterday;
	
	@FXML
	private Label lblendtime;
	
	@FXML
	private Label lblstarttime;
	
	@FXML
	private Button btnsearchroom;
	
	@FXML
	private TextField txtstarttime;
	
	@FXML
	private TextField txtendtime;
	
	@FXML
	private DatePicker pickdate;
	
	@FXML
	private Button btnback;
	
	
	public void SearchRoomHandler(ActionEvent e)throws IOException
	{
		Stage stage = null;
		Parent root = null;
		
		if(e.getSource()== btnsearchroom)
		{
			stage = (Stage) btnsearchroom.getScene().getWindow();
			root = FXMLLoader.load(getClass().getResource("/application/BookRoom2_FacultyPage.fxml"));
		}
		
		Scene scene = new Scene(root);
	      stage.setScene(scene);
	      stage.show();
	}
	
	public void BackButtonHandler(ActionEvent e) throws IOException
	{
		Stage stage = null;
		Parent root = null;
		
		if(e.getSource()== btnback)
		{
			stage = (Stage) btnback.getScene().getWindow();
			root = FXMLLoader.load(getClass().getResource("/application/FacultyWelcomePage.fxml"));
		}
		
		Scene scene = new Scene(root);
	      stage.setScene(scene);
	      stage.show();

	}
	
	
	
	

}
