package application;

import java.io.IOException;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;

import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.FileWriter;
import javafx.scene.control.RadioButton;
import java.io.BufferedWriter;

import java.util.Scanner;


/**
 * This Page handles the SIGNUP process for a new user.
 * 
 * @author riyas
 *
 */

public class SignUpPageController extends WelcomePageController {
	
	public static final String FILENAME = "C:\\Users\\riyas\\eclipse-workspace-oxygen\\AP Project - ClassRoom Booking\\src\\users.txt";
    //public static final String file_name = "C:\\Users\\riyas\\eclipse-workspace-oxygen\\AP Project - ClassRoom Booking\\src\\student_courses.txt";
	static Scanner sc = new Scanner(System.in);
	static String email;
	static String Firstname;
	static String Lastname;
	static String password;
	String uservalue;
	String gendervalue;
	
	@FXML
	private Label lblfirstname;
	
	@FXML
	private Label lbllastname;
	
	@FXML
	private Label lblemailid;
	
	@FXML
	private Label lblgender;
	
	@FXML
	private Label lbltype;
	
	@FXML
	private Label lblpswd;
	
	@FXML
	private Label lblrepswd;
	
	@FXML
	private Label lblsignup;
	
	@FXML
	private TextField txtfirstname;
	
	@FXML
	private TextField txtlastname;
	
	@FXML
	private TextField txtemailid;
	
	@FXML
	private RadioButton radiostudent;

	
	@FXML
	private RadioButton radiofaculty;
	
	@FXML
	private RadioButton radioadmin;
	
	@FXML
	private RadioButton radiomale;
	
	@FXML
	private RadioButton radiofemale;
	
	@FXML
	private RadioButton radioother;
	
	
	@FXML
	private PasswordField txtpswd;
	
	@FXML
	private PasswordField txtrepswd;
	
	@FXML
	private Button btnsignup;
	
	
    public static final String file_name = "C:\\Users\\riyas\\eclipse-workspace-oxygen\\AP Project - ClassRoom Booking\\src\\student_courses.txt";

	
	/**
	 * New User Handler is responsible for handling the sign up process
	 * Here the user enters all the details and the data is stored accordingly in the database which will be used further to retrieve information for Login Process 
	 * @param e ActionEvent to handle the button - it redirects to the welcome page
	 * @throws IOException
	 */
	public void NewUserHandler(ActionEvent e) throws IOException
	{
		if(e.getSource()== btnsignup)
		{
			Firstname = txtfirstname.getText();
			Lastname = txtlastname.getText();
			if(radiomale.isSelected())
			{
				gendervalue = "Male";
			}
			if(radiofemale.isSelected())
			{
				gendervalue = "Female";
			}
			if(radioother.isSelected())
			{
				gendervalue = "Others";
			}
			if(radiostudent.isSelected())
			{
				uservalue = "Student";
			}
			if(radiofaculty.isSelected())
			{
				uservalue = "Faculty";;
			}
			if(radioadmin.isSelected())
			{
				uservalue = "Admin";
			}
			
				FileWriter fw = new FileWriter(FILENAME,true);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.newLine();
				
//				FileWriter fc = new FileWriter(file_name,true);
//				BufferedWriter bc = new BufferedWriter(fc);
//				bc.newLine();
				password = txtpswd.getText();
				email = txtemailid.getText();
				bw.write(email + " " +password + " " + uservalue + " " + gendervalue + " " + Firstname + " " +Lastname);
				System.out.println(email + " " +password + " " + uservalue + " " + gendervalue + " " + Firstname + " " +Lastname);
				
				if (bw != null)
					bw.close();
				if (fw != null)
					fw.close();	
				

				FileWriter fc = new FileWriter(file_name,true);
				BufferedWriter bc = new BufferedWriter(fc);
				bc.newLine();
				
				bc.write(email);
				System.out.println(email);
				
				if (bc != null)
					bc.close();
				if (fc != null)
					fc.close();	
//				try {
//					
//					
//
//					//System.out.println(name + " " + password);
//					
////					bc.write(email);
////					System.out.println(email);
//				} 
//				finally {
//					try {
//
//						
//
//					} catch (IOException ex) {
//
//						ex.printStackTrace();
//
//					}
////					try {
////						if (bc != null)
////							bc.close();
////
////						if (fc != null)
////							fc.close();
////					}
////					catch (IOException ex) {
////
////						ex.printStackTrace();
////
////					}
//					
//					
//				}
//				try {
//					email = txtemailid.getText();
//					bc.write(email);
//					System.out.println(email);
//				}
//				finally {
//					try {
//						if (bc != null)
//							bc.close();
//
//						if (fc != null)
//							fc.close();
//					}
//					catch (IOException ex) {
//
//						ex.printStackTrace();
//
//					}
//				}
				
				
				System.out.println("Congrats");
	        	System.out.println(user);
	        	Stage stage = null;
	    		Parent root = null;
	    		stage = (Stage) btnsignup.getScene().getWindow();
	    		root = FXMLLoader.load(getClass().getResource("/application/WelcomePage.fxml"));
				
				Scene scene = new Scene(root);
			    stage.setScene(scene);
			    stage.show();
				
			}
		
		
		}
	}
	
	




