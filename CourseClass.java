package application;

import java.util.ArrayList;

public class CourseClass {
	String postconditions="";
	String course = "";
	String professor = "";
	String coursecode = "";
	String acronym = "";
	String credits = "";
	String coursetype = "";

	String preconditions= "";
	
	ArrayList<String> monday = new ArrayList<String>();
	
	ArrayList<String> tuesday = new ArrayList<String>();
	ArrayList<String> wednesday = new ArrayList<String>();
	ArrayList<String> thursday = new ArrayList<String>();
	ArrayList<String> friday = new ArrayList<String>();
//	String[][] tuesday = new String[1][2];
//	String[][] wednesday = new String[1][2];
//	String[][] thursday = new String[1][2];
//	String[][] friday = new String[1][2];
	
	@Override
	public String toString()
	{
		return (coursetype+" " + course +" " + coursecode +" " +professor+" " +credits+" " +acronym+" " +monday+" " +tuesday+" " +wednesday+" " +thursday+" " +friday+" " +preconditions+" " +postconditions );
	}
	
}
