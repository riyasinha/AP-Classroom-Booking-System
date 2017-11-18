package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * controller to display the personlaized time table on the GUI
 * @author riyas
 *
 */
public class ViewTimeTable_StudentController implements Initializable {


	 @FXML
	    private TableColumn<?, ?> tuesday;

	    @FXML
	    private Button btnback;

	    @FXML
	    private TableColumn<?, ?> course;

	    @FXML
	    private TableColumn<?, ?> wednesday;

	    @FXML
	    private TableColumn<?, ?> thursday;

	    @FXML
	    private TableColumn<?, ?> friday;

	    @FXML
	    private TableView<TimeTableClass> tbltt;
	    ObservableList<TimeTableClass> myTimeTable;

	    @FXML
	    private TableColumn<?, ?> monday;
    


	    /**
	     * takes back to the user profile page
	     * @param e  actionevent handles the back button
	     * @throws IOException
	     */
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
		    student.displayemail.setText(WelcomePageController.emailadd);
    		student.displayfirstname.setText(WelcomePageController.firstName);
    		student.displaylastname.setText(WelcomePageController.lastName);
    		student.displaygender.setText(WelcomePageController.gender);
    		student.displaytype.setText(WelcomePageController.user);
    		Scene scene = new Scene(root);
		    stage.setScene(scene);
		    stage.show();
		}
	}



    /**
     * used to intialize the data in the table
     * 
     */
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		course.setCellValueFactory(new PropertyValueFactory<>("COURSE/DAY"));
		monday.setCellValueFactory(new PropertyValueFactory<>("MONDAY"));
		tuesday.setCellValueFactory(new PropertyValueFactory<>("TUESDAY"));
		wednesday.setCellValueFactory(new PropertyValueFactory<>("WEDNESDAY"));
		thursday.setCellValueFactory(new PropertyValueFactory<>("THURSDAY"));
		friday.setCellValueFactory(new PropertyValueFactory<>("FRIDAY"));
		
		myTimeTable = FXCollections.observableArrayList();
		loadData();
//		            MCtable.getColumns().addAll(Usernamecolumn,Course1Column,Course2Column,Course3Column,Course4Column,Course5Column,Course6Column,Course7Column);
		            tbltt.setItems(myTimeTable);
		
	}



	/**
	 * used to load dat into the list which will be displayed on the table
	 */
	public void loadData() {
		// TODO Auto-generated method stub
		
		System.out.println(Main.college.mycourses.size());
		for(int i =0 ;i<Main.college.mycourses.size();i++)
		{
			System.out.println(Main.college.mycourses.get(i).monday.get(1));
			myTimeTable.add(new TimeTableClass(Main.college.mycourses.get(i).course,Main.college.mycourses.get(i).monday.get(0),
					Main.college.mycourses.get(i).monday.get(1), Main.college.mycourses.get(i).tuesday.get(0),
					Main.college.mycourses.get(i).tuesday.get(1),Main.college.mycourses.get(i).wednesday.get(0),
					Main.college.mycourses.get(i).wednesday.get(1),Main.college.mycourses.get(i).thursday.get(0),
					Main.college.mycourses.get(i).thursday.get(1),Main.college.mycourses.get(i).friday.get(0),
					Main.college.mycourses.get(i).friday.get(1)));
		}
		
	}
    
    
    
}

