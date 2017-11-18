package application;

import java.util.ArrayList;

/**
 * Course class that contains all the attributes of the course
 * 
 * @author riyas
 *
 */
public class CourseClass {
	
	/**
	 * @param postconditions
	 *  @param course
	 *   @param professor
	 *    @param coursecode
	 *     @param precondtions
	 *      @param acronym
	 *       @param credits
	 *        @param coursetype
	 *         @param monday
	 *          @param tuesday
	 *           @param wednesday
	 *            @param thursday
	 *             @param friday
	 */
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
