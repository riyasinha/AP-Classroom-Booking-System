package application;

import java.io.IOException;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;

import javafx.scene.control.TextField;

import java.io.FileWriter;
import java.io.IOException;
import javafx.scene.control.RadioButton;
import java.io.BufferedWriter;

import java.util.Scanner;




public class SignUpPageController {
	
	public static final String FILENAME = "C:\\Users\\khyati\\eclipse-workspace-oxygen\\try\\src\\jaimatadi.txt";
	static Scanner sc = new Scanner(System.in);
	static String name;
	static String password;
	String uservalue;
	int gendervalue;
	
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
			final String Firstname = txtfirstname.getText();
			final String Lastname = txtlastname.getText();
			if(radiomale.isSelected())
			{
				gendervalue = 0;
			}
			if(radiofemale.isSelected())
			{
				gendervalue = 1;
			}
			if(radioother.isSelected())
			{
				gendervalue = 2;
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
				uservalue = "Faculty";
			}
			
				FileWriter fw = new FileWriter(FILENAME,true);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.newLine();
				
				try {
					name = txtemailid.getText();
					password = txtpswd.getText();
					//System.out.println(name + " " + password);
					bw.write(name + " " +password + " " + uservalue + " " + gendervalue);
					
					

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


