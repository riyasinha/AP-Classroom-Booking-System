package application;

import java.io.IOException;

import java.time.format.DateTimeFormatter;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
/**
 * 
 * this is the controller for the student to request room based
 * on the needs and requirements
 *
 */
public class StudentRequestRoom_Controller extends WelcomePageController {
	/**
	 * @param rs11,rs113,.... theseare the radio buttons for the start time
	 * @param re11,re13 these are the radio buttons for the end time.
	 * @param Datepicker pickdate uses the calendar to choose a date
	 */
	
	@FXML
	private Label lblpage;
	
	@FXML
	private Label lblenterday;
	
	@FXML
	private Label lblendtime;
	
	@FXML
	private Label lblstarttime;
	
	@FXML
	private Button btnsearchroom;
	
	
	
	@FXML
	private DatePicker pickdate;
	
	@FXML
	private Button btnback;
	
	@FXML
	private RadioButton rs11;
	
	@FXML
	private RadioButton rs113;
	
	@FXML
	private RadioButton rs12;
	
	@FXML
	private RadioButton rs123;
	
	@FXML
	private RadioButton rs1;
	
	@FXML
	private RadioButton rs13;
	
	@FXML
	private RadioButton rs2;
	
	@FXML
	private RadioButton rs23;
	
	@FXML
	private RadioButton rs3;
	
	@FXML
	private RadioButton rs33;
	
	@FXML
	private RadioButton rs4;
	
	@FXML
	private RadioButton rs43;
	
	@FXML
	private RadioButton rs5;
	
	@FXML
	private RadioButton re113;
	
	@FXML
	private RadioButton re12;
	
	@FXML
	private RadioButton re123;
	
	@FXML
	private RadioButton re1;
	
	@FXML
	private RadioButton re13;
	
	@FXML
	private RadioButton re2;
	
	@FXML
	private RadioButton re23;
	
	@FXML
	private RadioButton re3;
	
	@FXML
	private RadioButton re33;
	
	@FXML
	private RadioButton re4;
	
	@FXML
	private RadioButton re43;
	
	@FXML
	private RadioButton re5;
	
	@FXML
	private RadioButton re53;
	
	@FXML
	private RadioButton radiotutorial;
	
	@FXML
	private RadioButton radiolab;
	
	@FXML
	private RadioButton radioother;
	
	@FXML
	private RadioButton radiolecture;
	
	@FXML
	private TextField txtcapacity;
	
	
/*<?xml version="1.0" encoding="UTF-8"?>

<?import java.lang.*?>
<?import javafx.scene.control.*?>


<Button fx:id="btnsearchroom" layoutX="140.0" layoutY="185.0" mnemonicParsing="false" onAction="#SearchRoomHandler" text="Search Room" xmlns="http://javafx.com/javafx/8" xmlns:fx="http://javafx.com/fxml/1" />
	
	MenuItem start2 = new MenuItem("09:00");
	MenuItem start3 = new MenuItem("09:30");
	MenuItem start4 = new MenuItem("10:00");
	MenuItem start5 = new MenuItem("10:30");
	MenuItem start6 = new MenuItem("11:00");
	MenuItem start7 = new MenuItem("11:30");
	MenuItem start8 = new MenuItem("12:00");
	MenuItem start9 = new MenuItem("12:30");
	MenuItem start10 = new MenuItem("01:00");
	MenuItem start11 = new MenuItem("01:30");
	MenuItem start12 = new MenuItem("02:00");
	MenuItem start13 = new MenuItem("02:30");
	MenuItem start14 = new MenuItem("03:00");
	MenuItem start15 = new MenuItem("03:30");
	MenuItem start16 = new MenuItem("04:00");
	MenuItem start17 = new MenuItem("04:30");
	MenuItem start18 = new MenuItem("05:00");
//	MenuItem start19 = new MenuItem("05:30");
	
	MenuItem end3 = new MenuItem("09:30");
	MenuItem end4 = new MenuItem("10:00");
	MenuItem end5 = new MenuItem("10:30");
	MenuItem end6 = new MenuItem("11:00");
	MenuItem end7 = new MenuItem("11:30");
	MenuItem end8 = new MenuItem("12:00");
	MenuItem end9 = new MenuItem("12:30");
	MenuItem end10 = new MenuItem("01:00");
	MenuItem end11 = new MenuItem("01:30");
	MenuItem end12 = new MenuItem("02:00");
	MenuItem end13 = new MenuItem("02:30");
	MenuItem end14 = new MenuItem("03:00");
	MenuItem end15 = new MenuItem("03:30");
	MenuItem end16 = new MenuItem("04:00");
	MenuItem end17 = new MenuItem("04:30");
	MenuItem end18 = new MenuItem("05:00");
	MenuItem end19 = new MenuItem("05:30");
	
	 
	*/
	
