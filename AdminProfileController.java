package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


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
	
	
	
	public void UploadphotoHandler(ActionEvent e) throws IOException
	{
		if(e.getSource()== btnuploadimage)
		{
			Image image = new Image(getClass().getResource(txtphoto.getText()).toExternalForm());
			imageview.setImage(image);
		}
	}
	
}
