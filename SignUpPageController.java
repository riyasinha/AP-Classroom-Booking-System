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




public class SignUpPageController extends WelcomePageController {
	
	public static final String FILENAME = "C:\\Users\\riyas\\eclipse-workspace-oxygen\\AP Project - ClassRoom Booking\\src\\users.txt";
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
				
				try {
					email = txtemailid.getText();
					password = txtpswd.getText();
					//System.out.println(name + " " + password);
					bw.write(email + " " +password + " " + uservalue + " " + gendervalue + " " + Firstname + " " +Lastname);
					
					

				} 
				
				finally {

					try {

						if (bw != null)
							bw.close();

						if (fw != null)
							fw.close();

					} catch (IOException ex) {

						ex.printStackTrace();

					}
				}
				
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
	
	


/*package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.util.Scanner;


public class SignUpPageController {
	
	public static final String FILENAME = "C:\\Users\\khyati\\eclipse-workspace-oxygen\\try\\src\\jaimatadi.txt";
	static Scanner sc = new Scanner(System.in);
	static String name;
	static String password;
	@FXML
	private Label lblname;
	
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
	private ChoiceBox txtuser;
	
	@FXML
	private PasswordField txtpswd;
	
	@FXML
	private PasswordField txtrepswd;
	
	@FXML
	private Button btnsignup;
	
	
	public void NewUserHandler(ActionEvent e) throws IOException
	{
		if(e.getSource()== btnsignup)
		{
			//if(txtpswd.getText()== txtrepswd.getText())
			//{	
				
				 
				FileWriter fw = new FileWriter(FILENAME,true);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.newLine();
				
				try {
					name = txtfirstname.getText();
					password = txtpswd.getText();
					bw.write(name + " " +password);
					
					

				} 
				
				finally {

					try {

						if (bw != null)
							bw.close();

						if (fw != null)
							fw.close();

					} catch (IOException ex) {

						ex.printStackTrace();

					}
				}
			}
		}
	}
	
	*/


