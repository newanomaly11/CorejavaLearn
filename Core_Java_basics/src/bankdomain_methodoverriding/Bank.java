package bankdomain_methodoverriding;

public class Bank {
	
	public void calculateInterest(double principal, double time)
	{
		double rate = 5;
		
		double interest = (principal * time * rate)/100;
		
		System.out.println("Bank Interest:- "+interest);
	}

}
