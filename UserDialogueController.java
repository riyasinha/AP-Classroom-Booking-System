package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
//import javafx.scene.control.Separator;
import javafx.stage.Stage;



public class UserDialogueController extends WelcomePageController {
	@FXML
	private Label lblstatus;
	
	@FXML
	private Button btnviewprofile;
	
//	@FXML
//	public Label lblprofilepage;
//
//	@FXML
//	public Label lblfirstname;
//	
//	@FXML
//	public Label lbllastname;
//	
//	@FXML
//	public Label lbluser;
//	
//	@FXML
//	public Label lblgender;
//	
//	@FXML
//	public Label displaygender;
//	
//	@FXML
//	public Label displayfirstname;
//	
//	@FXML
//	public Label displaylastname;
//	
//	@FXML
//	public Label displaytype;
//	
//	@FXML
//	public Button btnviewreq;
//	
//	@FXML
//	public Button btnviewcour;
//	
//	@FXML
//	public Button btnreqroom;
//	
//	@FXML
//	public Button btnaddcour;
//	
//	@FXML
//	public Button btnviewtt;
//	
//	@FXML
//	public Button btnuploadphoto;
//	
//	@FXML
//	public Separator sepvert;
//	
//	@FXML 
//	public Label lblemail;
//	
//	@FXML
//	public Label displayemail;
//	
	
	
	
	public void ViewProfileHandler(ActionEvent e) throws IOException 
	{
		
		if(e.getSource()== btnviewprofile)
		{
			System.out.println(user);
			if(user.equalsIgnoreCase("Student"))
			{
				
				
				
				System.out.println("Congrats");
	        	System.out.println(user);
	        	Stage stage = null;
	        	FXMLLoader loader= null;
	    		Parent root = null;
	    		System.out.println(emailadd);
	    		
	    		stage = (Stage) btnviewprofile.getScene().getWindow();
	    		loader = new FXMLLoader(getClass().getResource("/application/StudentProfilePage.fxml"));
				//root = FXMLLoader.load(getClass().getResource("/application/StudentProfilePage.fxml"));
				root = loader.load();
	    		//StudentProfilePageController student = root.getC;
				Scene scene = new Scene(root);
			    stage.setScene(scene);
			    //student.displayemail.setText(emailadd);
//	    		student.displayfirstname.setText(firstName);
//	    		student.displaylastname.setText(lastName);
//	    		student.displaygender.setText(gender);
//	    		student.displaytype.setText(user);
			    stage.show();
				
				System.out.print("YOU ARE A STUDENT");
			}
			if(user.equalsIgnoreCase("Faculty"))
			{
				System.out.print("YOU ARE A FACULTY");
				
				System.out.println("Congrats");
	        	System.out.println(user);
	        	Stage stage = null;
	    		Parent root = null;
	    		stage = (Stage) btnviewprofile.getScene().getWindow();
				root = FXMLLoader.load(getClass().getResource("/application/FacultyWelcomePage.fxml"));
				
				Scene scene = new Scene(root);
			      stage.setScene(scene);
			      stage.show();

			}
			if(user.equalsIgnoreCase("Admin"))
			{
				System.out.print("YOU ARE A ADMIN");
			}
			
			
			
		}
	
	}
}
