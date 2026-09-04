package single_level;

public class College {
	
	//Parent Class will never have java main method
	// protected access modifier can be accessed only in current package
	//where parent class is connected with child class using extends keyword
	
	protected int colid;
	protected String cname;
	protected String colloc;
	
	public int getColid() {
		return colid;
	}
	public void setColid(int colid) {
		this.colid = colid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getColloc() {
		return colloc;
	}
	public void setColloc(String colloc) {
		this.colloc = colloc;
	}
	
	

}
