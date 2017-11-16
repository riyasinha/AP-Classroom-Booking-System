package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class ViewCourses_FacultyController extends WelcomePageController {

	@FXML
	private Label lblstdcourses;
	
	@FXML
	private TableView tblcourses;
	
	@FXML
	private TableColumn columncourses;
	
	@FXML
	private Button btnback;
	
	public void BackButtonHandler(ActionEvent e) throws IOException
	{
		Stage stage = null;
    	Parent root = null;
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/StudentProfilePage.fxml"));
    	stage = (Stage)btnback.getScene().getWindow();
    	root = (Parent)loader.load();
    	FacultyProfilePageController faculty = loader.<FacultyProfilePageController>getController();
    	//student.displayemail.setText(emailadd.getText());
	    faculty.displayemail.setText(emailadd);
		faculty.displayfirstname.setText(firstName);
		faculty.displaylastname.setText(lastName);
		faculty.displaygender.setText(gender);
		faculty.displaytype.setText(user);
		Scene scene = new Scene(root);
	    stage.setScene(scene);
	    stage.show();
	}
}
