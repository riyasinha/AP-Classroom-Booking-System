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
 * 
 * This is the Student Profile Page Controller
 * Here are all the options that a student is allowed to do.
 *
 */
public class StudentProfilePageController extends UserDialogueController{
	
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
	private Button btnviewreq;
	
	@FXML
	private Button btnviewcour;
	
	@FXML
	private Button btnreqroom;
	
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
     * log out button redirects to the welcome page
     * 
     * @param e handles the log out button
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
	 * @param e this allows the student to view his requests and see the status
	 * of the requests
	 * @param btnviewreq this opens in another page ViewRoomRequest_StudentPage
	 * which displays the status of the request.
	 * @throws IOException
	 */
	public void ViewRoomRequestsHandler(ActionEvent e)throws IOException
	{
		Stage stage = null;
		Parent root = null;
		
		if(e.getSource()== btnviewreq)
		{
			stage = (Stage) btnviewreq.getScene().getWindow();
			root = FXMLLoader.load(getClass().getResource("/application/ViewRoomRequest_StudentPage.fxml"));
		}
		
		Scene scene = new Scene(root);
	      stage.setScene(scene);
	      stage.show();
	}
	
	/**
	 * View the personalised time Table by clicking on the button
	 * 
	 * @param e
	 * @throws IOException
	 */
	public void ViewTimeTableHandler(ActionEvent e)throws IOException
	{
		Stage stage = null;
		Parent root = null;
		
		if(e.getSource()== btnviewtt)
		{
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/ViewTimeTable_Student.fxml"));
			stage = (Stage) btnviewtt.getScene().getWindow();
			root = (Parent)loader.load();
			ViewTimeTable_StudentController tt = loader.<ViewTimeTable_StudentController>getController();
			tt.loadData();
			//root = FXMLLoader.load(getClass().getResource("/application/ViewTimeTable_Student.fxml"));
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
			root = FXMLLoader.load(getClass().getResource("/application/AddCourses_Student.fxml"));
		}
		
		Scene scene = new Scene(root);
	      stage.setScene(scene);
	      stage.show();
	}
	
	
	/**
	 * see the courses of the user
	 * 
	 * @param e view courses handler
	 * @throws IOException
	 */
	public void ViewCoursessHandler(ActionEvent e)throws IOException
	{
		Stage stage = null;
		Parent root = null;
		
		if(e.getSource()== btnviewcour)
		{
//			stage = (Stage) btnviewcour.getScene().getWindow();
//			root = FXMLLoader.load(getClass().getResource("/application/Viewcourses_StudentPage.fxml"));
			stage = (Stage) btnviewcour.getScene().getWindow();
//			root = FXMLLoader.load(getClass().getResource("/application/ViewRoomRequest_StudentPage.fxml"));
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/Viewcourses_StudentPage.fxml"));
        	stage = (Stage)btnviewcour.getScene().getWindow();
        	root = (Parent)loader.load();
        	ViewCourses_studentController view = loader.<ViewCourses_studentController>getController();
        	//student.displayemail.setText(emailadd.getText());
		    //System.out.println("hukio");
		    ArrayList<String> mycourse = new ArrayList<String>();
		    
		    FileReader in = new FileReader(file_name);
			BufferedReader br = new BufferedReader(in);
			String input;
			System.out.println(emailadd);
			while((input = br.readLine())!=null)
			{
				String[] split = input.split("\\s");
				//System.out.println(split[0]);
				if(split[0].equals(WelcomePageController.emailadd))
				{
					System.out.println(split[0]);
				for(int i =1;i<split.length;i++)
				{
				
					if(!view.mycourses.contains(Main.college.courses.get(0).course)) 
					{
						if(split[i].equalsIgnoreCase("DiscretMAths"))
						{
							view.mycourses.add(Main.college.courses.get(0).course);
						}
					}
					if(!view.mycourses.contains(Main.college.courses.get(1).course)) 
					{
					if(split[i].equalsIgnoreCase("AdvancedProgramming"))
					{
						view.mycourses.add(Main.college.courses.get(1).course);
					}}
					if(!view.mycourses.contains(Main.college.courses.get(2).course)) 
					{
					if(split[i].equalsIgnoreCase("ComputerOrganization"))
					{
						view.mycourses.add(Main.college.courses.get(2).course);
					}}
					if(!view.mycourses.contains(Main.college.courses.get(3).course)) 
					{
					if(split[i].equalsIgnoreCase("MathsIII"))
					{
						view.mycourses.add(Main.college.courses.get(3).course);
					}}
					if(!view.mycourses.contains(Main.college.courses.get(4).course)) 
					{
					if(split[i].equalsIgnoreCase("SignalAndSystems"))
					{
						view.mycourses.add(Main.college.courses.get(4).course);
					}}
					if(!view.mycourses.contains(Main.college.courses.get(5).course)) 
					{
					if(split[i].equalsIgnoreCase("RealAnalysis"))
					{
						view.mycourses.add(Main.college.courses.get(5).course);
					}}
					if(!view.mycourses.contains(Main.college.courses.get(6).course)) 
					{
					if(split[i].equalsIgnoreCase("NumberTheory"))
					{
						view.mycourses.add(Main.college.courses.get(6).course);
					}
					}
					if(!view.mycourses.contains(Main.college.courses.get(7).course)) 
					{
					if(split[i].equalsIgnoreCase("PerspectiveOfKnowledge"))
					{
						view.mycourses.add(Main.college.courses.get(7).course);
					}
					}
					if(!view.mycourses.contains(Main.college.courses.get(8).course)) 
					{
					if(split[i].equalsIgnoreCase("Psychology"))
					{
						view.mycourses.add(Main.college.courses.get(8).course);
					}
					}
					if(!view.mycourses.contains(Main.college.courses.get(9).course)) 
					{
					if(split[i].equalsIgnoreCase("TheoryOfEngineeringEthics"))
					{
						view.mycourses.add(Main.college.courses.get(9).course);
					}
					}
					if(!view.mycourses.contains(Main.college.courses.get(10).course)) 
					{
					if(split[i].equalsIgnoreCase("Theatre"))
					{
						view.mycourses.add(Main.college.courses.get(10).course);
					}}
					if(!view.mycourses.contains(Main.college.courses.get(11).course)) 
					{
					if(split[i].equalsIgnoreCase("Economics"))
					{
						view.mycourses.add(Main.college.courses.get(11).course);
					}
					}
					if(!view.mycourses.contains(Main.college.courses.get(12).course)) 
					{
					if(split[i].equalsIgnoreCase("DigitalEthnography"))
					{
						view.mycourses.add(Main.college.courses.get(12).course);
					}
					}
					if(!view.mycourses.contains(Main.college.courses.get(13).course)) 
					{
					if(split[i].equalsIgnoreCase("MediaAndSociety"))
					{
						view.mycourses.add(Main.college.courses.get(13).course);
					}
					}
					if(!view.mycourses.contains(Main.college.courses.get(14).course)) 
					{
					if(split[i].equalsIgnoreCase("SocialInformatics"))
					{
						view.mycourses.add(Main.college.courses.get(14).course);
					}
					}
					if(!view.mycourses.contains(Main.college.courses.get(15).course)) 
					{
					if(split[i].equalsIgnoreCase("poetry"))
					{
						view.mycourses.add(Main.college.courses.get(15).course);
					}
					}
					
					
				}
				System.out.println(Main.college.mycourses);
				break;
				}
				else {
					break;
				}	
				//break;
			}
			
		    
        	for(CourseClass c:Main.college.mycourses)
		    {
        		System.out.println("for llop");
		    	view.mycourses.add(c.course);
		    }
		    view.listcourse.setItems(view.mycourses);
//    		Scene scene = new Scene(root);
//		    stage.setScene(scene);
//		    stage.show();
		
		}
		
		Scene scene = new Scene(root);
	      stage.setScene(scene);
	      stage.show();
	}
	
//	public void setEmail(String email)
//	{
//		displayemail.setText(email);
//	}
	
	
	/**
	 * 
	 * @param e this offers the student to request a room based on his needs and offers the options for 
	 * student to fill in
	 * @param btnreqroom this redirects the student to StudentRequestRoom_Page.fxml
	 * @throws IOException
	 */
	public void RequestRoomHandler(ActionEvent e)throws IOException
	{
		Stage stage = null;
		Parent root = null;
		
		if(e.getSource()== btnreqroom)
		{
			stage = (Stage) btnreqroom.getScene().getWindow();
			root = FXMLLoader.load(getClass().getResource("/application/StudentRequestRoom_Page.fxml"));
		}
		
		Scene scene = new Scene(root);
	      stage.setScene(scene);
	      stage.show();
	}
}
