package application;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class ViewCourses_studentController extends WelcomePageController{

	@FXML
    private Button btnback;

    @FXML
    public ListView<String> listcourse;

    @FXML
    private Label lblstdcourses;

   public ObservableList<String> mycourses = FXCollections.observableArrayList();
	
	
	public void BackButtonHandler(ActionEvent e) throws IOException
	{
		//Stage stage = null;
		//Parent root = null;
		
		if(e.getSource()== btnback)
		{
			
			
//			stage = (Stage) btnback.getScene().getWindow();
//			root = FXMLLoader.load(getClass().getResource("/application/StudentProfilePage.fxml"));
			Stage stage = null;
        	Parent root = null;
        	FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/StudentProfilePage.fxml"));
        	stage = (Stage)btnback.getScene().getWindow();
        	root = (Parent)loader.load();
        	StudentProfilePageController student = loader.<StudentProfilePageController>getController();
        	//student.displayemail.setText(emailadd.getText());
		    student.displayemail.setText(emailadd);
    		student.displayfirstname.setText(firstName);
    		student.displaylastname.setText(lastName);
    		student.displaygender.setText(gender);
    		student.displaytype.setText(user);
    		Scene scene = new Scene(root);
		    stage.setScene(scene);
		    stage.show();
		}
		
//		Scene scene = new Scene(root);
//	      stage.setScene(scene);
//	      stage.show();

	}
	
	
	
	
	
}
