package Student_details;

public class StudBean {
	
	//studrollno.
	//studname
	//studfees
	
	private int studrollno;
	private String studname;
	private double studfees;
	
	
	//setter method
	public void setStudrollno(int rollno)
	{
		this.studrollno=rollno;
	}
	
	//getter method
	public int getStudrollno()
	{
		return studrollno;
	}
	
	//setter method
	public void setStudname(String name)
	{
		this.studname=name;
	}
	
	//getter method
	public String getStudname()
	{
		return studname;
	}
	
	//setter method
	public void setStudfees(double fees)
	{
		this.studfees=fees;
	}
	
	//getter method
	public double getStudfees()
	{
		return studfees;
	}
}
