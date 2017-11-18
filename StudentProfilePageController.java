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

public class StudentProfilePageController extends UserDialogueController{
	
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
	private Button btnviewreq;
	
	@FXML
	private Button btnviewcour;
	
	@FXML
	private Button btnreqroom;
	
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
	
	/**
	 * 
	 * @param e this allows the student to view his requests and see the status
	 * of the requests
	 * @param btnviewreq this opens in another page ViewRoomRequest_StudentPage
	 * which displays the status of the request.
	 * @throws IOException
	 */
	public void ViewRoomRequestsHandler(ActionEvent e)throws IOException
	{
		Stage stage = null;
		Parent root = null;
		
		if(e.getSource()== btnviewreq)
		{
			stage = (Stage) btnviewreq.getScene().getWindow();
			root = FXMLLoader.load(getClass().getResource("/application/ViewRoomRequest_StudentPage.fxml"));
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
			root = FXMLLoader.load(getClass().getResource("/application/Viewcourses_StudentPage.fxml"));
		}
		
		Scene scene = new Scene(root);
	      stage.setScene(scene);
	      stage.show();
	}
	
	public void setEmail(String email)
	{
		displayemail.setText(email);
	}
	/**
	 * 
	 * @param e this offers the student to request a room based on his needs and offers the options for 
	 * student to fill in
	 * @param btnreqroom this redirects the student to StudentRequestRoom_Page.fxml
	 * @throws IOException
	 */
	public void RequestRoomHandler(ActionEvent e)throws IOException
	{
		Stage stage = null;
		Parent root = null;
		
		if(e.getSource()== btnreqroom)
		{
			stage = (Stage) btnreqroom.getScene().getWindow();
			root = FXMLLoader.load(getClass().getResource("/application/StudentRequestRoom_Page.fxml"));
		}
		
		Scene scene = new Scene(root);
	      stage.setScene(scene);
	      stage.show();
	}
	
}
