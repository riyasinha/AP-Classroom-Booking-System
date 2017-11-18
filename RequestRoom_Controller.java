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
 * this appends the request in a.txtfile which is acxcesible only tothe admin
 *
 */

public class RequestRoom_Controller extends StudentRequestRoom_Controller{
	/**
	 * @para start start time
	 * @para endt end time
	 * @para day day corresponding to selected date
	 */
	//private static final String FILENAME1 = null;

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
	
	public static final String FILENAME = "C:\\Users\\riyas\\eclipse-workspace-oxygen\\AP Project - ClassRoom Booking\\src\\application\\Requests.txt";
	
	public void BookRoomGeneralHandler(ActionEvent e) throws IOException
	{
		Stage stage = null;
		Parent root = null;
		
		 FileWriter fw = new FileWriter(FILENAME,true);
		BufferedWriter bw = new BufferedWriter(fw);

		if(e.getSource()== btnbook)
		{
			String finalday = day.getText();
			String finalstarttime = start.getText();
			String finalendtime = endt.getText();
			String prefroom = txtroom.getText();
			String cap = capacity;
			String function = purpose;
			
			if(prefroom.equals(""))
			{
				prefroom = "";
			}
			String request = finalday + " " +finalstarttime + " " + finalendtime + " " + prefroom + " " + capacity + " " + function;
			bw.write(request);
			bw.newLine();
			
		}
		
	}
	
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

