package abstraction;

public abstract class Abs {
	
	//Abstract class will always be the parent class
	//Abstract class will never have java main method
	//Only in abstract class we can have abstract method
	//Abstract class is denoted by the keyword abstract
	
	private int empid;
	private String empname;
	private double empsal;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getEmpsal() {
		return empsal;
	}
	public void setEmpsal(double empsal) {
		this.empsal = empsal;
	}
	
	public abstract void display(); //Concrete Method
	
	//Method which is defined inside the abstract class
	//With abstract keyword is called as concrete method
	

}
