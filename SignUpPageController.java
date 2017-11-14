package application;

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
	
	public static final String FILENAME = "C:\\Users\\khyati\\eclipse-workspace-oxygen\\try\\src\\admin.txt";
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
	private TextField txtname;
	
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
					name = txtname.getText();
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
	
	


