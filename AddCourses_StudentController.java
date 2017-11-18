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
import javafx.stage.Stage;

/**
 * add courses student controller is the page where the search bar to search keywords and the course buttons are the ones that redirect to the course info page
 * @author riyas
 *
 */
public class AddCourses_StudentController {

	@FXML
    private Button btnpo;

    @FXML
    private Button btnpok;

    @FXML
    private Button btntpee;

    @FXML
    private Button btnims;

    @FXML
    private Button btnpsy;

    @FXML
    private Button btnsns;

    @FXML
    private Button btnra;

    @FXML
    private Button btnap;

    @FXML
    private Button btnes;

    @FXML
    private Button btnta;

    @FXML
    private Button btnisi;

    @FXML
    private Label lblsearch;

    @FXML
    private Button btnco;

    @FXML
    private TextField textsearch;

    @FXML
    private Button btnnt;

    @FXML
    private Button btnm3;

    @FXML
    private Button btndm;

    @FXML
    private Button btnide;
    
    @FXML
    private Button btnback;
    
    
    /**
     * to search specific keywords from the post conditions
     * Only the courses having those keywords will be displayed
     * @param e
     * @throws IOException
     */
    public void SearchFieldHandler(ActionEvent e)throws IOException
    {
    	String keyword = textsearch.getText();
    	
    	if((Main.college.courses.get(0).postconditions).contains(keyword))
    	{
    		btndm.setVisible(true);
    	}
    	else 
    	{
    		btndm.setVisible(false);
    	}
    	
    	if((Main.college.courses.get(1).postconditions).contains(keyword))
    	{
    		btnap.setVisible(true);
    	}
    	else 
    	{
    		btnap.setVisible(false);
    	}
    	
    	if((Main.college.courses.get(2).postconditions).contains(keyword))
    	{
    		btnco.setVisible(true);
    	}
    	else 
    	{
    		btnco.setVisible(false);
    	}
    	
    	if((Main.college.courses.get(3).postconditions).contains(keyword))
    	{
    		btnm3.setVisible(true);
    	}
    	else 
    	{
    		btnm3.setVisible(false);
    	}
    	
    	if((Main.college.courses.get(4).postconditions).contains(keyword))
    	{
    		btnsns.setVisible(true);
    	}
    	else 
    	{
    		btnsns.setVisible(false);
    	}
    	
    	if((Main.college.courses.get(5).postconditions).contains(keyword))
    	{
    		btnra.setVisible(true);
    	}
    	else 
    	{
    		btnra.setVisible(false);
    	}
    	
    	if((Main.college.courses.get(6).postconditions).contains(keyword))
    	{
    		btnnt.setVisible(true);
    	}
    	else 
    	{
    		btnnt.setVisible(false);
    	}
    	
    	if((Main.college.courses.get(7).postconditions).contains(keyword))
    	{
    		btnpok.setVisible(true);
    	}
    	else 
    	{
    		btnpok.setVisible(false);
    	}
    	
    	if((Main.college.courses.get(8).postconditions).contains(keyword))
    	{
    		btnpsy.setVisible(true);
    	}
    	else 
    	{
    		btnpsy.setVisible(false);
    	}
    	
    	if((Main.college.courses.get(9).postconditions).contains(keyword))
    	{
    		btntpee.setVisible(true);
    	}
    	else 
    	{
    		btntpee.setVisible(false);
    	}
    	
    	if((Main.college.courses.get(10).postconditions).contains(keyword))
    	{
    		btnta.setVisible(true);
    	}
    	else 
    	{
    		btnta.setVisible(false);
    	}
    	
    	if((Main.college.courses.get(11).postconditions).contains(keyword))
    	{
    		btnes.setVisible(true);
    	}
    	else 
    	{
    		btnes.setVisible(false);
    	}
    	
    	if((Main.college.courses.get(12).postconditions).contains(keyword))
    	{
    		btnide.setVisible(true);
    	}
    	else 
    	{
    		btnide.setVisible(false);
    	}
    	
    	if((Main.college.courses.get(13).postconditions).contains(keyword))
    	{
    		btnims.setVisible(true);
    	}
    	else 
    	{
    		btnims.setVisible(false);
    	}
    	
    	if((Main.college.courses.get(14).postconditions).contains(keyword))
    	{
    		btnisi.setVisible(true);
    	}
    	else 
    	{
    		btnisi.setVisible(false);
    	}
    	
    	if((Main.college.courses.get(15).postconditions).contains(keyword))
    	{
    		btnpo.setVisible(true);
    	}
    	else 
    	{
    		btnpo.setVisible(false);
    	}
    	
    	
    }
    
    
    /**
     * here is the handler for all course buttons.
     * when one button is clicked, the course button takes to the course info page which in turn displays the course description
     * @param e
     * @throws IOException
     */
    public void CourseButtonHandler(ActionEvent e)throws IOException
    {
    	
    	
    	
    	if(e.getSource()==btndm)
    	{
    		Stage stage = null;
        	Parent root = null;
    		FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/CourseInfoPage_Student.fxml"));
        	stage = (Stage)btndm.getScene().getWindow();
        	root = (Parent)loader.load();
        	CourseInfo_StudentController course = loader.<CourseInfo_StudentController>getController();
        	//student.displayemail.setText(emailadd.getText());
        	//System.out.println(Main.college.courses.get(0).credits);
        	//course.txtcode.
        	CourseInfo_StudentController.n = 1;
        	course.txtcredits.setText(Main.college.courses.get(0).credits);
    		course.txtfaculty.setText(Main.college.courses.get(0).professor);
    		course.txttype.setText(Main.college.courses.get(0).coursetype);
    		course.txtpost.setText(Main.college.courses.get(0).postconditions);
    		course.txtcode.setText(Main.college.courses.get(0).coursecode);
    		course.txtacron.setText(Main.college.courses.get(0).acronym);
    		
    		Scene scene = new Scene(root);
		    stage.setScene(scene);
		    stage.show();
    	}
    	if(e.getSource()==btnap)
    	{
    		Stage stage = null;
        	Parent root = null;
    		FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/CourseInfoPage_Student.fxml"));
        	stage = (Stage)btnap.getScene().getWindow();
        	root = (Parent)loader.load();
        	CourseInfo_StudentController course = loader.<CourseInfo_StudentController>getController();
        	//student.displayemail.setText(emailadd.getText());
        	//System.out.println(Main.college.courses.get(0).credits);
        	//course.txtcode.
        	CourseInfo_StudentController.n = 2;
        	course.txtcredits.setText(Main.college.courses.get(1).credits);
    		course.txtfaculty.setText(Main.college.courses.get(1).professor);
    		course.txttype.setText(Main.college.courses.get(1).coursetype);
    		course.txtpost.setText(Main.college.courses.get(1).postconditions);
    		course.txtcode.setText(Main.college.courses.get(1).coursecode);
    		course.txtacron.setText(Main.college.courses.get(1).acronym);
    		Scene scene = new Scene(root);
		    stage.setScene(scene);
		    stage.show();
    	}
    	if(e.getSource()==btnco)
    	{
    		Stage stage = null;
        	Parent root = null;
    		FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/CourseInfoPage_Student.fxml"));
        	stage = (Stage)btnco.getScene().getWindow();
        	root = (Parent)loader.load();
        	CourseInfo_StudentController course = loader.<CourseInfo_StudentController>getController();
        	//student.displayemail.setText(emailadd.getText());
        	//System.out.println(Main.college.courses.get(0).credits);
        	//course.txtcode.
        	CourseInfo_StudentController.n = 3;
        	course.txtcredits.setText(Main.college.courses.get(2).credits);
    		course.txtfaculty.setText(Main.college.courses.get(2).professor);
    		course.txttype.setText(Main.college.courses.get(2).coursetype);
    		course.txtpost.setText(Main.college.courses.get(2).postconditions);
    		course.txtcode.setText(Main.college.courses.get(2).coursecode);
    		course.txtacron.setText(Main.college.courses.get(2).acronym);
    		Scene scene = new Scene(root);
		    stage.setScene(scene);
		    stage.show();
    	}
    	if(e.getSource()==btnm3)
    	{
    		Stage stage = null;
        	Parent root = null;
    		FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/CourseInfoPage_Student.fxml"));
        	stage = (Stage)btnm3.getScene().getWindow();
        	root = (Parent)loader.load();
        	CourseInfo_StudentController course = loader.<CourseInfo_StudentController>getController();
        	//student.displayemail.setText(emailadd.getText());
        	//System.out.println(Main.college.courses.get(0).credits);
        	//course.txtcode.
        	CourseInfo_StudentController.n = 4;
        	course.txtcredits.setText(Main.college.courses.get(3).credits);
    		course.txtfaculty.setText(Main.college.courses.get(3).professor);
    		course.txttype.setText(Main.college.courses.get(3).coursetype);
    		course.txtpost.setText(Main.college.courses.get(3).postconditions);
    		course.txtcode.setText(Main.college.courses.get(3).coursecode);
    		course.txtacron.setText(Main.college.courses.get(3).acronym);
    		Scene scene = new Scene(root);
		    stage.setScene(scene);
		    stage.show();
    	}
    	if(e.getSource()==btnsns)
    	{
    		Stage stage = null;
        	Parent root = null;
    		FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/CourseInfoPage_Student.fxml"));
        	stage = (Stage)btnsns.getScene().getWindow();
        	root = (Parent)loader.load();
        	CourseInfo_StudentController course = loader.<CourseInfo_StudentController>getController();
        	//student.displayemail.setText(emailadd.getText());
        	//System.out.println(Main.college.courses.get(0).credits);
        	//course.txtcode.
        	CourseInfo_StudentController.n = 5;
        	course.txtcredits.setText(Main.college.courses.get(4).credits);
    		course.txtfaculty.setText(Main.college.courses.get(4).professor);
    		course.txttype.setText(Main.college.courses.get(4).coursetype);
    		course.txtpost.setText(Main.college.courses.get(4).postconditions);
    		course.txtcode.setText(Main.college.courses.get(4).coursecode);
    		course.txtacron.setText(Main.college.courses.get(4).acronym);
    		Scene scene = new Scene(root);
		    stage.setScene(scene);
		    stage.show();
    	}
    	if(e.getSource()==btnra)
    	{
    		Stage stage = null;
        	Parent root = null;
    		FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/CourseInfoPage_Student.fxml"));
        	stage = (Stage)btnra.getScene().getWindow();
        	root = (Parent)loader.load();
        	CourseInfo_StudentController course = loader.<CourseInfo_StudentController>getController();
        	//student.displayemail.setText(emailadd.getText());
        	//System.out.println(Main.college.courses.get(0).credits);
        	//course.txtcode.
        	CourseInfo_StudentController.n = 6;
        	course.txtcredits.setText(Main.college.courses.get(5).credits);
    		course.txtfaculty.setText(Main.college.courses.get(5).professor);
    		course.txttype.setText(Main.college.courses.get(5).coursetype);
    		course.txtpost.setText(Main.college.courses.get(5).postconditions);
    		course.txtcode.setText(Main.college.courses.get(5).coursecode);
    		course.txtacron.setText(Main.college.courses.get(5).acronym);
    		Scene scene = new Scene(root);
		    stage.setScene(scene);
		    stage.show();
    	}
    	if(e.getSource()==btnnt)
    	{
    		Stage stage = null;
        	Parent root = null;
    		FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/CourseInfoPage_Student.fxml"));
        	stage = (Stage)btnnt.getScene().getWindow();
        	root = (Parent)loader.load();
        	CourseInfo_StudentController course = loader.<CourseInfo_StudentController>getController();
        	//student.displayemail.setText(emailadd.getText());
        	//System.out.println(Main.college.courses.get(0).credits);
        	//course.txtcode.
        	CourseInfo_StudentController.n = 7;
        	course.txtcredits.setText(Main.college.courses.get(6).credits);
    		course.txtfaculty.setText(Main.college.courses.get(6).professor);
    		course.txttype.setText(Main.college.courses.get(6).coursetype);
    		course.txtpost.setText(Main.college.courses.get(6).postconditions);
    		course.txtcode.setText(Main.college.courses.get(6).coursecode);
    		course.txtacron.setText(Main.college.courses.get(6).acronym);
    		Scene scene = new Scene(root);
		    stage.setScene(scene);
		    stage.show();
    	}
    	if(e.getSource()==btnpok)
    	{
    		Stage stage = null;
        	Parent root = null;
    		FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/CourseInfoPage_Student.fxml"));
        	stage = (Stage)btnpok.getScene().getWindow();
        	root = (Parent)loader.load();
        	CourseInfo_StudentController course = loader.<CourseInfo_StudentController>getController();
        	//student.displayemail.setText(emailadd.getText());
        	//System.out.println(Main.college.courses.get(0).credits);
        	//course.txtcode.
        	CourseInfo_StudentController.n = 8;
        	course.txtcredits.setText(Main.college.courses.get(7).credits);
    		course.txtfaculty.setText(Main.college.courses.get(7).professor);
    		course.txttype.setText(Main.college.courses.get(7).coursetype);
    		course.txtpost.setText(Main.college.courses.get(7).postconditions);
    		course.txtcode.setText(Main.college.courses.get(7).coursecode);
    		course.txtacron.setText(Main.college.courses.get(7).acronym);
    		Scene scene = new Scene(root);
		    stage.setScene(scene);
		    stage.show();
    	}
    	if(e.getSource()==btnpsy)
    	{
    		Stage stage = null;
        	Parent root = null;
    		FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/CourseInfoPage_Student.fxml"));
        	stage = (Stage)btnpsy.getScene().getWindow();
        	root = (Parent)loader.load();
        	CourseInfo_StudentController course = loader.<CourseInfo_StudentController>getController();
        	//student.displayemail.setText(emailadd.getText());
        	//System.out.println(Main.college.courses.get(0).credits);
        	//course.txtcode.
        	CourseInfo_StudentController.n = 9;
        	course.txtcredits.setText(Main.college.courses.get(8).credits);
    		course.txtfaculty.setText(Main.college.courses.get(8).professor);
    		course.txttype.setText(Main.college.courses.get(8).coursetype);
    		course.txtpost.setText(Main.college.courses.get(8).postconditions);
    		course.txtcode.setText(Main.college.courses.get(8).coursecode);
    		course.txtacron.setText(Main.college.courses.get(8).acronym);
    		Scene scene = new Scene(root);
		    stage.setScene(scene);
		    stage.show();
    	}
    	if(e.getSource()==btntpee)
    	{
    		Stage stage = null;
        	Parent root = null;
    		FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/CourseInfoPage_Student.fxml"));
        	stage = (Stage)btntpee.getScene().getWindow();
        	root = (Parent)loader.load();
        	CourseInfo_StudentController course = loader.<CourseInfo_StudentController>getController();
        	//student.displayemail.setText(emailadd.getText());
        	//System.out.println(Main.college.courses.get(0).credits);
        	//course.txtcode.
        	CourseInfo_StudentController.n = 10;
        	course.txtcredits.setText(Main.college.courses.get(9).credits);
    		course.txtfaculty.setText(Main.college.courses.get(9).professor);
    		course.txttype.setText(Main.college.courses.get(9).coursetype);
    		course.txtpost.setText(Main.college.courses.get(9).postconditions);
    		course.txtcode.setText(Main.college.courses.get(9).coursecode);
    		course.txtacron.setText(Main.college.courses.get(9).acronym);
    		Scene scene = new Scene(root);
		    stage.setScene(scene);
		    stage.show();
    	}
    	if(e.getSource()==btnta)
    	{
    		Stage stage = null;
        	Parent root = null;
    		FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/CourseInfoPage_Student.fxml"));
        	stage = (Stage)btnta.getScene().getWindow();
        	root = (Parent)loader.load();
        	CourseInfo_StudentController course = loader.<CourseInfo_StudentController>getController();
        	//student.displayemail.setText(emailadd.getText());
        	//System.out.println(Main.college.courses.get(0).credits);
        	//course.txtcode.
        	CourseInfo_StudentController.n = 11;
        	course.txtcredits.setText(Main.college.courses.get(10).credits);
    		course.txtfaculty.setText(Main.college.courses.get(10).professor);
    		course.txttype.setText(Main.college.courses.get(10).coursetype);
    		course.txtpost.setText(Main.college.courses.get(10).postconditions);
    		course.txtcode.setText(Main.college.courses.get(10).coursecode);
    		course.txtacron.setText(Main.college.courses.get(10).acronym);
    		Scene scene = new Scene(root);
		    stage.setScene(scene);
		    stage.show();
    	}
    	if(e.getSource()==btnes)
    	{
    		Stage stage = null;
        	Parent root = null;
    		FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/CourseInfoPage_Student.fxml"));
        	stage = (Stage)btnes.getScene().getWindow();
        	root = (Parent)loader.load();
        	CourseInfo_StudentController course = loader.<CourseInfo_StudentController>getController();
        	//student.displayemail.setText(emailadd.getText());
        	//System.out.println(Main.college.courses.get(0).credits);
        	//course.txtcode.
        	CourseInfo_StudentController.n = 12;
        	course.txtcredits.setText(Main.college.courses.get(11).credits);
    		course.txtfaculty.setText(Main.college.courses.get(11).professor);
    		course.txttype.setText(Main.college.courses.get(11).coursetype);
    		course.txtpost.setText(Main.college.courses.get(11).postconditions);
    		course.txtcode.setText(Main.college.courses.get(11).coursecode);
    		course.txtacron.setText(Main.college.courses.get(11).acronym);
    		Scene scene = new Scene(root);
		    stage.setScene(scene);
		    stage.show();
    	}
    	if(e.getSource()==btnide)
    	{
    		Stage stage = null;
        	Parent root = null;
    		FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/CourseInfoPage_Student.fxml"));
        	stage = (Stage)btnide.getScene().getWindow();
        	root = (Parent)loader.load();
        	CourseInfo_StudentController course = loader.<CourseInfo_StudentController>getController();
        	//student.displayemail.setText(emailadd.getText());
        	System.out.println(Main.college.courses.get(12).course);
        	//course.txtcode.
        	CourseInfo_StudentController.n = 13;
        	course.txtcredits.setText(Main.college.courses.get(12).credits);
    		course.txtfaculty.setText(Main.college.courses.get(12).professor);
    		course.txttype.setText(Main.college.courses.get(12).coursetype);
    		course.txtpost.setText(Main.college.courses.get(12).postconditions);
    		course.txtcode.setText(Main.college.courses.get(12).coursecode);
    		course.txtacron.setText(Main.college.courses.get(12).acronym);
    		Scene scene = new Scene(root);
		    stage.setScene(scene);
		    stage.show();
    	}
    	if(e.getSource()==btnims)
    	{
    		Stage stage = null;
        	Parent root = null;
    		FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/CourseInfoPage_Student.fxml"));
        	stage = (Stage)btnims.getScene().getWindow();
        	root = (Parent)loader.load();
        	CourseInfo_StudentController course = loader.<CourseInfo_StudentController>getController();
        	//student.displayemail.setText(emailadd.getText());
        	System.out.println(Main.college.courses.get(13).course);
        	//course.txtcode.
        	CourseInfo_StudentController.n = 14;
        	course.txtcredits.setText(Main.college.courses.get(13).credits);
    		course.txtfaculty.setText(Main.college.courses.get(13).professor);
    		course.txttype.setText(Main.college.courses.get(13).coursetype);
    		course.txtpost.setText(Main.college.courses.get(13).postconditions);
    		course.txtcode.setText(Main.college.courses.get(13).coursecode);
    		course.txtacron.setText(Main.college.courses.get(13).acronym);
    		Scene scene = new Scene(root);
		    stage.setScene(scene);
		    stage.show();
    	}
    	if(e.getSource()==btnisi)
    	{
    		Stage stage = null;
        	Parent root = null;
    		FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/CourseInfoPage_Student.fxml"));
        	stage = (Stage)btnisi.getScene().getWindow();
        	root = (Parent)loader.load();
        	CourseInfo_StudentController course = loader.<CourseInfo_StudentController>getController();
        	//student.displayemail.setText(emailadd.getText());
        	System.out.println(Main.college.courses.get(14).course);
        	//course.txtcode.
        	course.txtcredits.setText(Main.college.courses.get(14).credits);
    		course.txtfaculty.setText(Main.college.courses.get(14).professor);
    		course.txttype.setText(Main.college.courses.get(14).coursetype);
    		course.txtpost.setText(Main.college.courses.get(14).postconditions);
    		course.txtcode.setText(Main.college.courses.get(14).coursecode);
    		course.txtacron.setText(Main.college.courses.get(14).acronym);
    		Scene scene = new Scene(root);
		    stage.setScene(scene);
		    stage.show();
    	}
    	if(e.getSource()==btnpo)
    	{
    		Stage stage = null;
        	Parent root = null;
    		FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/CourseInfoPage_Student.fxml"));
        	stage = (Stage)btnpo.getScene().getWindow();
        	root = (Parent)loader.load();
        	CourseInfo_StudentController course = loader.<CourseInfo_StudentController>getController();
        	//student.displayemail.setText(emailadd.getText());
        	System.out.println(Main.college.courses.get(15).course);
        	//course.txtcode.
        	CourseInfo_StudentController.n = 16;
        	course.txtcredits.setText(Main.college.courses.get(15).credits);
    		course.txtfaculty.setText(Main.college.courses.get(15).professor);
    		course.txttype.setText(Main.college.courses.get(15).coursetype);
    		course.txtpost.setText(Main.college.courses.get(15).postconditions);
    		course.txtcode.setText(Main.college.courses.get(15).coursecode);
    		course.txtacron.setText(Main.college.courses.get(15).acronym);
    		Scene scene = new Scene(root);
		    stage.setScene(scene);
		    stage.show();
    	}
    	
    		
    	
    	
    }
    /**
     * back button that redirects to the profile page of the user
     * @param e handles the back button
     * @throws IOException
     */
    public void BackButtonHandler(ActionEvent e) throws IOException
	{
		//Stage stage = null;
		//Parent root = null;
		
		if(e.getSource()== btnback)
		{
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

}
