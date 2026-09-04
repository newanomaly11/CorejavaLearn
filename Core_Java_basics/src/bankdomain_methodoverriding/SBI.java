package bankdomain_methodoverriding;

public class SBI extends Bank {
	
	public void CalculateInterest(double principal, double time)
	{
		double rate = 5.3;
		
		double interest = (principal * time * rate)/100;
		
		System.out.println("Bank Interest:- "+interest);
		
		
	}

}
