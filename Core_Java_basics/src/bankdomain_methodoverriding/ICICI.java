package bankdomain_methodoverriding;

public class ICICI extends Bank {
	
	public void calculateInterest(double principal, double time)
	{
		double rate = 7;
		
		double interest = (principal * time * rate)/100;
		
		System.out.println("Bank Interest:- "+interest);
	}

}
