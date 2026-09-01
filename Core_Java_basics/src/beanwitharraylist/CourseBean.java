package beanwitharraylist;

public class CourseBean {
	
	private int courseid;
	private String coursename;
	private double coursefees;
	
	//JavaBeans with ArrayList
	
	//a[] = {12,4,4,5,6,,6,7,8}
	
	// CourseID    CourseName     CourseFees
   //0th  101          Java          23000      
   //1st  102          Python       
	
	//Parameterized Constructor is acting like a setter method
	//            101         Java         45565
	CourseBean(int id, String name, double fees)
	{
		this.courseid=id;
		this.coursename=name;
		this.coursefees=fees;
	}

	//toString is acting like a GETTER METHOD
	@Override
	public String toString() {
		return "CourseBean [courseid=" + courseid + ", coursename=" + coursename + ", coursefees=" + coursefees + "]";
	}
	
	
	
}
