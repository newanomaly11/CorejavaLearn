package Bank_Details;

public class AccountBean {
	
	private int AccID;
	private String AccName;
	private Bankbean bb;
	
	public int getAccID() {
		return AccID;
	}
	public void setAccID(int accID) {
		AccID = accID;
	}
	public String getAccName() {
		return AccName;
	}
	public void setAccName(String accName) {
		AccName = accName;
	}
	public Bankbean getBb() {
		return bb;
	}
	public void setBb(Bankbean bb) {
		this.bb = bb;
	}
	
	

}
