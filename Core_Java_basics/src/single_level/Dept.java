package single_level;

public class Dept extends College {
	
	//extends keyword is used to share all the details of 
	//of parent class with child class
	
	protected int deptid;
	protected String deptname;
	
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	
	

}
