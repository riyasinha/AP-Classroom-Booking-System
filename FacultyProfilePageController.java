package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.stage.Stage;

/**
 * this is the profile page of the faculty which opens when the user opens the user dialogue box 
 * clicks on view profile. It offers a variety of options to choose from.
 */

public class FacultyProfilePageController {

	/**
	 * @param Label lblfirstname this is the first name of the faculty who has logged in.
	 * @param Label lbllastname this is the last name of the faculty who has logged in.
	 * @param Label lbluser this is the first name of the faculty who has logged in.
	 * @param Label lblgender this is the gender of the faculty who has logged in.
	 */
	@FXML
	public Label lblprofilepage;

	@FXML
	public Label lblfirstname;
	
	@FXML
	public Label lbllastname;
	
	@FXML
	public Label lbluser;
	
	@FXML
	public Label lblgender;
	
	@FXML
	public Label displaygender;
	
	@FXML
	public Label displayfirstname;
	
	@FXML
	public Label displaylastname;
	
	@FXML
	public Label displaytype;
	
	@FXML
	private Button btnviewcour;
	
	@FXML
	private Button btnbookroom;
	
	@FXML
	private Button btnaddcour;
	
	@FXML
	private Button btnviewtt;
	
	@FXML
	private Button btnuploadphoto;
	
	@FXML
	private Separator sepvert;
	
	@FXML 
	public Label lblemail;
	
	@FXML
	public Label displayemail;
	
	@FXML
	public Button btnlogout;
	
    public static final String file_name = "C:\\Users\\riyas\\eclipse-workspace-oxygen\\AP Project - ClassRoom Booking\\src\\student_courses.txt";

	
    /**
	 * 
	 * @param e this logs out of the users account and redirects him to the welcome page
	 * @param btnlogout this redirects the user to the welcome page
	 * @throws IOException
	 */
	public void LogOutHandler(ActionEvent e)throws IOException
	{
		Stage stage = null;
		Parent root = null;
		
		if(e.getSource()== btnlogout)
		{
			stage = (Stage) btnlogout.getScene().getWindow();
			root = FXMLLoader.load(getClass().getResource("/application/WelcomePage.fxml"));
		}
		
		Scene scene = new Scene(root);
	      stage.setScene(scene);
	      stage.show();
	}
	
	/**
	 * 
	 * @param e it offers the faculty to book a room and redirects him to the page 
	 * where he is offered choices for booking a room.
	 * @param btnbookroom offers to book a classroom
	 * @throws IOException
	 */
	public void BookRoomHandler(ActionEvent e)throws IOException
	{
		Stage stage = null;
		Parent root = null;
		
		if(e.getSource()== btnbookroom)
		{
			stage = (Stage) btnbookroom.getScene().getWindow();
			root = FXMLLoader.load(getClass().getResource("/application/BookRoom_FacultyPage.fxml"));
		}
		
		Scene scene = new Scene(root);
	      stage.setScene(scene);
	      stage.show();
	}
		
		
	/**
	 * 
	 * @param e Offrs the faculty to view the timetable and redirects him to a csv fil
	 * @param btnviewtt The faculty cn view the timetable using this
	 * 
	 * @throws IOException
	 */
	public void ViewTimeTableHandler(ActionEvent e)throws IOException
	{
		Stage stage = null;
		Parent root = null;
		
		if(e.getSource()== btnviewtt)
		{
			stage = (Stage) btnviewtt.getScene().getWindow();
			root = FXMLLoader.load(getClass().getResource("/application/TimeTable_Faculty.fxml"));
		}
		
		Scene scene = new Scene(root);
	      stage.setScene(scene);
	      stage.show();
	}
	
