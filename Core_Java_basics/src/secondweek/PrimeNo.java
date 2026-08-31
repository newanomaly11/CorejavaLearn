package secondweek;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Number which is divisible by itself 
		//2,,3,5,7,11,13
		System.out.println("Enter your number:- ");
		Scanner God=new Scanner(System.in);
		int a = God.nextInt();
		
		
		boolean flag=false;
		//      i=3   3<=7
		for(int i=2 ; i<=a/2 ; i++ )
		{
			// 2==0
			if(a%i==0)
			{
				flag=true;
			}
		}
		// true==false
		if(flag==false)
		{
			System.out.println(a+" is prime number");
		}
		else
		{
			System.out.println(a+" is not prime number");
		}

	}

}
