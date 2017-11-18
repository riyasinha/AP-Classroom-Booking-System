package application;
	
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import com.opencsv.CSVReader;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

/**
 * This is the Main Class via which the program is run. It has the launch argument which allows us to run the booking system.
 * 
 * @author Riya Sinha
 * @author Khyati Seth
 *
 */

public class Main extends Application {
	
	/**
	 * @param college contains a course list of all courses offered and another course list of the courses taken by the curretn user
	 * @param course variable to add courses in the general courses list in college
	 * @param cmycourse  variable to add courses in user courses list
	 */
	public static CollegeClass college;
	public static CourseClass course;
	public static CourseClass mycourse;
	
	/**
	 * This method sets the stage of the system
	 * @param primaryStage
	 */
	
	@Override
	public void start(Stage primaryStage) {
		try {
			//BorderPane root = new BorderPane();
			Parent root = FXMLLoader.load(getClass().getResource("/application/WelcomePage.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * This method is responsible for running the entire system. Here the
	 * college class is initialised for a user.
	 * This is also responsible for launching the system.
	 * The CSV file containing the database is also read here
	 * @param args
	 * @throws IOException 
	 */
	
	public static void main(String[] args) throws IOException {
		
		college = new CollegeClass();
		CSVReader reader = new CSVReader(new FileReader(".\\src\\courses_database - Copy.csv"), ',' , '"' , 1);
		
	       int z =0;
	      //Read CSV line by line and use the string array as you want
	      String[] nextLine;
	      while ((nextLine = reader.readNext()) != null) {
	    	  System.out.println(z);
	         if (nextLine != null) {
	            //Verifying the read data here
	        	  course  = new CourseClass();
	        	 course.coursetype = nextLine[0];
	        	 System.out.println(course.coursetype);
	        	 course.course = nextLine[1];
	        	 course.coursecode = nextLine[2];
	        	 course.professor = nextLine[3];
	        	 course.credits = nextLine[4];
	        	 course.acronym = nextLine[5];
	        	 System.out.println(course.acronym);
	        	 
	        	 //for(int i = 6 ; i<11;i++) {
	        		 if(!nextLine[6].equals(""))
	        		 {
	        			 String[] mon = nextLine[6].split("\\$");
	        			 
	    	        	 course.monday.add(mon[0]);
	    	        	 //System.out.println(course.monday.get(0));
	    	        	 course.monday.add(mon[1]);
	    	        	 
	        		 }
	        		 else {
	        			 course.monday.add("");
	    	        	 //System.out.println(course.monday.get(0));
	    	        	 course.monday.add("");
	        			 
	        		 }
	        		 if(!nextLine[7].equals(""))
	        		 {
	        			 String[] tue = nextLine[7].split("\\$");
	        			 course.tuesday.add(tue[0]);
	        			 //System.out.println(course.tuesday.get(0));
	    	        	 course.tuesday.add(tue[1]);
	    	        	 //System.out.println(course.tuesday.get(1));
	        		 }
	        		 else {
	        			 course.tuesday.add("");
	    	        	 //System.out.println(course.monday.get(0));
	    	        	 course.tuesday.add("");
	        		 }
	        		 
	        		 if(!nextLine[8].equals(""))
	        		 {
	        			 
	        			 String[] wed = nextLine[8].split("\\$");
	        			 
	        			 course.wednesday.add(wed[0]);
	    	        	 course.wednesday.add(wed[1]);
	        		 }
	        		 else {
	        			 course.wednesday.add("");
	    	        	 //System.out.println(course.monday.get(0));
	    	        	 course.wednesday.add("");
	        		 }
	        		 if(!nextLine[9].equals(""))
	        		 {
	        			 //System.out.println("thursday"+nextLine[9]);
	        			 String[] thu = nextLine[9].split("\\$");
	        			 course.thursday.add(thu[0]);
	        			 //System.out.println(course.thursday.get(0));
	    	        	 course.thursday.add(thu[1]);
	        		 }
	        		 else {
	        			 course.thursday.add("");
	    	        	 //System.out.println(course.monday.get(0));
	    	        	 course.thursday.add("");
	        		 }
	        		 if(!nextLine[10].equals(""))
	        		 {
	        			 //System.out.println("friday"+nextLine[10]);
	        			 String[] fri = nextLine[10].split("\\$");
	        			 course.friday.add(fri[0]);
	    	        	 course.friday.add(fri[1]);
	        		 }	
	        		 else {
	        			 course.friday.add("");
	    	        	 //System.out.println(course.monday.get(0));
	    	        	 course.friday.add("");
	        		 }
//	        		 else
//	        		 {
//	        			 continue;
//	        		 }
	        	 course.preconditions = nextLine[11];
	        	 course.postconditions = nextLine[12];
	        	 college.courses.add(course);
	           // System.out.println(Arrays.toString(nextLine));
	         }
	         
	       
	         z++;
	      }
	      //System.out.println(college.courses.size());
	        // System.out.println(college.courses.get(2).thursday.get(1));
	         //System.out.println(college.courses.get(14));
		launch(args);
	}
}