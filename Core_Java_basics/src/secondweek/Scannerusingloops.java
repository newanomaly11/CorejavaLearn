package secondweek;

import java.util.Scanner;

public class Scannerusingloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b;
		System.out.println("Enter two numbers: ");
		Scanner God = new Scanner(System.in);
		a = God.nextInt();
		b = God.nextInt();
		
		if(a>b)
		{
			System.out.println("Greatest number is = " +a);
		}
		else if(a<b)
		{
			System.out.println("Greatest number is = " +b);
		}
		else if(a==b)
		{
			System.out.println("Both are equal numbers");
		}
		
		
		/* Assgn 1
		  Enter any number for factorial
		  5
		  Factorial of 5 is 120 
		  
		  Assgn 2
		  Table
		  
		  Enter any number
		  5
		  
		  5*1=5
		  5*2=10
		 */
		
		
		

	}

}