	String starttime;
	String endtime;
	String selectdate;
	int idno;
	String purpose;
	String capacity;
	
	public void SearchRoomHandler(ActionEvent e)throws IOException
	{
		Stage stage = null;
		Parent root = null;
		
		if(e.getSource()== btnsearchroom)
		{
			capacity = txtcapacity.getText();	
			  if(radiolab.isSelected())	
			  {
				  purpose = "lab";
			  }
			  if(radiolecture.isSelected())	
			  {
				  purpose = "lecture";
			  }
			  if(radiotutorial.isSelected())	
			  {
				  purpose = "tutorial";
			  }
			  if(radioother.isSelected())	
			  {
				  purpose = "other";
			  }
		      if(rs11.isSelected())
		      {
		    	  starttime = "11:00";
		    	  idno = 1;
		      }
		      if(rs113.isSelected())
		      {
		    	  starttime = "11:30";
		    	  idno = 2;
		      }
		      if(rs12.isSelected())
		      {
		    	  starttime = "12:00";
		    	  idno = 3;
		      }
		      if(rs123.isSelected())
		      {
		    	  starttime = "12:30";
		    	  idno = 4;
		      }
		      if(rs1.isSelected())
		      {
		    	  starttime = "01:00";
		    	  idno = 5;
		      }
		      if(rs13.isSelected())
		      {
		    	  starttime = "01:30";
		    	  idno = 6;
		      }
		      if(rs2.isSelected())
		      {
		    	  starttime = "02:00";
		    	  idno = 7;
		      }
		      if(rs23.isSelected())
		      {
		    	  starttime = "02:30";
		    	  idno = 8;
		    	  
		      }
		      if(rs3.isSelected())
		      {
		    	  starttime = "03:00";
		    	  idno = 9;
		      }
		      if(rs33.isSelected())
		      {
		    	  starttime = "03:30";
		    	  idno = 10;
		      }
		      if(rs4.isSelected())
		      {
		    	  starttime = "04:00";
		    	  idno = 11;
		      }
		      if(rs43.isSelected())
		      {
		    	  starttime = "04:30";
		    	  idno = 12;
		      }
		      if(rs5.isSelected())
		      {
		    	  starttime = "05:00";
		    	  idno = 13;
		      }
		      if(re113.isSelected())
		      {
		    	  endtime = "11:30";
		    	  idno = 2;
		      }	 
		      if(re12.isSelected())
		      {
		    	  endtime = "12:00";
		    	  idno = 3;
		      }	 
		      if(re123.isSelected())
		      {
		    	  endtime = "12:30";
		    	  idno = 4;
		      }
		      if(re1.isSelected())
		      {
		    	  endtime = "1:00";
		    	  idno = 5;
		      }	 
		      if(re13.isSelected())
		      {
		    	  endtime = "01:30";
		    	  idno = 6;
		      }	 
		      if(re2.isSelected())
		      {
		    	  endtime = "02:00";
		    	  idno = 7;
		      }	 
		      if(re23.isSelected())
		      {
		    	  endtime = "02:30";
		    	  idno = 8;
		      }	 
		      if(re3.isSelected())
		      {
		    	  endtime = "03:00";
		    	  idno = 9;
		      }	 
		      if(re33.isSelected())
		      {
		    	  endtime = "03:30";
		    	  idno = 10;
		      }
		      if(re4.isSelected())
		      {
		    	  endtime = "04:00";
		    	  idno = 11;
		      }	 	 
		      if(re43.isSelected())
		      {
		    	  endtime = "04:30";
		    	  idno = 12;
		      }
		      if(re5.isSelected())
		      {
		    	  endtime = "05:00";
		    	  idno = 13;
		      }	 
		      if(re53.isSelected())
		      {
		    	  endtime = "05:30";
		    	  idno = 14;
		      }	
		     selectdate = pickdate.getValue().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		      
		      	
	        	FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/StudentRequestRoom_Page2.fxml"));
	        	stage = (Stage)btnsearchroom.getScene().getWindow();
	        	root = (Parent)loader.load();
	        	StudentRequestRoom2_Controller bookfaculty = loader.<StudentRequestRoom2_Controller>getController();
	        	
			   bookfaculty.lbldate2.setText(selectdate);
			   bookfaculty.lblstart2.setText(starttime);
			   bookfaculty.lblend2.setText(endtime);
			   
	    		Scene scene = new Scene(root);
			    stage.setScene(scene);
			    stage.show();
				
		      
		}
		
		
	     
	}
    /**
     * 
     * @param e Backbutton returns to the profile page of the student
     * @throws IOException
     */
	
	public void BackButtonHandler(ActionEvent e) throws IOException
	{
		Stage stage = null;
    	Parent root = null;
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/FacultyProfilePage.fxml"));
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