	/**
	 * 
	 * @param e It allows the faculty to view the courses that he has added to the profile
	 * @throws IOException
	 */
	public void ViewCoursessHandler(ActionEvent e)throws IOException
	{
//		Stage stage = null;
//		Parent root = null;
//		
//		if(e.getSource()== btnviewcour)
//		{
//			stage = (Stage) btnviewcour.getScene().getWindow();
//			root = FXMLLoader.load(getClass().getResource("/application/ViewCourses_FacultyPage.fxml"));
//		}
//		
//		Scene scene = new Scene(root);
//	      stage.setScene(scene);
//	      stage.show();
		Stage stage = null;
		Parent root = null;
		
		if(e.getSource()== btnviewcour)
		{
//			stage = (Stage) btnviewcour.getScene().getWindow();
//			root = FXMLLoader.load(getClass().getResource("/application/Viewcourses_StudentPage.fxml"));
			stage = (Stage) btnviewcour.getScene().getWindow();
//			root = FXMLLoader.load(getClass().getResource("/application/ViewRoomRequest_StudentPage.fxml"));
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/ViewCourses_FacultyPage.fxml"));
        	stage = (Stage)btnviewcour.getScene().getWindow();
        	root = (Parent)loader.load();
        	ViewCourses_FacultyController view = loader.<ViewCourses_FacultyController>getController();
        	//student.displayemail.setText(emailadd.getText());
		    //System.out.println("hukio");
		    ArrayList<String> mycourse = new ArrayList<String>();
		    
		    FileReader in = new FileReader(file_name);
			BufferedReader br = new BufferedReader(in);
			String input;
			
			while((input = br.readLine())!=null)
			{
				String[] split = input.split("\\s");
				if(split[0].equalsIgnoreCase(WelcomePageController.emailadd))
				{
				for(int i =1;i<split.length;i++)
				{
					if(split[i].equalsIgnoreCase("DiscretMAths"))
					{
						view.mycourses.add(Main.college.courses.get(0).course);
					}
					if(split[i].equalsIgnoreCase("AdvancedProgramming"))
					{
						view.mycourses.add(Main.college.courses.get(1).course);
					}
					if(split[i].equalsIgnoreCase("ComputerOrganization"))
					{
						view.mycourses.add(Main.college.courses.get(2).course);
					}
					if(split[i].equalsIgnoreCase("MathsIII"))
					{
						view.mycourses.add(Main.college.courses.get(3).course);
					}
					if(split[i].equalsIgnoreCase("SignalAndSystems"))
					{
						view.mycourses.add(Main.college.courses.get(4).course);
					}
					if(split[i].equalsIgnoreCase("RealAnalysis"))
					{
						view.mycourses.add(Main.college.courses.get(5).course);
					}
					if(split[i].equalsIgnoreCase("NumberTheory"))
					{
						view.mycourses.add(Main.college.courses.get(6).course);
					}
					if(split[i].equalsIgnoreCase("PerspectiveOfKnowledge"))
					{
						view.mycourses.add(Main.college.courses.get(7).course);
					}
					if(split[i].equalsIgnoreCase("Psychology"))
					{
						view.mycourses.add(Main.college.courses.get(8).course);
					}
					if(split[i].equalsIgnoreCase("TheoryOfEngineeringEthics"))
					{
						view.mycourses.add(Main.college.courses.get(9).course);
					}
					if(split[i].equalsIgnoreCase("Theatre"))
					{
						view.mycourses.add(Main.college.courses.get(10).course);
					}
					if(split[i].equalsIgnoreCase("Economics"))
					{
						view.mycourses.add(Main.college.courses.get(11).course);
					}
					if(split[i].equalsIgnoreCase("DigitalEthnography"))
					{
						view.mycourses.add(Main.college.courses.get(12).course);
					}
					if(split[i].equalsIgnoreCase("MediaAndSociety"))
					{
						view.mycourses.add(Main.college.courses.get(13).course);
					}
					if(split[i].equalsIgnoreCase("SocialInformatics"))
					{
						view.mycourses.add(Main.college.courses.get(14).course);
					}
					if(split[i].equalsIgnoreCase("poetry"))
					{
						view.mycourses.add(Main.college.courses.get(15).course);
					}
					
				}
				}
						
			}
			
		    
        	for(CourseClass c:Main.college.mycourses)
		    {
		    	view.mycourses.add(c.course);
		    }
		    view.listcourse.setItems(view.mycourses);
//		    Scene scene = new Scene(root);
//		    stage.setScene(scene);
//		    stage.show();
		}
		Scene scene = new Scene(root);
	    stage.setScene(scene);
	    stage.show();
		
	}
	
	/**
	 * Button handler that takes us to the fetch courses page that takes us to the search bar.
	 * @param e
	 * @throws IOException
	 */
	public void AddCoursesHandler(ActionEvent e)throws IOException
	{
		Stage stage = null;
		Parent root = null;
		
		if(e.getSource()== btnaddcour)
		{
			stage = (Stage) btnaddcour.getScene().getWindow();
			root = FXMLLoader.load(getClass().getResource("/application/AddCourses_Faculty.fxml"));
		}
		
		Scene scene = new Scene(root);
	      stage.setScene(scene);
	      stage.show();
	}
	
}
