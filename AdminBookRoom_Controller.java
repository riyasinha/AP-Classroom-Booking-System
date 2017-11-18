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
 * This page offers the admin with the options regarding how to book the room. It then redirects
 * the admin to book the room
 *
 */
public class AdminBookRoom_Controller extends WelcomePageController {
	/**
	 * @param lblenterday this allows the user to enter the date from the calendar
	 * @param String starttime this is the start time of the class
	 * @param String this is the end time of the class
	 * @param rs1,rs2....... these are the radio buttons to choose for the start time of the class
	 * @param re1,re2,re3....... these are the radio buttons to choose for the end time
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
	/**
	 * 
	 * @param e searches for the room from the given timing of start to the end
	 * @param btnsearchroom it shows the classrooms which are availableas green and red which are booked
	 * @param selectdate it parses the date from the pickdate value in the give format
	 * @throws IOException
	 */
	public void SearchRoomHandler(ActionEvent e)throws IOException
	{
		Stage stage = null;
		Parent root = null;
		
		if(e.getSource()== btnsearchroom)
		{
			
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
		
		      
		      	
	        	FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/AdminBookRoom2_Page.fxml"));
	        	stage = (Stage)btnsearchroom.getScene().getWindow();
	        	root = (Parent)loader.load();
	        	AdminBookRoom2_PageController bookadmin = loader.<AdminBookRoom2_PageController>getController();
	        	
			   bookadmin.lbldate2.setText(selectdate);
			   bookadmin.lblstart2.setText(starttime);
			   bookadmin.lblend2.setText(endtime);
			   
	    		Scene scene = new Scene(root);
			    stage.setScene(scene);
			    stage.show();
				
		      
		}
		
		
	     
	}
    /**
     * 
     * @param e back button redirects to the admin profile page
     * @throws IOException
     */
	
	public void BackButtonHandler(ActionEvent e) throws IOException
	{
		Stage stage = null;
    	Parent root = null;
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/AdminProfile.fxml"));
    	stage = (Stage)btnback.getScene().getWindow();
    	root = (Parent)loader.load();
    	AdminProfileController admin = loader.<AdminProfileController>getController();
    	//student.displayemail.setText(emailadd.getText());
	    admin.displayemail.setText(emailadd);
	    
		admin.displayfirstname.setText(firstName);
		admin.displaylastname.setText(lastName);
		admin.displaygender.setText(gender);
		admin.displaytype.setText(user);
		Scene scene = new Scene(root);
	    stage.setScene(scene);
	    stage.show();

	}
	
	
	
	

}
