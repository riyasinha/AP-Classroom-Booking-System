package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * 
 * Confirms the room number and shows the date and day 
 * and start time and end time that the user hs selected 
 *
 */


public class AdminBookRoom2_PageController extends AdminBookRoom_Controller {
	/**
	 * @param btn bookroom this allows the admin to finally book 
	 * the room making the required changes in the data base
	 * @param roomno this is the roomno tht the admin prefers to give
	 */
	@FXML
	Button btnc01;

	@FXML
	Button btnc02;
	
	@FXML
	Button btnc03;

	@FXML
	Button btnc11;

	@FXML
	Button btnc12;

	@FXML
	Button btnc13;

	@FXML
	Button btnc21;

	@FXML
	Button btnc22;

	@FXML
	Button btnc23;

	@FXML
	Button btnc24;

	@FXML
	Button btns01;

	@FXML
	Button btns02;

	@FXML
	Button btnlr1;

	@FXML
	Button btnlr2;

	@FXML
	Button btnlr3;

	@FXML
	Button btnlr4;

	@FXML
	Button btnbookroom;

	@FXML
	Button btnback;
	
	@FXML
	Label lblstart2;
	
	@FXML
	Label lblend2;
	
	@FXML
	Label lbldate2;
	
	@FXML
	Label lblenter;
	// String input_date=selectdate;
	
