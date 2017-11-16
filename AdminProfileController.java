package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
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
	private Label lblsetfirstname;
	
	@FXML
	private Label lblsetlastname;
	
	@FXML
	private Label lblgender;
	
	@FXML
	private Label lblsetgender;
	
	@FXML
	private Label lblemailid;
	
	@FXML
	private Label lblsetemailid;
	
	@FXML
	private Label lblusertype;
	
	@FXML
	private Label lblsetusertype;
	
	@FXML
	private Label btnuploadimage;
	
	@FXML
	private Label btnbookroom;
	
	@FXML
	private Label btnviewroomrequest;
	
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
