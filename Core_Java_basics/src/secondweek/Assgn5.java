package secondweek;

import java.util.Scanner;

public class Assgn5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner God = new Scanner(System.in);
		
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
					break;
				}
				else
				{
					System.out.println("Account has been blocked");
				}
			}
		}
		
		
		
	}

}
