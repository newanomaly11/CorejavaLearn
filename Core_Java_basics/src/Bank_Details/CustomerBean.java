package Bank_Details;

public class CustomerBean {
	
	private int CustID;
	private String CustName;
	private double Bank_bal;
	private Bankbean bb;
	
	public int getCustID() {
		return CustID;
	}
	public void setCustID(int custID) {
		CustID = custID;
	}
	public String getCustName() {
		return CustName;
	}
	public void setCustName(String custName) {
		CustName = custName;
	}
	public double getBank_bal() {
		return Bank_bal;
	}
	public void setBank_bal(double bank_bal) {
		Bank_bal = bank_bal;
	}
	public Bankbean getBb() {
		return bb;
	}
	public void setBb(Bankbean bb) {
		this.bb = bb;
	}
	
	

}
