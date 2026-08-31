package thirdweek;

import java.util.Scanner;

public class StaticMethod {
	
	
	public static void PinVerify()
	{
		Scanner God = new Scanner(System.in);
		String Pin = "12345";
		
		System.out.println("Enter the pin:- ");
		String p=God.next(); //978
		
		if(Pin.equals(p)) //12345=978
		{
			System.out.println("Pin is Valid");
		}
		else
		{
			System.err.println("Pin is Invalid\n");
			PinVerify();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         PinVerify();
         
         // StaticMethod.PinVerify();
         
         //static is a non access modifier
         
	}

}
