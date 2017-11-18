package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;

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
 * This book room general class is for both the faculty and admin since both are awarded  the same 
 * priority
 *It confirms the room and displays the previously entered date and day and start and end timings
 */
public class BookRoomGeneral_Controller extends BookRoom2_FacultyController{
	//private static final String FILENAME1 = null;
/**
 * @param btnbook this finally books the room and makes changes in the database
 * @param start displays the start time as entered. if wrong then go  back and fill again
 * @param endt displays the end time as entered. if wrong then go  back and fill again
 * @param day displays the day as entered. if wrong then go  back and fill again
 */
	@FXML
	TextField txtroom;
	@FXML
	Label lblenterroom;
	
	@FXML
	private Button btnbook;
	
	@FXML
	 Label start;
	
	@FXML
	 Label endt;
	
	@FXML
	 Label day;
	
	@FXML
	Button back;
	
	//public static final String FILENAMECONST = "C:\\Users\\khyati\\eclipse-workspace-oxygen\\APproject\\src\\application\\temp.txt";
	/**
	 * 
	 * @param e this is general handler which makes the changes according to final 
	 * room no and day you entered.
	 * @throws IOException
	 * @throws ParseException
	 */
	public void BookRoomGeneralHandler(ActionEvent e) throws IOException, ParseException
	{
		Stage stage = null;
		Parent root = null;
		String reqroom = txtroom.getText();
		
		if(e.getSource()== btnbook)
		{//System.out.println(reqroom);
			
			if(reqroom.equals("C01"))
			{
				 final String FILENAME = "C:\\Users\\riyas\\eclipse-workspace-oxygen\\AP Project - ClassRoom Booking\\src\\application\\C01.txt";
				 
				 FileReader  in = new FileReader(FILENAME);
				 BufferedReader br = new BufferedReader(in);
				 FileWriter fw = new FileWriter(FILENAME,true);
				BufferedWriter bw = new BufferedWriter(fw);
				//bw.newLine();
				String input;
				String finalday = day.getText();
				String finalstarttime = start.getText();
				String finalendtime = endt.getText();
			try {
					while ((input = br.readLine()) != null) 
			        {
					String[] split = input.split("\\s");
			        if (finalday.equals(split[0]) )
			        	{
			        	if(finalstarttime.equals(split[1]))
			        		{
			        		
			        		input = input.replaceAll("false", "true *");
			        		bw.write(input);
			        		bw.newLine();
			        		
			        		}
			        	if(finalendtime.equals(split[1]))
			        	{
			        		
			        		input = input.replaceAll("false", "true *");
			        		bw.write(input);
			        		bw.newLine();
			        	}
			        	}
			        {
			        	

				}
			        }
				}
				
				finally {

					try {

						if (bw != null)
							bw.close();

						if (fw != null)
							fw.close();
						
					

					} 
					catch (IOException ex) {

						ex.printStackTrace();

					}
				}
				
			}
			if(reqroom.equals("C02"))
			{
				 final String FILENAME = "C:\\Users\\riyas\\eclipse-workspace-oxygen\\AP Project - ClassRoom Booking\\src\\application\\C02.txt";
				 
				 FileReader  in = new FileReader(FILENAME);
				 BufferedReader br = new BufferedReader(in);
				 FileWriter fw = new FileWriter(FILENAME,true);
				BufferedWriter bw = new BufferedWriter(fw);
				//bw.newLine();
				String input;
				String finalday = day.getText();
				String finalstarttime = start.getText();
				String finalendtime = endt.getText();
			try {
					while ((input = br.readLine()) != null) 
			        {
					String[] split = input.split("\\s");
			        if (finalday.equals(split[0]) )
			        	{
			        	if(finalstarttime.equals(split[1]))
			        		{
			        		
			        		input = input.replaceAll("false", "true *");
			        		bw.write(input);
			        		bw.newLine();
			        		
			        		}
			        	if(finalendtime.equals(split[1]))
			        	{
			        		
			        		input = input.replaceAll("false", "true *");
			        		bw.write(input);
			        		bw.newLine();
			        	}
			        	}
			        {
			        	

				}
			        }
				}
				
				finally {

					try {

						if (bw != null)
							bw.close();

						if (fw != null)
							fw.close();
						
					

					} 
					catch (IOException ex) {

						ex.printStackTrace();

					}
				}
				
			}
			if(reqroom.equals("C03"))
			{
				 final String FILENAME = "C:\\Users\\riyas\\eclipse-workspace-oxygen\\AP Project - ClassRoom Booking\\src\\application\\C03.txt";
				 
				 FileReader  in = new FileReader(FILENAME);
				 BufferedReader br = new BufferedReader(in);
				 FileWriter fw = new FileWriter(FILENAME,true);
				BufferedWriter bw = new BufferedWriter(fw);
				//bw.newLine();
				String input;
				String finalday = day.getText();
				String finalstarttime = start.getText();
				String finalendtime = endt.getText();
			try {
					while ((input = br.readLine()) != null) 
			        {
					String[] split = input.split("\\s");
			        if (finalday.equals(split[0]) )
			        	{
			        	if(finalstarttime.equals(split[1]))
			        		{
			        		
			        		input = input.replaceAll("false", "true *");
			        		bw.write(input);
			        		bw.newLine();
			        		
			        		}
			        	if(finalendtime.equals(split[1]))
			        	{
			        		
			        		input = input.replaceAll("false", "true *");
			        		bw.write(input);
			        		bw.newLine();
			        	}
			        	}
			        {
			        	

				}
			        }
				}
				
				finally {

					try {

						if (bw != null)
							bw.close();

						if (fw != null)
							fw.close();
						
					

					} 
					catch (IOException ex) {

						ex.printStackTrace();

					}
				}
				
			}
			if(reqroom.equals("C11"))
			{
				 final String FILENAME = "C:\\Users\\riyas\\eclipse-workspace-oxygen\\AP Project - ClassRoom Booking\\src\\application\\C11.txt";
				 
				 FileReader  in = new FileReader(FILENAME);
				 BufferedReader br = new BufferedReader(in);
				 FileWriter fw = new FileWriter(FILENAME,true);
				BufferedWriter bw = new BufferedWriter(fw);
				//bw.newLine();
				String input;
				String finalday = day.getText();
				String finalstarttime = start.getText();
				String finalendtime = endt.getText();
			try {
					while ((input = br.readLine()) != null) 
			        {
					String[] split = input.split("\\s");
			        if (finalday.equals(split[0]) )
			        	{
			        	if(finalstarttime.equals(split[1]))
			        		{
			        		
			        		input = input.replaceAll("false", "true *");
			        		bw.write(input);
			        		bw.newLine();
			        		
			        		}
			        	if(finalendtime.equals(split[1]))
			        	{
			        		
			        		input = input.replaceAll("false", "true *");
			        		bw.write(input);
			        		bw.newLine();
			        	}
			        	}
			        {
			        	

				}
			        }
				}
				
				finally {

					try {

						if (bw != null)
							bw.close();

						if (fw != null)
							fw.close();
						
					

					} 
					catch (IOException ex) {

						ex.printStackTrace();

					}
				}
				
			}
			if(reqroom.equals("C12"))
			{
				 final String FILENAME = "C:\\Users\\riyas\\eclipse-workspace-oxygen\\AP Project - ClassRoom Booking\\src\\application\\C12.txt";
				 
				 FileReader  in = new FileReader(FILENAME);
				 BufferedReader br = new BufferedReader(in);
				 FileWriter fw = new FileWriter(FILENAME,true);
				BufferedWriter bw = new BufferedWriter(fw);
				//bw.newLine();
				String input;
				String finalday = day.getText();
				String finalstarttime = start.getText();
				String finalendtime = endt.getText();
			try {
					while ((input = br.readLine()) != null) 
			        {
					String[] split = input.split("\\s");
			        if (finalday.equals(split[0]) )
			        	{
			        	if(finalstarttime.equals(split[1]))
			        		{
			        		
			        		input = input.replaceAll("false", "true *");
			        		bw.write(input);
			        		bw.newLine();
			        		
			        		}
			        	if(finalendtime.equals(split[1]))
			        	{
			        		
			        		input = input.replaceAll("false", "true *");
			        		bw.write(input);
			        		bw.newLine();
			        	}
			        	}
			        {
			        	

				}
			        }
				}
				
				finally {

					try {

						if (bw != null)
							bw.close();

						if (fw != null)
							fw.close();
						
					

					} 
					catch (IOException ex) {

						ex.printStackTrace();

					}
				}
				
			}
			if(reqroom.equals("C13"))
			{
				 final String FILENAME = "C:\\Users\\riyas\\eclipse-workspace-oxygen\\AP Project - ClassRoom Booking\\src\\application\\C13.txt";
				 
				 FileReader  in = new FileReader(FILENAME);
				 BufferedReader br = new BufferedReader(in);
				 FileWriter fw = new FileWriter(FILENAME,true);
				BufferedWriter bw = new BufferedWriter(fw);
				//bw.newLine();
				String input;
				String finalday = day.getText();
				String finalstarttime = start.getText();
				String finalendtime = endt.getText();
			try {
					while ((input = br.readLine()) != null) 
			        {
					String[] split = input.split("\\s");
			        if (finalday.equals(split[0]) )
			        	{
			        	if(finalstarttime.equals(split[1]))
			        		{
			        		
			        		input = input.replaceAll("false", "true *");
			        		bw.write(input);
			        		bw.newLine();
			        		
			        		}
			        	if(finalendtime.equals(split[1]))
			        	{
			        		
			        		input = input.replaceAll("false", "true *");
			        		bw.write(input);
			        		bw.newLine();
			        	}
			        	}
			        {
			        	

				}
			        }
				}
				
				finally {

					try {

						if (bw != null)
							bw.close();

						if (fw != null)
							fw.close();
						
					

					} 
					catch (IOException ex) {

						ex.printStackTrace();

					}
				}
				
			}
			if(reqroom.equals("C21"))
			{
				 final String FILENAME = "C:\\Users\\riyas\\eclipse-workspace-oxygen\\AP Project - ClassRoom Booking\\src\\application\\C21.txt";
				 
				 FileReader  in = new FileReader(FILENAME);
				 BufferedReader br = new BufferedReader(in);
				 FileWriter fw = new FileWriter(FILENAME,true);
				BufferedWriter bw = new BufferedWriter(fw);
				//bw.newLine();
				String input;
				String finalday = day.getText();
				String finalstarttime = start.getText();
				String finalendtime = endt.getText();
			try {
					while ((input = br.readLine()) != null) 
			        {
					String[] split = input.split("\\s");
			        if (finalday.equals(split[0]) )
			        	{
			        	if(finalstarttime.equals(split[1]))
			        		{
			        		
			        		input = input.replaceAll("false", "true *");
			        		bw.write(input);
			        		bw.newLine();
			        		
			        		}
			        	if(finalendtime.equals(split[1]))
			        	{
			        		
			        		input = input.replaceAll("false", "true *");
			        		bw.write(input);
			        		bw.newLine();
			        	}
			        	}
			        {
			        	

				}
			        }
				}
				
				finally {

					try {

						if (bw != null)
							bw.close();

						if (fw != null)
							fw.close();
						
					

					} 
					catch (IOException ex) {

						ex.printStackTrace();

					}
				}
				
			}
			if(reqroom.equals("C22"))
			{
				 final String FILENAME = "C:\\Users\\riyas\\eclipse-workspace-oxygen\\AP Project - ClassRoom Booking\\src\\application\\C22.txt";
				 
				 FileReader  in = new FileReader(FILENAME);
				 BufferedReader br = new BufferedReader(in);
				 FileWriter fw = new FileWriter(FILENAME,true);
				BufferedWriter bw = new BufferedWriter(fw);
				//bw.newLine();
				String input;
				String finalday = day.getText();
				String finalstarttime = start.getText();
				String finalendtime = endt.getText();
			try {
					while ((input = br.readLine()) != null) 
			        {
					String[] split = input.split("\\s");
			        if (finalday.equals(split[0]) )
			        	{
			        	if(finalstarttime.equals(split[1]))
			        		{
			        		
			        		input = input.replaceAll("false", "true *");
			        		bw.write(input);
			        		bw.newLine();
			        		
			        		}
			        	if(finalendtime.equals(split[1]))
			        	{
			        		
			        		input = input.replaceAll("false", "true *");
			        		bw.write(input);
			        		bw.newLine();
			        	}
			        	}
			        {
			        	

				}
			        }
				}
				
				finally {

					try {

						if (bw != null)
							bw.close();

						if (fw != null)
							fw.close();
						
					

					} 
					catch (IOException ex) {

						ex.printStackTrace();

					}
				}
				
			}
			if(reqroom.equals("C23"))
			{
				 final String FILENAME = "C:\\Users\\riyas\\eclipse-workspace-oxygen\\AP Project - ClassRoom Booking\\src\\application\\C23.txt";
				 
				 FileReader  in = new FileReader(FILENAME);
				 BufferedReader br = new BufferedReader(in);
				 FileWriter fw = new FileWriter(FILENAME,true);
				BufferedWriter bw = new BufferedWriter(fw);
				//bw.newLine();
				String input;
				String finalday = day.getText();
				String finalstarttime = start.getText();
				String finalendtime = endt.getText();
			try {
					while ((input = br.readLine()) != null) 
			        {
					String[] split = input.split("\\s");
			        if (finalday.equals(split[0]) )
			        	{
			        	if(finalstarttime.equals(split[1]))
			        		{
			        		
			        		input = input.replaceAll("false", "true *");
			        		bw.write(input);
			        		bw.newLine();
			        		
			        		}
			        	if(finalendtime.equals(split[1]))
			        	{
			        		
			        		input = input.replaceAll("false", "true *");
			        		bw.write(input);
			        		bw.newLine();
			        	}
			        	}
			        {
			        	

				}
			        }
				}
				
				finally {

					try {

						if (bw != null)
							bw.close();

						if (fw != null)
							fw.close();
						
					

					} 
					catch (IOException ex) {

						ex.printStackTrace();

					}
				}
				
			}
			if(reqroom.equals("S01"))
			{
				 final String FILENAME = "C:\\Users\\riyas\\eclipse-workspace-oxygen\\AP Project - ClassRoom Booking\\src\\application\\S01.txt";
				 
				 FileReader  in = new FileReader(FILENAME);
				 BufferedReader br = new BufferedReader(in);
				 FileWriter fw = new FileWriter(FILENAME,true);
				BufferedWriter bw = new BufferedWriter(fw);
				//bw.newLine();
				String input;
				String finalday = day.getText();
				String finalstarttime = start.getText();
				String finalendtime = endt.getText();
			try {
					while ((input = br.readLine()) != null) 
			        {
					String[] split = input.split("\\s");
			        if (finalday.equals(split[0]) )
			        	{
			        	if(finalstarttime.equals(split[1]))
			        		{
			        		
			        		input = input.replaceAll("false", "true *");
			        		bw.write(input);
			        		bw.newLine();
			        		
			        		}
			        	if(finalendtime.equals(split[1]))
			        	{
			        		
			        		input = input.replaceAll("false", "true *");
			        		bw.write(input);
			        		bw.newLine();
			        	}
			        	}
			        {
			        	

				}
			        }
				}
				
				finally {

					try {

						if (bw != null)
							bw.close();

						if (fw != null)
							fw.close();
						
					

					} 
					catch (IOException ex) {

						ex.printStackTrace();

					}
				}
				
			}
			if(reqroom.equals("S02"))
			{
				 final String FILENAME = "C:\\Users\\riyas\\eclipse-workspace-oxygen\\AP Project - ClassRoom Booking\\src\\application\\S02.txt";
				 
				 FileReader  in = new FileReader(FILENAME);
				 BufferedReader br = new BufferedReader(in);
				 FileWriter fw = new FileWriter(FILENAME,true);
				BufferedWriter bw = new BufferedWriter(fw);
				//bw.newLine();
				String input;
				String finalday = day.getText();
				String finalstarttime = start.getText();
				String finalendtime = endt.getText();
			try {
					while ((input = br.readLine()) != null) 
			        {
					String[] split = input.split("\\s");
			        if (finalday.equals(split[0]) )
			        	{
			        	if(finalstarttime.equals(split[1]))
			        		{
			        		
			        		input = input.replaceAll("false", "true *");
			        		bw.write(input);
			        		bw.newLine();
			        		
			        		}
			        	if(finalendtime.equals(split[1]))
			        	{
			        		
			        		input = input.replaceAll("false", "true *");
			        		bw.write(input);
			        		bw.newLine();
			        	}
			        	}
			        {
			        	

				}
			        }
				}
				
				finally {

					try {

						if (bw != null)
							bw.close();

						if (fw != null)
							fw.close();
						
					

					} 
					catch (IOException ex) {

						ex.printStackTrace();

					}
				}
				
			}
			if(reqroom.equals("LR1"))
			{
				 final String FILENAME = "C:\\Users\\riyas\\eclipse-workspace-oxygen\\AP Project - ClassRoom Booking\\src\\application\\LR1.txt";
				 
				 FileReader  in = new FileReader(FILENAME);
				 BufferedReader br = new BufferedReader(in);
				 FileWriter fw = new FileWriter(FILENAME,true);
				BufferedWriter bw = new BufferedWriter(fw);
				//bw.newLine();
				String input;
				String finalday = day.getText();
				String finalstarttime = start.getText();
				String finalendtime = endt.getText();
			try {
					while ((input = br.readLine()) != null) 
			        {
					String[] split = input.split("\\s");
			        if (finalday.equals(split[0]) )
			        	{
			        	if(finalstarttime.equals(split[1]))
			        		{
			        		
			        		input = input.replaceAll("false", "true *");
			        		bw.write(input);
			        		bw.newLine();
			        		
			        		}
			        	if(finalendtime.equals(split[1]))
			        	{
			        		
			        		input = input.replaceAll("false", "true *");
			        		bw.write(input);
			        		bw.newLine();
			        	}
			        	}
			        {
			        	

				}
			        }
				}
				
				finally {

					try {

						if (bw != null)
							bw.close();

						if (fw != null)
							fw.close();
						
					

					} 
					catch (IOException ex) {

						ex.printStackTrace();

					}
				}
				
			}
			if(reqroom.equals("LR2"))
			{
				 final String FILENAME = "C:\\Users\\riyas\\eclipse-workspace-oxygen\\AP Project - ClassRoom Booking\\src\\application\\LR2.txt";
				 
				 FileReader  in = new FileReader(FILENAME);
				 BufferedReader br = new BufferedReader(in);
				 FileWriter fw = new FileWriter(FILENAME,true);
				BufferedWriter bw = new BufferedWriter(fw);
				//bw.newLine();
				String input;
				String finalday = day.getText();
				String finalstarttime = start.getText();
				String finalendtime = endt.getText();
			try {
					while ((input = br.readLine()) != null) 
			        {
					String[] split = input.split("\\s");
			        if (finalday.equals(split[0]) )
			        	{
			        	if(finalstarttime.equals(split[1]))
			        		{
			        		
			        		input = input.replaceAll("false", "true *");
			        		bw.write(input);
			        		bw.newLine();
			        		
			        		}
			        	if(finalendtime.equals(split[1]))
			        	{
			        		
			        		input = input.replaceAll("false", "true *");
			        		bw.write(input);
			        		bw.newLine();
			        	}
			        	}
			        {
			        	

				}
			        }
				}
				
				finally {

					try {

						if (bw != null)
							bw.close();

						if (fw != null)
							fw.close();
						
					

					} 
					catch (IOException ex) {

						ex.printStackTrace();

					}
				}
				
			}
			if(reqroom.equals("LR3"))
			{
				 final String FILENAME = "C:\\Users\\riyas\\eclipse-workspace-oxygen\\AP Project - ClassRoom Booking\\src\\application\\LR3.txt";
				 
				 FileReader  in = new FileReader(FILENAME);
				 BufferedReader br = new BufferedReader(in);
				 FileWriter fw = new FileWriter(FILENAME,true);
				BufferedWriter bw = new BufferedWriter(fw);
				//bw.newLine();
				String input;
				String finalday = day.getText();
				String finalstarttime = start.getText();
				String finalendtime = endt.getText();
			try {
					while ((input = br.readLine()) != null) 
			        {
					String[] split = input.split("\\s");
			        if (finalday.equals(split[0]) )
			        	{
			        	if(finalstarttime.equals(split[1]))
			        		{
			        		
			        		input = input.replaceAll("false", "true *");
			        		bw.write(input);
			        		bw.newLine();
			        		
			        		}
			        	if(finalendtime.equals(split[1]))
			        	{
			        		
			        		input = input.replaceAll("false", "true *");
			        		bw.write(input);
			        		bw.newLine();
			        	}
			        	}
			        {
			        	

				}
			        }
				}
				
				finally {

					try {

						if (bw != null)
							bw.close();

						if (fw != null)
							fw.close();
						
					

					} 
					catch (IOException ex) {

						ex.printStackTrace();

					}
				}
				
			}
			if(reqroom.equals("LR4"))
			{
				 final String FILENAME = "C:\\Users\\riyas\\eclipse-workspace-oxygen\\AP Project - ClassRoom Booking\\src\\application\\LR4.txt";
				 
				 FileReader  in = new FileReader(FILENAME);
				 BufferedReader br = new BufferedReader(in);
				 FileWriter fw = new FileWriter(FILENAME,true);
				BufferedWriter bw = new BufferedWriter(fw);
				//bw.newLine();
				String input;
				String finalday = day.getText();
				String finalstarttime = start.getText();
				String finalendtime = endt.getText();
			try {
					while ((input = br.readLine()) != null) 
			        {
					String[] split = input.split("\\s");
			        if (finalday.equals(split[0]) )
			        	{
			        	if(finalstarttime.equals(split[1]))
			        		{
			        		
			        		input = input.replaceAll("false", "true *");
			        		bw.write(input);
			        		bw.newLine();
			        		
			        		}
			        	if(finalendtime.equals(split[1]))
			        	{
			        		
			        		input = input.replaceAll("false", "true *");
			        		bw.write(input);
			        		bw.newLine();
			        	}
			        	}
			        {
			        	

				}
			        }
				}
				
				finally {

					try {

						if (bw != null)
							bw.close();

						if (fw != null)
							fw.close();
						
					

					} 
					catch (IOException ex) {

						ex.printStackTrace();

					}
				}
				
			}
					
		}
		
	}
	/**
	 * 
	 * @param e goes back for entering details
	 * @throws IOException
	 */
	
	public void BackHandler(ActionEvent e) throws IOException
	{
		Stage stage = null;
		Parent root = null;
		
		if(e.getSource()== back)
		{
			stage = (Stage) back.getScene().getWindow();
			root = FXMLLoader.load(getClass().getResource("/application/BookRoom2_FacultyPage.fxml"));
			 
		}
		
		Scene scene = new Scene(root);
	      stage.setScene(scene);
	      stage.show();

	}
}

