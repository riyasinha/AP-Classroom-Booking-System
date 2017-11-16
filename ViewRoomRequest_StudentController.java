package application;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
//import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class ViewRoomRequest_StudentController {

	@FXML
	private Label lblstdreq;
	
	@FXML
	private TableView tblrequests;
	
	@FXML
	private TableColumn columnreq;
	
	@FXML
	private TableColumn columnstatus;
	
	@FXML
	private Button btnback;
	
	public void BackButtonHandler(ActionEvent e) throws IOException
	{
		Stage stage = null;
		Parent root = null;
		
		if(e.getSource()== btnback)
		{
			stage = (Stage) btnback.getScene().getWindow();
			root = FXMLLoader.load(getClass().getResource("/application/StudentProfilePage.fxml"));
		}
		
		Scene scene = new Scene(root);
	      stage.setScene(scene);
	      stage.show();

	}
}
