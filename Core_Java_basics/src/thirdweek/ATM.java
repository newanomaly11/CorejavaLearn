package thirdweek;

import java.util.Scanner;

public class ATM {
	
	static Scanner God = new Scanner(System.in);
	
	static double Bal =0.0;
	
	public static void Deposit()
	{
		System.out.println("Enter the amount to deposit");
		double dep=God.nextDouble(); //500
		
		if(dep>=100)
		{
			System.out.println(dep+" amount has been deposited successfully");
			Bal=Bal+dep; //Bal=0.0+500
		}
		else
		{
			System.err.println("Please enter the amount greater than Rs.100");
			Deposit();
		}
		
	}
	
	public static void WithDraw()
	{
		System.out.println("Enter the amount to withdraw");
		double withdr=God.nextDouble(); //500
		
		if(Bal<=100)
		{
			System.out.println("Balance Insufficient...please deposit first");
			Choice();
		}
		else
		  {	
		    if(withdr>=100)
		  {
			System.out.println(withdr+" amount has been withdrawn successfully");
			Bal=Bal-withdr; //Bal=0.0+500
		  }
		else
		   {
			System.err.println("Please enter the amount greater than Rs.100");
			WithDraw();
		  }
		
	    }
		
	  }
	
	
	public static void Choice()
	{
		System.out.println("Enter your Choice..\n1.DEPOSIT \n2.WITHDRAWN \n3.CHECK BALANCE");
		int a = God.nextInt();
		
		switch(a)
		{
		case 1:
			Deposit();
			break;
		case 2:
			WithDraw();
			break;
		case 3:
			System.out.println("Your Current Balance is  "+Bal);
			break;
			
		default:
			System.err.println("Invalid Choice...");
			Choice();
			break;
		}
	}
	
	
	public static  void Transaction()
	{
		Choice();
		
		System.out.println("Do you want to continue? Yes or No");
		String option = God.next();
		
		if(option.equalsIgnoreCase("Yes"))
		{
			Transaction();
		}
		else if(option.equalsIgnoreCase("No"))
		{
			System.out.println("Thank you for using our service...");
		}
	}
		
		
	
	
	
	public static void PinVerify()
	{
		
        String pin1 = "12345";
		
		System.out.println("Enter your pin:- ");
		String pin2=God.next(); // 2345
		
		//            2<=3
		for(int i=1 ; i<=3 ; i++)
		{
			if(i<=2)  // 2<=2
			{
				
				if(pin1.equals(pin2)) //12345=12345
				{
					System.out.println("Pin is Valid");
					Transaction();
					break;
				}
				else
				{
					System.out.println("Pin is invalid, please try again");
					pin2=God.next(); // 12345
				}
				
			}
			else if(i==3)  //3==3
			{
				if(pin1.equals(pin2)) // 12345==12345
				{
					System.out.println("Pin is Valid");
					Transaction();
					break;
				}
				else
				{
					System.out.println("Account has been blocked");
				}
			}
		}
		
		
		
	}



	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		PinVerify();
	}

}