	String roomno;
	/**
	 * 
	 * @param e it fetches the button of the room which is called
	 * @param btnc01 this reads the file C01.txt and checks if the room is free in the given time slot 
	 * or not.
	 * @throws IOException
	 * @throws ParseException
	 */
	public void C01Handler(ActionEvent e) throws IOException, ParseException
	{
		Stage stage = null;
		Parent root = null;
		
		
		if(e.getSource()== btnc01)
		{
			roomno = "C01";
			lblenter.setText(roomno);
			String datestr = lbldate2.getText();
			String timestr = lblstart2.getText();
			String timeend = lblend2.getText();		
			SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
			  Date dt1=format1.parse(datestr);
			  DateFormat format2=new SimpleDateFormat("EEEE"); 
			  String finalDay = format2.format(dt1);
			  
			  final String FILENAME1 = "C:\\Users\\khyati\\eclipse-workspace-oxygen\\APproject\\src\\application\\C01.txt";
			  FileReader  in1 = new FileReader(FILENAME1);
		      BufferedReader br1 = new BufferedReader(in1);
		      String input1;
		      int idstr = 0;
		      int idend = 0;
		      
		      //false flag means free
		      //true flag means booked
		      Boolean flag = false;
		     while ((input1 = br1.readLine()) != null) 
		        {
		        	String[] split = input1.split("\\s");
		        	if (finalDay.equals(split[0]))  
		        	{
		        		if(split[1].equals(timestr)|split[1].equals(timeend))
		        		{
		        			
		        			if(split[3].equals("*"))
		        			{
		        				flag = true;
		        			}
		        			else {
		        				 if(split[2].equals("true"))
				        			{
				        				flag = true;
				        			}
		        			}
		        			
		        		}
		        		
		        }
		}
		     if(flag.equals(true))
		     {
		    	 System.out.print("booked");
		    	  btnc01.setStyle("-fx-background-color: #ff0000; ");
		     }
		     else
		     {
		    	 System.out.println("FREE");
		    	 btnc01.setStyle("-fx-background-color: #00ff00; ");
		    	 
		     }
		}
		      
	}
	/**
	 * 
	 * @param e it fetches the button of the room which is called
	 * @param btnc02 this reads the file C02.txt and checks if the room is free in the given time slot 
	 * or not.
	 * @throws IOException
	 * @throws ParseException
	 */
	public void C02Handler(ActionEvent e) throws IOException, ParseException
	{
		Stage stage = null;
		Parent root = null;
		
		
		if(e.getSource()== btnc02)
		{
			roomno = "C02";
			lblenter.setText(roomno);
			String datestr = lbldate2.getText();
			String timestr = lblstart2.getText();
			String timeend = lblend2.getText();		
			SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
			  Date dt1=format1.parse(datestr);
			  DateFormat format2=new SimpleDateFormat("EEEE"); 
			  String finalDay = format2.format(dt1);
			  
			  final String FILENAME2 = "C:\\Users\\khyati\\eclipse-workspace-oxygen\\APproject\\src\\application\\C02.txt";
			  FileReader  in2 = new FileReader(FILENAME2);
		      BufferedReader br2 = new BufferedReader(in2);
		      String input2;
		      //false flag means free
		      //true flag means booked
		      Boolean flag = false;
		     while ((input2 = br2.readLine()) != null) 
		        {
		        	String[] split = input2.split("\\s");
		        	if (finalDay.equals(split[0]))  
		        	{
		        		if(split[1].equals(timestr)|split[1].equals(timeend))
		        		{
		        			
		        			if(split[3].equals("*"))
		        			{
		        				flag = true;
		        			}
		        			else {
		        				 if(split[2].equals("true"))
				        			{
				        				flag = true;
				        			}
		        			}
		        			
		        		}
		        		
		        }
		}
		     if(flag.equals(true))
		     {
		    	 System.out.print("booked");
		    	  btnc02.setStyle("-fx-background-color: #ff0000; ");
		     }
		     else
		     {
		    	 System.out.println("FREE");
		    	 btnc02.setStyle("-fx-background-color: #00ff00; ");
		    	 
		     }

		      
		}
	}
	/**
	 * 
	 * @param e it fetches the button of the room which is called
	 * @param btnc03 this reads the file C03.txt and checks if the room is free in the given time slot 
	 * or not.
	 * @throws IOException
	 * @throws ParseException
	 */
	public void C03Handler(ActionEvent e) throws IOException, ParseException
	{
		Stage stage = null;
		Parent root = null;
		
		
		if(e.getSource()== btnc03)
		{
			roomno = "C03";
			lblenter.setText(roomno);
			String datestr = lbldate2.getText();
			String timestr = lblstart2.getText();
			String timeend = lblend2.getText();		
			SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
			  Date dt1=format1.parse(datestr);
			  DateFormat format2=new SimpleDateFormat("EEEE"); 
			  String finalDay = format2.format(dt1);
			  
			  final String FILENAME3 = "C:\\Users\\khyati\\eclipse-workspace-oxygen\\APproject\\src\\application\\C03.txt";
			  FileReader  in3 = new FileReader(FILENAME3);
		      BufferedReader br3 = new BufferedReader(in3);
		      String input3;
		      //false flag means free
		      //true flag means booked
		      Boolean flag = false;
		     while ((input3 = br3.readLine()) != null) 
		        {
		        	String[] split = input3.split("\\s");
		        	if (finalDay.equals(split[0]))  
		        	{
		        		if(split[1].equals(timestr)|split[1].equals(timeend))
		        		{
		        			
		        			if(split[3].equals("*"))
		        			{
		        				flag = true;
		        			}
		        			else {
		        				 if(split[2].equals("true"))
				        			{
				        				flag = true;
				        			}
		        			}
		        			
		        		}
		        		
		        }
		}
		     if(flag.equals(true))
		     {
		    	 System.out.print("booked");
		    	  btnc03.setStyle("-fx-background-color: #ff0000; ");
		     }
		     else
		     {
		    	 System.out.println("FREE");
		    	 btnc03.setStyle("-fx-background-color: #00ff00; ");
		    	 
		     }

		      
		}
	}
	/**
	 * 
	 * @param e it fetches the button of the room which is called
	 * @param btnc11 this reads the file C11.txt and checks if the room is free in the given time slot 
	 * or not.
	 * @throws IOException
	 * @throws ParseException
	 */
	public void C11Handler(ActionEvent e) throws IOException, ParseException
	{
		Stage stage = null;
		Parent root = null;
		
		
		if(e.getSource()== btnc11)
		{
			roomno = "C04";
			lblenter.setText(roomno);
			String datestr = lbldate2.getText();
			String timestr = lblstart2.getText();
			String timeend = lblend2.getText();		
			SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
			  Date dt1=format1.parse(datestr);
			  DateFormat format2=new SimpleDateFormat("EEEE"); 
			  String finalDay = format2.format(dt1);
			  
			  final String FILENAME4 = "C:\\Users\\khyati\\eclipse-workspace-oxygen\\APproject\\src\\application\\C11.txt";
			  FileReader  in4 = new FileReader(FILENAME4);
		      BufferedReader br4 = new BufferedReader(in4);
		      String input4;
		      //false flag means free
		      //true flag means booked
		      Boolean flag = false;
		     while ((input4 = br4.readLine()) != null) 
		        {
		        	String[] split = input4.split("\\s");
		        	if (finalDay.equals(split[0]))  
		        	{
		        		if(split[1].equals(timestr)|split[1].equals(timeend))
		        		{
		        			
		        			if(split[3].equals("*"))
		        			{
		        				flag = true;
		        			}
		        			else {
		        				 if(split[2].equals("true"))
				        			{
				        				flag = true;
				        			}
		        			}
		        			
		        		}
		        		
		        }
		}
		     if(flag.equals(true))
		     {
		    	 System.out.print("booked");
		    	  btnc11.setStyle("-fx-background-color: #ff0000; ");
		     }
		     else
		     {
		    	 System.out.println("FREE");
		    	 btnc11.setStyle("-fx-background-color: #00ff00; ");
		    	 
		     }

		}
	}
	/**
	 * 
	 * @param e it fetches the button of the room which is called
	 * @param btnc12 this reads the file C12.txt and checks if the room is free in the given time slot 
	 * or not.
	 * @throws IOException
	 * @throws ParseException
	 */
	public void C12Handler(ActionEvent e) throws IOException, ParseException
	{
		Stage stage = null;
		Parent root = null;
		
		
		if(e.getSource()== btnc12)
		{
			roomno = "C12";
			lblenter.setText(roomno);
			String datestr = lbldate2.getText();
			String timestr = lblstart2.getText();
			String timeend = lblend2.getText();		
			SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
			  Date dt1=format1.parse(datestr);
			  DateFormat format2=new SimpleDateFormat("EEEE"); 
			  String finalDay = format2.format(dt1);
			  
			  final String FILENAME5 = "C:\\Users\\khyati\\eclipse-workspace-oxygen\\APproject\\src\\application\\C12.txt";
			  FileReader  in5 = new FileReader(FILENAME5);
		      BufferedReader br5 = new BufferedReader(in5);
		      String input5;
		      //false flag means free
		      //true flag means booked
		      Boolean flag = false;
		     while ((input5 = br5.readLine()) != null) 
		        {
		        	String[] split = input5.split("\\s");
		        	if (finalDay.equals(split[0]))  
		        	{
		        		if(split[1].equals(timestr)|split[1].equals(timeend))
		        		{
		        			
		        			if(split[3].equals("*"))
		        			{
		        				flag = true;
		        			}
		        			else {
		        				 if(split[2].equals("true"))
				        			{
				        				flag = true;
				        			}
		        			}
		        			
		        		}
		        		
		        }
		}
		     if(flag.equals(true))
		     {
		    	 System.out.print("booked");
		    	  btnc12.setStyle("-fx-background-color: #ff0000; ");
		     }
		     else
		     {
		    	 System.out.println("FREE");
		    	 btnc12.setStyle("-fx-background-color: #00ff00; ");
		    	 
		     }

		}
	}
	/**
	 * 
	 * @param e it fetches the button of the room which is called
	 * @param btnc13 this reads the file C13.txt and checks if the room is free in the given time slot 
	 * or not.
	 * @throws IOException
	 * @throws ParseException
	 */
	public void C13Handler(ActionEvent e) throws IOException, ParseException
	{
		Stage stage = null;
		Parent root = null;
		
		
		if(e.getSource()== btnc13)
		{
			roomno = "C13";
			lblenter.setText(roomno);
			String datestr = lbldate2.getText();
			String timestr = lblstart2.getText();
			String timeend = lblend2.getText();		
			SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
			  Date dt1=format1.parse(datestr);
			  DateFormat format2=new SimpleDateFormat("EEEE"); 
			  String finalDay = format2.format(dt1);
			  
			  final String FILENAME6 = "C:\\Users\\khyati\\eclipse-workspace-oxygen\\APproject\\src\\application\\C13.txt";
			  FileReader  in6 = new FileReader(FILENAME6);
		      BufferedReader br6 = new BufferedReader(in6);
		      String input6;
		      //false flag means free
		      //true flag means booked
		      Boolean flag = false;
		     while ((input6 = br6.readLine()) != null) 
		        {
		        	String[] split = input6.split("\\s");
		        	if (finalDay.equals(split[0]))  
		        	{
		        		if(split[1].equals(timestr)|split[1].equals(timeend))
		        		{
		        			
		        			if(split[3].equals("*"))
		        			{
		        				flag = true;
		        			}
		        			else {
		        				 if(split[2].equals("true"))
				        			{
				        				flag = true;
				        			}
		        			}
		        			
		        		}
		        		
		        }
		}
		     if(flag.equals(true))
		     {
		    	 System.out.print("booked");
		    	  btnc13.setStyle("-fx-background-color: #ff0000; ");
		     }
		     else
		     {
		    	 System.out.println("FREE");
		    	 btnc13.setStyle("-fx-background-color: #00ff00; ");
		    	 
		     }

		      
		}
	}
	/**
	 * 
	 * @param e it fetches the button of the room which is called
	 * @param btnc21 this reads the file C21.txt and checks if the room is free in the given time slot 
	 * or not.
	 * @throws IOException
	 * @throws ParseException
	 */
	public void C21Handler(ActionEvent e) throws IOException, ParseException
	{
		Stage stage = null;
		Parent root = null;
		
		
		if(e.getSource()== btnc21)
		{
			roomno = "C21";
			lblenter.setText(roomno);
			String datestr = lbldate2.getText();
			String timestr = lblstart2.getText();
			String timeend = lblend2.getText();		
			SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
			  Date dt1=format1.parse(datestr);
			  DateFormat format2=new SimpleDateFormat("EEEE"); 
			  String finalDay = format2.format(dt1);
			  
			  final String FILENAME7 = "C:\\Users\\khyati\\eclipse-workspace-oxygen\\APproject\\src\\application\\C21.txt";
			  FileReader  in7 = new FileReader(FILENAME7);
		      BufferedReader br7 = new BufferedReader(in7);
		      String input7;
		      //false flag means free
		      //true flag means booked
		      Boolean flag = false;
		     while ((input7 = br7.readLine()) != null) 
		        {
		        	String[] split = input7.split("\\s");
		        	if (finalDay.equals(split[0]))  
		        	{
		        		if(split[1].equals(timestr)|split[1].equals(timeend))
		        		{
		        			
		        			if(split[3].equals("*"))
		        			{
		        				flag = true;
		        			}
		        			else {
		        				 if(split[2].equals("true"))
				        			{
				        				flag = true;
				        			}
		        			}
		        			
		        		}
		        		
		        }
		}
		     if(flag.equals(true))
		     {
		    	 System.out.print("booked");
		    	  btnc21.setStyle("-fx-background-color: #ff0000; ");
		     }
		     else
		     {
		    	 System.out.println("FREE");
		    	 btnc21.setStyle("-fx-background-color: #00ff00; ");
		    	 
		     }

		}
	}
	/**
	 * 
	 * @param e it fetches the button of the room which is called
	 * @param btnc22 this reads the file C22.txt and checks if the room is free in the given time slot 
	 * or not.
	 * @throws IOException
	 * @throws ParseException
	 */
	public void C22Handler(ActionEvent e) throws IOException, ParseException
	{
		Stage stage = null;
		Parent root = null;
		
		
		if(e.getSource()== btnc22)
		{
			roomno = "C22";
			lblenter.setText(roomno);
			String datestr = lbldate2.getText();
			String timestr = lblstart2.getText();
			String timeend = lblend2.getText();		
			SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
			  Date dt1=format1.parse(datestr);
			  DateFormat format2=new SimpleDateFormat("EEEE"); 
			  String finalDay = format2.format(dt1);
			  
			  final String FILENAME8 = "C:\\Users\\khyati\\eclipse-workspace-oxygen\\APproject\\src\\application\\C22.txt";
			  FileReader  in8 = new FileReader(FILENAME8);
		      BufferedReader br8 = new BufferedReader(in8);
		      String input8;
		      //false flag means free
		      //true flag means booked
		      Boolean flag = false;
		     while ((input8 = br8.readLine()) != null) 
		        {
		        	String[] split = input8.split("\\s");
		        	if (finalDay.equals(split[0]))  
		        	{
		        		if(split[1].equals(timestr)|split[1].equals(timeend))
		        		{
		        			
		        			if(split[3].equals("*"))
		        			{
		        				flag = true;
		        			}
		        			else {
		        				 if(split[2].equals("true"))
				        			{
				        				flag = true;
				        			}
		        			}
		        			
		        		}
		        		
		        }
		}
		     if(flag.equals(true))
		     {
		    	 System.out.print("booked");
		    	  btnc22.setStyle("-fx-background-color: #ff0000; ");
		     }
		     else
		     {
		    	 System.out.println("FREE");
		    	 btnc22.setStyle("-fx-background-color: #00ff00; ");
		    	 
		     }

		}
	}
	/**
	 * 
	 * @param e it fetches the button of the room which is called
	 * @param btnc23 this reads the file C23.txt and checks if the room is free in the given time slot 
	 * or not.
	 * @throws IOException
	 * @throws ParseException
	 */
	public void C23Handler(ActionEvent e) throws IOException, ParseException
	{
		Stage stage = null;
		Parent root = null;
		
		
		if(e.getSource()== btnc23)
		{
			roomno = "C23";
			lblenter.setText(roomno);
			String datestr = lbldate2.getText();
			String timestr = lblstart2.getText();
			String timeend = lblend2.getText();		
			SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
			  Date dt1=format1.parse(datestr);
			  DateFormat format2=new SimpleDateFormat("EEEE"); 
			  String finalDay = format2.format(dt1);
			  
			  final String FILENAME9 = "C:\\Users\\khyati\\eclipse-workspace-oxygen\\APproject\\src\\application\\C23.txt";
			  FileReader  in9 = new FileReader(FILENAME9);
		      BufferedReader br9 = new BufferedReader(in9);
		      String input9;
		      //false flag means free
		      //true flag means booked
		      Boolean flag = false;
		     while ((input9 = br9.readLine()) != null) 
		        {
		        	String[] split = input9.split("\\s");
		        	if (finalDay.equals(split[0]))  
		        	{
		        		if(split[1].equals(timestr)|split[1].equals(timeend))
		        		{
		        			
		        			if(split[3].equals("*"))
		        			{
		        				flag = true;
		        			}
		        			else {
		        				 if(split[2].equals("true"))
				        			{
				        				flag = true;
				        			}
		        			}
		        			
		        		}
		        		
		        }
		}
		     if(flag.equals(true))
		     {
		    	 System.out.print("booked");
		    	  btnc23.setStyle("-fx-background-color: #ff0000; ");
		     }
		     else
		     {
		    	 System.out.println("FREE");
		    	 btnc23.setStyle("-fx-background-color: #00ff00; ");
		    	 
		     }
	      
		}
	}
	/**
	 * 
	 * @param e it fetches the button of the room which is called
	 * @param btnc24 this reads the file C24.txt and checks if the room is free in the given time slot 
	 * or not.
	 * @throws IOException
	 * @throws ParseException
	 */
	public void C24Handler(ActionEvent e) throws IOException, ParseException
	{
		Stage stage = null;
		Parent root = null;
		
		
		if(e.getSource()== btnc24)
		{
			roomno = "C24";
			lblenter.setText(roomno);
			String datestr = lbldate2.getText();
			String timestr = lblstart2.getText();
			String timeend = lblend2.getText();		
			SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
			  Date dt1=format1.parse(datestr);
			  DateFormat format2=new SimpleDateFormat("EEEE"); 
			  String finalDay = format2.format(dt1);
			  
			  final String FILENAME10 = "C:\\Users\\khyati\\eclipse-workspace-oxygen\\APproject\\src\\application\\C24.txt";
			  FileReader  in10 = new FileReader(FILENAME10);
		      BufferedReader br10 = new BufferedReader(in10);
		      String input10;
		      //false flag means free
		      //true flag means booked
		      Boolean flag = false;
		     while ((input10 = br10.readLine()) != null) 
		        {
		        	String[] split = input10.split("\\s");
		        	if (finalDay.equals(split[0]))  
		        	{
		        		if(split[1].equals(timestr)|split[1].equals(timeend))
		        		{
		        			
		        			if(split[3].equals("*"))
		        			{
		        				flag = true;
		        			}
		        			else {
		        				 if(split[2].equals("true"))
				        			{
				        				flag = true;
				        			}
		        			}
		        			
		        		}
		        		
		        }
		}
		     if(flag.equals(true))
		     {
		    	 System.out.print("booked");
		    	  btnc24.setStyle("-fx-background-color: #ff0000; ");
		     }
		     else
		     {
		    	 System.out.println("FREE");
		    	 btnc24.setStyle("-fx-background-color: #00ff00; ");
		    	 
		     }

		      
		}
	}
	/**
	 * 
	 * @param e it fetches the button of the room which is called
	 * @param btns01 this reads the file S01.txt and checks if the room is free in the given time slot 
	 * or not.
	 * @throws IOException
	 * @throws ParseException
	 */
	public void S01Handler(ActionEvent e) throws IOException, ParseException
	{
		Stage stage = null;
		Parent root = null;
		
		
		if(e.getSource()== btns01)
		{
			roomno = "S01";
			lblenter.setText(roomno);
			String datestr = lbldate2.getText();
			String timestr = lblstart2.getText();
			String timeend = lblend2.getText();		
			SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
			  Date dt1=format1.parse(datestr);
			  DateFormat format2=new SimpleDateFormat("EEEE"); 
			  String finalDay = format2.format(dt1);
			  
			  final String FILENAME1 = "C:\\Users\\khyati\\eclipse-workspace-oxygen\\APproject\\src\\application\\S01.txt";
			  FileReader  in11 = new FileReader(FILENAME1);
		      BufferedReader br11 = new BufferedReader(in11);
		      String input11;
		      //false flag means free
		      //true flag means booked
		      Boolean flag = false;
		     while ((input11 = br11.readLine()) != null) 
		        {
		        	String[] split = input11.split("\\s");
		        	if (finalDay.equals(split[0]))  
		        	{
		        		if(split[1].equals(timestr)|split[1].equals(timeend))
		        		{
		        			
		        			if(split[3].equals("*"))
		        			{
		        				flag = true;
		        			}
		        			else {
		        				 if(split[2].equals("true"))
				        			{
				        				flag = true;
				        			}
		        			}
		        			
		        		}
		        		
		        }
		}
		     if(flag.equals(true))
		     {
		    	 System.out.print("booked");
		    	  btns01.setStyle("-fx-background-color: #ff0000; ");
		     }
		     else
		     {
		    	 System.out.println("FREE");
		    	 btns01.setStyle("-fx-background-color: #00ff00; ");
		    	 
		     }

		}
	}
	/**
	 * 
	 * @param e it fetches the button of the room which is called
	 * @param btns02 this reads the file S02.txt and checks if the room is free in the given time slot 
	 * or not.
	 * @throws IOException
	 * @throws ParseException
	 */
	public void S02Handler(ActionEvent e) throws IOException, ParseException
	{
		Stage stage = null;
		Parent root = null;
		
		
		if(e.getSource()== btns02)
		{
			roomno = "S02";
			lblenter.setText(roomno);
			String datestr = lbldate2.getText();
			String timestr = lblstart2.getText();
			String timeend = lblend2.getText();		
			SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
			  Date dt1=format1.parse(datestr);
			  DateFormat format2=new SimpleDateFormat("EEEE"); 
			  String finalDay = format2.format(dt1);
			  
			  final String FILENAME12 = "C:\\Users\\khyati\\eclipse-workspace-oxygen\\APproject\\src\\application\\S02.txt";
			  FileReader  in12 = new FileReader(FILENAME12);
		      BufferedReader br12 = new BufferedReader(in12);
		      String input12;
		      //false flag means free
		      //true flag means booked
		      Boolean flag = false;
		     while ((input12 = br12.readLine()) != null) 
		        {
		        	String[] split = input12.split("\\s");
		        	if (finalDay.equals(split[0]))  
		        	{
		        		if(split[1].equals(timestr)|split[1].equals(timeend))
		        		{
		        			
		        			if(split[3].equals("*"))
		        			{
		        				flag = true;
		        			}
		        			else {
		        				 if(split[2].equals("true"))
				        			{
				        				flag = true;
				        			}
		        			}
		        			
		        		}
		        		
		        }
		}
		     if(flag.equals(true))
		     {
		    	 System.out.print("booked");
		    	  btns02.setStyle("-fx-background-color: #ff0000; ");
		     }
		     else
		     {
		    	 System.out.println("FREE");
		    	 btns02.setStyle("-fx-background-color: #00ff00; ");
		    	 
		     }

		      
		}
	}
	/**
	 * 
	 * @param e it fetches the button of the room which is called
	 * @param btnlr1 this reads the file LR1.txt and checks if the room is free in the given time slot 
	 * or not.
	 * @throws IOException
	 * @throws ParseException
	 */
	public void LR1Handler(ActionEvent e) throws IOException, ParseException
	{
		Stage stage = null;
		Parent root = null;
		
		
		if(e.getSource()== btnlr1)
		{
			roomno = "LR1";
			lblenter.setText(roomno);
			String datestr = lbldate2.getText();
			String timestr = lblstart2.getText();
			String timeend = lblend2.getText();		
			SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
			  Date dt1=format1.parse(datestr);
			  DateFormat format2=new SimpleDateFormat("EEEE"); 
			  String finalDay = format2.format(dt1);
			  
			  final String FILENAME13 = "C:\\Users\\khyati\\eclipse-workspace-oxygen\\APproject\\src\\application\\LR1.txt";
			  FileReader  in13 = new FileReader(FILENAME13);
		      BufferedReader br13 = new BufferedReader(in13);
		      String input13;
		      //false flag means free
		      //true flag means booked
		      Boolean flag = false;
		     while ((input13 = br13.readLine()) != null) 
		        {
		        	String[] split = input13.split("\\s");
		        	if (finalDay.equals(split[0]))  
		        	{
		        		if(split[1].equals(timestr)|split[1].equals(timeend))
		        		{
		        			
		        			if(split[3].equals("*"))
		        			{
		        				flag = true;
		        			}
		        			else {
		        				 if(split[2].equals("true"))
				        			{
				        				flag = true;
				        			}
		        			}
		        			
		        		}
		        		
		        }
		}
		     if(flag.equals(true))
		     {
		    	 System.out.print("booked");
		    	  btnlr1.setStyle("-fx-background-color: #ff0000; ");
		     }
		     else
		     {
		    	 System.out.println("FREE");
		    	 btnlr1.setStyle("-fx-background-color: #00ff00; ");
		    	 
		     }

		}
	}/**
	 * 
	 * @param e it fetches the button of the room which is called
	 * @param btnlr2 this reads the file LR2.txt and checks if the room is free in the given time slot 
	 * or not.
	 * @throws IOException
	 * @throws ParseException
	 */
	
