package DeviceBeans;

public class DeviceDetails {
	
	private int Device_Id;
	private String Device_Name;
	private String Device_OS;
	private double Kernel_Version;
	private String Manf_Date;
	private int IMET_code;
	private String Ram_Details;
	private String Device_Type;
	private String password;
	private String confirm_password;
	
	//right click > source > getter and setter > select all > generate
	
	
	//SETTER METHOD FOR DEVICE ID
	public void setDeviceID(int ID)
	{
		this.Device_Id= ID;
	}
	
	//GETTER METHOD
	public int getDeviceID()
	{
		return Device_Id;
	}
	
	//SETTER METHOD FOR DEVICE NAME 
	public void setDeviceName(String name)
	{
		this.Device_Name= name;
	}
	
	//GETTER METHOD
	public String getDeviceName()
	{
		return Device_Name;
	}
	
	//SETTER METHOD 
	public void setDeviceOS(String OS)
	{
		this.Device_OS= OS;
	}
	
	//GETTER METHOD
	public String getDeviceOS()
	{
		return Device_OS;
	}
	
	//SETTER METHOD FOR Kernel Version
	public void setKernelVersion(double version)
	{
		this.Kernel_Version= version;
	}
	
	//GETTER METHOD
	public double getKernelVersion()
	{
		return Kernel_Version;	
	}
	
	//SETTER METHOD FOR MANF DATE
	public void setManfDate(String date)
	{
		this.Manf_Date = date;
	}
	
	//GETTER METHOD
	public String getManfDate()
	{
		return Manf_Date;
	}
	
	//SETTER METHOD FOR IMET CODE
	public void setIMETcode(int code)
	{
		this.IMET_code = code;
	}
	
	//GETTER METHOD
	public int getIMETcode()
	{
		return IMET_code;
	}
	
	//SETTER METHOD for RAM Details
	public void setRAMdet(String details)
	{
		this.Ram_Details = details;
	}
	
	//GETTER METHOD
	public String getRAMdet()
	{
		return Ram_Details;
	}
	
	//SETTER METHOD for Device Type
	public void setDeviceType(String Type)
	{
		this.Device_Type= Type;
	}
	
	//GETTER METHOD
	public String getDeviceType()
	{
		return Device_Type;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirm_password() {
		return confirm_password;
	}

	public void setConfirm_password(String confirm_password) {
		this.confirm_password = confirm_password;
	}
	
	

}
