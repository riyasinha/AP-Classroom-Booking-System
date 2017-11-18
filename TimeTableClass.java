package application;

public class TimeTableClass{

	String course;
	String mon;
	String tue;
	String wed;
	String thu;
	String fri;
	
//	String mon_time;
//	String mon_ven;
//	String tue_time;
//	String tue_ven;
//	String wed_time;
//	String wed_ven;
//	String thu_time;
//	String thu_ven;
//	String fri_time;
//	String fri_ven;
	
	public TimeTableClass(String c,String mt, String mv, String tt,String tv, String wt, String wv, String tht, String thv, String ft, String fv)
	{
		this.course = c;
		this.mon =mt+" ," +mv;
		this.tue =tt+" ," +tv;
		this.thu =tht+" ," +thv;
		this.wed =wt+" ," +wv;
		this.fri =ft+" ," +fv;
		
	}
	
//	public String getCourse() {
//		return course;
//	}
//
//	public String getMon() {
//		return mon;
//	}
//
//	public String getTue() {
//		return tue;
//	}
//
//	public String getWed() {
//		return wed;
//	}
//
//	public String getThu() {
//		return thu;
//	}
//
//	public String getFri() {
//		return fri;
//	}
//
//	void setName(String n)
//	{
//		course =n;
//	}
//	void setMon(String t, String v)
//	{
//		mon = t+" , "+ v;
//	}
//	void setThu(String t, String v)
//	{
//		thu = t+" , "+ v;
//	}
//	void setTue(String t, String v)
//	{
//		tue = t+" , "+ v;
//	}
//	void setWed(String t, String v)
//	{
//		wed = t+" , "+ v;
//	}
//	void setFri(String t, String v)
//	{
//		fri = t+" , "+ v;
//	}
}
