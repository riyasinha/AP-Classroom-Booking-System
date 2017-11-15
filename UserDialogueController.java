package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;



public class UserDialogueController extends WelcomePageController {
	@FXML
	private Label lblstatus;
	
	@FXML
	private Button btnviewprofile;
	
	
	
	
	public void ViewProfileHandler(ActionEvent e) throws IOException 
	{
		if(e.getSource()== btnviewprofile)
		{
			System.out.println(user);
			if(user=="Student")
			{
				System.out.print("YOU ARE A STUDENT");
			}
			if(user=="Faculty")
			{
				System.out.print("YOU ARE A FACULTY");
			}
			if(user=="Admin")
			{
				System.out.print("YOU ARE A ADMIN");
			}
		}
	
	}
}
