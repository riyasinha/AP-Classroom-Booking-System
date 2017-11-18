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


/**
 * 
 * This is The Welcome Page Controller Class
 * Here login/signup is handled
 * For login, the database containing the user details is read to verify the details. 
 * 
 *
 */

public class WelcomePageController {
	
	
	public static final String FILENAME = "C:\\Users\\riyas\\eclipse-workspace-oxygen\\AP Project - ClassRoom Booking\\src\\users.txt";
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
	
	static public String emailadd = null;
	static public String firstName = null;
	static public String lastName = null;
	static public String gender = null;
	
    public static final String file_name = "C:\\Users\\riyas\\eclipse-workspace-oxygen\\AP Project - ClassRoom Booking\\src\\student_courses.txt";

    /**
     * Here the login is handled. When the login button is pressed the Button sends the data to the controller which in turns matches with the users database for correct password and email address.
     * If it is correctly matched, it takes the corresponding profile page else it displays "TRY AGAIN" on the Console
     * Also , here it updates the mycourse list of the user so as to maintain the previous logins details.
     * @param e this is the action event that helps handle the Login Button
     * 
     * @throws IOException
     */
	public void LoginHandler(ActionEvent e) throws IOException
	{
		

		if(e.getSource()== login)
		{
			FileReader fl = new FileReader(file_name);
			BufferedReader bl = new BufferedReader(fl);
			String text;
			
			while((text = bl.readLine() )!=null)
			{
				String[] ccour = text.split("\\s");
				for(int i =1;i<ccour.length;i++)
				{
					if(ccour[i].equalsIgnoreCase("DiscretMAths"))
					{
						Main.college.mycourses.add(Main.college.courses.get(0));
					}
					if(ccour[i].equalsIgnoreCase("AdvancedProgramming"))
					{
						Main.college.mycourses.add(Main.college.courses.get(1));
					}
					if(ccour[i].equalsIgnoreCase("ComputerOrganization"))
					{
						Main.college.mycourses.add(Main.college.courses.get(2));
					}
					if(ccour[i].equalsIgnoreCase("MathsIII"))
					{
						Main.college.mycourses.add(Main.college.courses.get(3));
					}
					if(ccour[i].equalsIgnoreCase("SignalAndSystems"))
					{
						Main.college.mycourses.add(Main.college.courses.get(4));
					}
					if(ccour[i].equalsIgnoreCase("RealAnalysis"))
					{
						Main.college.mycourses.add(Main.college.courses.get(5));
					}
					if(ccour[i].equalsIgnoreCase("NumberTheory"))
					{
						Main.college.mycourses.add(Main.college.courses.get(6));
					}
					if(ccour[i].equalsIgnoreCase("PerspectiveOfKnowledge"))
					{
						Main.college.mycourses.add(Main.college.courses.get(7));
					}
					if(ccour[i].equalsIgnoreCase("Psychology"))
					{
						Main.college.mycourses.add(Main.college.courses.get(8));
					}
					if(ccour[i].equalsIgnoreCase("TheoryOfEngineeringEthics"))
					{
						Main.college.mycourses.add(Main.college.courses.get(9));
					}
					if(ccour[i].equalsIgnoreCase("Theatre"))
					{
						Main.college.mycourses.add(Main.college.courses.get(10));
					}
					if(ccour[i].equalsIgnoreCase("Economics"))
					{
						Main.college.mycourses.add(Main.college.courses.get(11));
					}
					if(ccour[i].equalsIgnoreCase("DigitalEthnography"))
					{
						Main.college.mycourses.add(Main.college.courses.get(12));
					}
					if(ccour[i].equalsIgnoreCase("MediaAndSociety"))
					{
						Main.college.mycourses.add(Main.college.courses.get(13));
					}
					if(ccour[i].equalsIgnoreCase("SocialInformatics"))
					{
						Main.college.mycourses.add(Main.college.courses.get(14));
					}
					if(ccour[i].equalsIgnoreCase("poetry"))
					{
						Main.college.mycourses.add(Main.college.courses.get(15));
					}
					
				}
				
			}
			
			
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
		            	 gender = split[3];
		            	 firstName = split[4];
		            	 lastName = split[5];
		            	 emailadd = split[0];
		            
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
			
		}	}
	
	/**
	 * This button is foe new users who want to register in the system
	 * @param e handles the SignUp button by leading it to the signup page
	 * @throws IOException
	 */
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
