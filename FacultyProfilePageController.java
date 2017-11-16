package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.stage.Stage;

public class FacultyProfilePageController {

	@FXML
	public Label lblprofilepage;

	@FXML
	public Label lblfirstname;
	
	@FXML
	public Label lbllastname;
	
	@FXML
	public Label lbluser;
	
	@FXML
	public Label lblgender;
	
	@FXML
	public Label displaygender;
	
	@FXML
	public Label displayfirstname;
	
	@FXML
	public Label displaylastname;
	
	@FXML
	public Label displaytype;
	
	@FXML
	private Button btnviewcour;
	
	@FXML
	private Button btnbookroom;
	
	@FXML
	private Button btnaddcour;
	
	@FXML
	private Button btnviewtt;
	
	@FXML
	private Button btnuploadphoto;
	
	@FXML
	private Separator sepvert;
	
	@FXML 
	public Label lblemail;
	
	@FXML
	public Label displayemail;
	
	@FXML
	public Button btnlogout;
	
	public void LogOutHandler(ActionEvent e)throws IOException
	{
		Stage stage = null;
		Parent root = null;
		
		if(e.getSource()== btnlogout)
		{
			stage = (Stage) btnlogout.getScene().getWindow();
			root = FXMLLoader.load(getClass().getResource("/application/WelcomePage.fxml"));
		}
		
		Scene scene = new Scene(root);
	      stage.setScene(scene);
	      stage.show();
	}
	
	public void BookRoomHandler(ActionEvent e)throws IOException
	{
		Stage stage = null;
		Parent root = null;
		
		if(e.getSource()== btnbookroom)
		{
			stage = (Stage) btnbookroom.getScene().getWindow();
			root = FXMLLoader.load(getClass().getResource("/application/BookRoom_FacultyPage.fxml"));
		}
		
		Scene scene = new Scene(root);
	      stage.setScene(scene);
	      stage.show();
	}
	
	public void ViewTimeTableHandler(ActionEvent e)throws IOException
	{
		Stage stage = null;
		Parent root = null;
		
		if(e.getSource()== btnviewtt)
		{
			stage = (Stage) btnviewtt.getScene().getWindow();
			root = FXMLLoader.load(getClass().getResource("/application/timetable.csv"));
		}
		
		Scene scene = new Scene(root);
	      stage.setScene(scene);
	      stage.show();
	}
	
	public void ViewCoursessHandler(ActionEvent e)throws IOException
	{
		Stage stage = null;
		Parent root = null;
		
		if(e.getSource()== btnviewcour)
		{
			stage = (Stage) btnviewcour.getScene().getWindow();
			root = FXMLLoader.load(getClass().getResource("/application/ViewCourses_FacultyPage.fxml"));
		}
		
		Scene scene = new Scene(root);
	      stage.setScene(scene);
	      stage.show();
	}
	
}
