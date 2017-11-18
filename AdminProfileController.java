package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * This is the profile page of an Admin which opens when a person who is an admin has logged in
 * and has clicked on view profile. It displays a variety of options for admin to choose.
 */
public class AdminProfileController {
	
	/**
	 * @param displayfirstname displays the users first name
	 * @param displaylastname displays the users last name
	 * @param displaygender displays the users first name
	 * @param displayemail displays the users email ID
	 * @param displaytype displays the users type ie; for admin here it will be admin
	 * 
	 */
	@FXML
	private Label lblfirstname;
	
	@FXML
	private Label lbllastname;
	
	@FXML
	 Label displayfirstname;
	
	@FXML
	 Label displaylastname;
	
	@FXML
	private Label lblgender;
	
	@FXML
	 Label displaygender;
	
	@FXML
	private Label lblemailid;
	
	@FXML
	 Label displayemail;
	
	@FXML
	private Label lblusertype;
	
	@FXML
	 Label displaytype;
	
	@FXML
	private Button btnuploadimage;
	
	@FXML
	private Button btnbookroom;
	
	@FXML
	private Button btnviewroomrequest;
	
	/*@FXML
	private Image */
	
	@FXML
	private Label lblphoto;
	
	@FXML
	private TextField txtphoto;
	
	@FXML
	private ImageView imageview;
	
	@FXML
	public Button btnlogout;
	/**
	 * 
	 * @param e the logout button handler transfers the user to the home page where he can enter the details again to log in
	 * @param e btnlogout helps the user to log out
	 * @throws IOException
	 */
	
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
	 * This is to upload an image by the user
	 * @param e This is for uploading images by setting a path. if the image is in the same file then the user simply sets the name.
	 * btnuploadimage this button enables the user to upload his/her photo in jpeg/png format
	 * @throws IOException
	 */
	public void UploadphotoHandler(ActionEvent e) throws IOException
	{
		if(e.getSource()== btnuploadimage)
		{
			Image image = new Image(getClass().getResource(txtphoto.getText()).toExternalForm());
			imageview.setImage(image);
		}
	}
	/**
	 * 
	 * @param e the book room  handler transfers the page to AdminBookRoom_page.fxml
	 * @param btbookroom this goes to the admin book room page for options about various rooms to be booked
	 * @throws IOException
	 */
	
	public void BookRoomHandler(ActionEvent e)throws IOException
	{
		Stage stage = null;
		Parent root = null;
		
		if(e.getSource()== btnbookroom)
		{
			stage = (Stage) btnbookroom.getScene().getWindow();
			root = FXMLLoader.load(getClass().getResource("/application/AdminBookRoom_Page.fxml"));
		}
		
		Scene scene = new Scene(root);
	      stage.setScene(scene);
	      stage.show();
	}
	/**
	 * 
	 * @param e views the requests that are sent by student
	 * This page redirects the admin to AdmniViewRequests.fxml
	 * @throws IOException
	 */
	public void ViewRequestHandler(ActionEvent e)throws IOException
	{
		Stage stage = null;
		Parent root = null;
		
		if(e.getSource()== btnviewroomrequest)
			
		{
			stage = (Stage) btnbookroom.getScene().getWindow();
			root = FXMLLoader.load(getClass().getResource("/application/AdminViewRequests.fxml"));
		}
		
		Scene scene = new Scene(root);
	      stage.setScene(scene);
	      stage.show();
	
		
	}
}