	public void LR2Handler(ActionEvent e) throws IOException, ParseException
	{
		Stage stage = null;
		Parent root = null;
		
		
		if(e.getSource()== btnlr2)
		{
			roomno = "LR2";
			lblenter.setText(roomno);
			String datestr = lbldate2.getText();
			String timestr = lblstart2.getText();
			String timeend = lblend2.getText();		
			SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
			  Date dt1=format1.parse(datestr);
			  DateFormat format2=new SimpleDateFormat("EEEE"); 
			  String finalDay = format2.format(dt1);
			  
			  final String FILENAME14 = "C:\\Users\\khyati\\eclipse-workspace-oxygen\\APproject\\src\\application\\LR2.txt";
			  FileReader  in14 = new FileReader(FILENAME14);
		      BufferedReader br14 = new BufferedReader(in14);
		      String input14;
		      //false flag means free
		      //true flag means booked
		      Boolean flag = false;
		     while ((input14 = br14.readLine()) != null) 
		        {
		        	String[] split = input14.split("\\s");
		        	if (finalDay.equals(split[0]))  
		        	{
		        		if(split[1].equals(timestr)|split[1].equals(timeend))
		        		{
		        			
		        			if(split[3].equals("*"))
		        			{
		        				flag = true;
		        			}
		        			else {
		        				 if(split[2].equals("true"))
				        			{
				        				flag = true;
				        			}
		        			}
		        			
		        		}
		        		
		        }
		}
		     if(flag.equals(true))
		     {
		    	 System.out.print("booked");
		    	  btnlr2.setStyle("-fx-background-color: #ff0000; ");
		     }
		     else
		     {
		    	 System.out.println("FREE");
		    	 btnlr2.setStyle("-fx-background-color: #00ff00; ");
		    	 
		     }

		      
		}
	}
	/**
	 * 
	 * @param e it fetches the button of the room which is called
	 * @param btnlr3 this reads the file LR3.txt and checks if the room is free in the given time slot 
	 * or not.
	 * @throws IOException
	 * @throws ParseException
	 */
	public void LR3Handler(ActionEvent e) throws IOException, ParseException
	{
		Stage stage = null;
		Parent root = null;
		
		
		if(e.getSource()== btnlr3)
		{
			roomno = "LR3";
			lblenter.setText(roomno);
			String datestr = lbldate2.getText();
			String timestr = lblstart2.getText();
			String timeend = lblend2.getText();		
			SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
			  Date dt1=format1.parse(datestr);
			  DateFormat format2=new SimpleDateFormat("EEEE"); 
			  String finalDay = format2.format(dt1);
			  
			  final String FILENAME15 = "C:\\Users\\khyati\\eclipse-workspace-oxygen\\APproject\\src\\application\\LR3.txt";
			  FileReader  in15 = new FileReader(FILENAME15);
		      BufferedReader br15 = new BufferedReader(in15);
		      String input15;
		      //false flag means free
		      //true flag means booked
		      Boolean flag = false;
		     while ((input15 = br15.readLine()) != null) 
		        {
		        	String[] split = input15.split("\\s");
		        	if (finalDay.equals(split[0]))  
		        	{
		        		if(split[1].equals(timestr)|split[1].equals(timeend))
		        		{
		        			
		        			if(split[3].equals("*"))
		        			{
		        				flag = true;
		        			}
		        			else {
		        				 if(split[2].equals("true"))
				        			{
				        				flag = true;
				        			}
		        			}
		        			
		        		}
		        		
		        }
		}
		     if(flag.equals(true))
		     {
		    	 System.out.print("booked");
		    	  btnlr3.setStyle("-fx-background-color: #ff0000; ");
		     }
		     else
		     {
		    	 System.out.println("FREE");
		    	 btnlr3.setStyle("-fx-background-color: #00ff00; ");
		    	 
		     }

		      
		}
	}
	/**
	 * 
	 * @param e it fetches the button of the room which is called
	 * @param btnlr4 this reads the file LR4.txt and checks if the room is free in the given time slot 
	 * or not.
	 * @throws IOException
	 * @throws ParseException
	 */
	public void LR4Handler(ActionEvent e) throws IOException, ParseException
	{
		Stage stage = null;
		Parent root = null;
		
		
		if(e.getSource()== btnlr4)
		{
			roomno = "LR4";
			
			String datestr = lbldate2.getText();
			String timestr = lblstart2.getText();
			String timeend = lblend2.getText();		
			SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
			  Date dt1=format1.parse(datestr);
			  DateFormat format2=new SimpleDateFormat("EEEE"); 
			  String finalDay = format2.format(dt1);
			  
			  final String FILENAME16 = "C:\\Users\\khyati\\eclipse-workspace-oxygen\\APproject\\src\\application\\LR4.txt";
			  FileReader  in16 = new FileReader(FILENAME16);
		      BufferedReader br16 = new BufferedReader(in16);
		      String input16;
		      //false flag means free
		      //true flag means booked
		      Boolean flag = false;
		     while ((input16 = br16.readLine()) != null) 
		        {
		        	String[] split = input16.split("\\s");
		        	if (finalDay.equals(split[0]))  
		        	{
		        		if(split[1].equals(timestr)|split[1].equals(timeend))
		        		{
		        			
		        			if(split[3].equals("*"))
		        			{
		        				flag = true;
		        			}
		        			else {
		        				 if(split[2].equals("true"))
				        			{
				        				flag = true;
				        			}
		        			}
		        			
		        		}
		        		
		        }
		}
		     if(flag.equals(true))
		     {
		    	 System.out.print("booked");
		    	  btnlr4.setStyle("-fx-background-color: #ff0000; ");
		     }
		     else
		     {
		    	 System.out.println("FREE");
		    	 btnlr4.setStyle("-fx-background-color: #00ff00; ");
		    	 
		     }

		}
	}
	/**
	 * 
	 * @param e it fetches the button to book the room
	 * @param btnbookroom this goes to the bookgenerl pagewhere you confirmthe booking that you have to do.
	 * @throws IOException
	 * @throws ParseException
	 */
	public void BookRoomHandler(ActionEvent e) throws IOException, ParseException
	{
		Stage stage = null;
		Parent root = null;
		
		
		if(e.getSource()== btnbookroom)
		{
			String datestr = lbldate2.getText();
			String starttimefinal = lblstart2.getText();		
			String endtimefinal = lblend2.getText();
			String enterroomfinal = lblenter.getText();
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/BookRoomGeneral.fxml"));
        	stage = (Stage)btnbookroom.getScene().getWindow();
        	root = (Parent)loader.load();
        	BookRoomGeneral_Controller bookroom = loader.<BookRoomGeneral_Controller>getController();
        	SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
			  Date dt1=format1.parse(datestr);
			  DateFormat format2=new SimpleDateFormat("EEEE"); 
			  String finalDay = format2.format(dt1);
		   bookroom.start.setText(starttimefinal);
		   bookroom.endt.setText(endtimefinal);
		   bookroom.day.setText(finalDay);
		   bookroom.lblenterroom.setText(enterroomfinal);
		   
		  
		   Scene scene = new Scene(root);
		    stage.setScene(scene);
		    stage.show();
				
				 
			
			
			

		}
	}

	
	public void BackButtonHandler(ActionEvent e) throws IOException
	{
		Stage stage = null;
		Parent root = null;
		
		if(e.getSource()== btnback)
		{
			stage = (Stage) btnback.getScene().getWindow();
			root = FXMLLoader.load(getClass().getResource("/application/BookRoom_FacultyPage.fxml"));
			 
		}
		
		Scene scene = new Scene(root);
	      stage.setScene(scene);
	      stage.show();

	}
	
	
	
}
