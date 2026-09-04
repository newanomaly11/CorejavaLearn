package institutebean;

public abstract class Institute {
	
	private int inst_id;
	private String instname;
	private String instloc;
	public int getInst_id() {
		return inst_id;
	}
	public void setInst_id(int inst_id) {
		this.inst_id = inst_id;
	}
	public String getInstname() {
		return instname;
	}
	public void setInstname(String instname) {
		this.instname = instname;
	}
	public String getInstloc() {
		return instloc;
	}
	public void setInstloc(String instloc) {
		this.instloc = instloc;
	}
	
	public abstract void Inst_details();

}
