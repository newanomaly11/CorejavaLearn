package beanwithotherbean;

public class PersonBean {
	
	/*
	 * Bean with other Bean
	 * Aggregation Relationship
	 * Indirect Relationship
	 * HAS-A relationship
	 * Wrapper class
	 */
	
	
	
	
	
	private int pid;
	private String pname;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	@Override
	public String toString() {
		return "PersonBean [pid=" + pid + ", pname=" + pname + "]";
	}
	
	//toString is predefined method of Java Class
	//it is used to print or get all the private variables value together 
	//it is also used to prevent garbage value
	
	
	

}
