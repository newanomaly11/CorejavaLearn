package simplebean;

public class Empbean {
	
	//Java beans is concept where we store values inside the 
	//variables indirectly with the help of setter and getter 
	//method
	
	//Java beans is used for security purpose,it makes it more secured.
	
	/*1. Setting Method:- is used to store values inside the variables
	 * 2.Getting method:- is used to get or print values from the variables.
	 * 
	 * SETTER METHOD:- METHOD WITH PARAMETERS
	 * GETTER METHOD:-METHOD WITHOUT VOID
	 * 
	 * Variables should be private and Global.
	 * "this" keyword is used to share value of parameter with private 
	 * variable
	 * 
	 */
	
	private int empid; //101
	private String empname;
	private double empsal;
	
	//SETTER METHOD        101
	public void setEmpid(int id)
	{
		this.empid=id; //101
	}
	
	//Getter method
	public int getEmpid()
	{
		return empid;
	}
	
	//SETTER METHOD
	public void setEmpname(String name)
	{
		this.empname=name;
	}
	
	//getter method
	public String getEmpname()
	{
		return empname;
	}
	
	//SETTER METHOD
	public void setEmpsal(double sal)
	{
		this.empsal=sal;
	}
	
	//GETTER METHOD
	public double getEmpsal()
	{
		return empsal;
	}
	
	
	
	
	

}
