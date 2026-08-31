package basics1;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		System.out.println("Enter your number:- ");
		Scanner God = new Scanner(System.in);
		a = God.nextInt();
		
		switch(a) //3
		{
		case 1:
			System.out.println("JAN");
			break;
		case 2:
			System.out.println("FEB");
			break;
		case 3:
			System.out.println("MARCH");
			break;
			
			default:
				System.out.println("Invalid Choice..");
				break;
		}
		
		/*
		 Assignment No.1
		 int a=6;
		 MONDAY
		 TUESDAY
		 WEDNESDAY
		 THURSDAY
		 FRIDAY
		 SATURDAY
		 SUNDAY
		 
		 */
		 

	}

}
