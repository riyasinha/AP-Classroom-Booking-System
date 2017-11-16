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


public class AdminProfileController {

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
	
	public void UploadphotoHandler(ActionEvent e) throws IOException
	{
		if(e.getSource()== btnuploadimage)
		{
			Image image = new Image(getClass().getResource(txtphoto.getText()).toExternalForm());
			imageview.setImage(image);
		}
	}
	
}
