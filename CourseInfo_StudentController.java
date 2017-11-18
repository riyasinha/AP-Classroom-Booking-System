package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CourseInfo_StudentController implements Initializable{

    @FXML
    private Label lblpage;

    @FXML
    private Button btnback;

    @FXML
    private Label lbltype;

    @FXML
    TextField txtcode;

    @FXML
    private Label lblpost;

    @FXML
    private Button btnadd;

    @FXML
    private Label lblfaculty;

    @FXML
    private Label lblcredits;

    @FXML 
   public  TextField txtcredits;

    @FXML 
    TextField txtfaculty ;

    @FXML
    TextField txttype;

    @FXML
    private Label lblcode;

    @FXML
    TextArea txtpost;
    
    @FXML
    TextField txtacron;
    
    @FXML
    private Label lblacron;
    
    public static int n;
    public static final String file_name = "C:\\Users\\riyas\\eclipse-workspace-oxygen\\AP Project - ClassRoom Booking\\src\\student_courses.txt";
	
    /**
     * redirects to the add course and search course page
     * @param e ActionEvent to handle the back button
     * @throws IOException
     */
	public void BackButtonHandler(ActionEvent e) throws IOException
	{
		//Stage stage = null;
		//Parent root = null;
		
		if(e.getSource()== btnback)
		{
			//System.out.println("Congrats");
        	//System.out.println(WelcomePageController.user);
        	Stage stage = null;
    		Parent root = null;
    		stage = (Stage) btnback.getScene().getWindow();
			root = FXMLLoader.load(getClass().getResource("/application/AddCourses_Student.fxml"));
			
			Scene scene = new Scene(root);
		      stage.setScene(scene);
		      stage.show();

		}

	}
	/**
	 * adds the course to the mycourses list in the college class for that user and also updates it in the database for the user course list.
	 * @param e
	 * @throws IOException
	 */
	
	public void AddCourseHandler(ActionEvent e)throws IOException
	{
		String email = WelcomePageController.emailadd;
		
		FileReader in = new FileReader(file_name);
		BufferedReader br = new BufferedReader(in);
		String input;
		
		FileWriter fw = new FileWriter(file_name,true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		
		
		if(e.getSource()==btnadd)
		{
			while((input = br.readLine()) != null)
			{
				String[] split = input.split("\\s");
				
				if(split[0].equalsIgnoreCase(email))
				{
					if(txtacron.getText().equalsIgnoreCase("DM"))
					{
						Main.college.mycourses.add(Main.college.courses.get(0));
						bw.write(" " + "DiscreteMaths");
					}
					if(txtacron.getText().equalsIgnoreCase("AP"))
					{
						Main.college.mycourses.add(Main.college.courses.get(1));
						bw.write(" " + "AdvancedProgramming");
					}
					
					if(txtacron.getText().equalsIgnoreCase("CO"))
					{
						Main.college.mycourses.add(Main.college.courses.get(2));
						bw.write(" " + "ComputerOrganization");
					}
					
					if(txtacron.getText().equalsIgnoreCase("M-III"))
					{
						Main.college.mycourses.add(Main.college.courses.get(3));
						bw.write(" " + "MathsIII");
					}
					
					if(txtacron.getText().equalsIgnoreCase("S&S"))
					{
						Main.college.mycourses.add(Main.college.courses.get(4));
						bw.write(" " + "SignalAndSystems");
					}
					if(txtacron.getText().equalsIgnoreCase("RA"))
					{
						Main.college.mycourses.add(Main.college.courses.get(5));
						bw.write(" " + "RealAnalysis");
					}
					if(txtacron.getText().equalsIgnoreCase("NT"))
					{
						Main.college.mycourses.add(Main.college.courses.get(6));
						bw.write(" " + "NumberTheory");
					}
					if(txtacron.getText().equalsIgnoreCase("POK"))
					{
						Main.college.mycourses.add(Main.college.courses.get(7));
						bw.write(" " + "PerspectiveOfKnowledge");
					}
					if(txtacron.getText().equalsIgnoreCase("PSY"))
					{
						Main.college.mycourses.add(Main.college.courses.get(8));
						bw.write(" " + "Psychology");
					}
					if(txtacron.getText().equalsIgnoreCase("TPEE"))
					{
						Main.college.mycourses.add(Main.college.courses.get(9));
						bw.write(" " + "TheoryOfEngineeringEthics");
					}
					if(txtacron.getText().equalsIgnoreCase("TA"))
					{
						Main.college.mycourses.add(Main.college.courses.get(10));
						bw.write(" " + "Theatre");
					}
					if(txtacron.getText().equalsIgnoreCase("ES"))
					{
						Main.college.mycourses.add(Main.college.courses.get(11));
						bw.write(" " + "Economics");
					}
					if(txtacron.getText().equalsIgnoreCase("IDE"))
					{
						Main.college.mycourses.add(Main.college.courses.get(12));
						bw.write(" " + "DigitalEthnography");
					}
					if(txtacron.getText().equalsIgnoreCase("IMS"))
					{
						Main.college.mycourses.add(Main.college.courses.get(13));
						bw.write(" " + "MediaAndSociety");
					}
					if(txtacron.getText().equalsIgnoreCase("ISI"))
					{
						Main.college.mycourses.add(Main.college.courses.get(14));
						bw.write(" " + "SocialInformatics");
					}
					if(txtacron.getText().equalsIgnoreCase("PO"))
					{
						Main.college.mycourses.add(Main.college.courses.get(15));
						bw.write(" " + "Poetry");
						
					}
				}
			}
			//bw.newLine();
			
			System.out.println(Main.college.mycourses);
			
			
		}
		
		if (bw != null)
			bw.close();
		if (fw != null)
			fw.close();	
	}
	/**
	 * this will help to set the text in the textboxes that will display the course informations.
	 */
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		try {
			txtcredits.setText(Main.college.courses.get(n).credits);
    		txtfaculty.setText(Main.college.courses.get(n).professor);
    		txttype.setText(Main.college.courses.get(n).coursetype);
    		txtpost.setText(Main.college.courses.get(n).postconditions);
    		txtcode.setText(Main.college.courses.get(n).coursecode);
    		txtacron.setText(Main.college.courses.get(n).acronym);
	    	}catch(Exception e) {
	    		e.printStackTrace();
	    	}
		
	}
}
