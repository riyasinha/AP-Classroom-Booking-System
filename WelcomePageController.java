package application;

import java.io.BufferedReader;
import java.io.FileReader;
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

public class WelcomePageController {
	public static final String FILENAME = "C:\\Users\\khyati\\eclipse-workspace-oxygen\\try\\src\\jaimatadi.txt";
	//private static final char[][]  = null;
	@FXML
	private Label email;
	
	@FXML
	private Label pswd;
	
	@FXML
	private TextField email_text;
	
	@FXML
	private PasswordField pswd_text;
	
	@FXML
	private Button login;
	
	@FXML
	private Button signup;
	
	@FXML
	private Button for_pswd;
	
	@FXML
	private Label stat;
	static public String user = null;
	static public boolean flag = false; 
	
	public void LoginHandler(ActionEvent e) throws IOException
	{
		

		if(e.getSource()== login)
		{
			
			try {
				FileReader  in = new FileReader(FILENAME);
		        BufferedReader br = new BufferedReader(in);
		        String input;
		        //boolean flag = false;
		        
		        //int lol = 0;
		        String EnteredName = email_text.getText();
		       // System.out.println(EnteredName);
		        
				String EnteredPassword = pswd_text.getText();
				//System.out.println(EnteredPassword);
				//String[] split = input.split("\\s");
			
		        while ((input = br.readLine()) != null) 
		        {
		        	String[] split = input.split("\\s");
		        	
		        	
		            if (EnteredName.equals(split[0]) && EnteredPassword.equals(split[1])) {
		            	flag = true;
		            	 user = (split[2]);
		            
		            }
		        }
		        if(flag==true )
		        {
		        	System.out.println("Congrats");
		        	System.out.println(user);
		        	Stage stage = null;
		    		Parent root = null;
		    		stage = (Stage) login.getScene().getWindow();
					root = FXMLLoader.load(getClass().getResource("/application/UserDialogue.fxml"));
					Scene scene = new Scene(root);
				      stage.setScene(scene);
				      stage.show();

		        }
		       
		        else
		        {
		        	System.out.println("TRY AGAIN");
		        }
			}

				
			catch (IOException ev) 
			{
		        ev.getCause();
		    }
			
		}
	}
	
	public void SignUpButtonHandler(ActionEvent e) throws IOException
	{
		Stage stage = null;
		Parent root = null;
		
		if(e.getSource()== signup)
		{
			stage = (Stage) signup.getScene().getWindow();
			root = FXMLLoader.load(getClass().getResource("/application/SignUp.fxml"));
		}
		
		Scene scene = new Scene(root);
	      stage.setScene(scene);
	      stage.show();

	}
	

}
