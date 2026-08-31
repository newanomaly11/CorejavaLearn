package secondweek;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num;
		System.out.println("Enter any number for factorial:  ");
		Scanner God = new Scanner(System.in);
		num = God.nextInt();
		
		int fact=1;
		for(int i=num ; i>=1 ; i--) {
			fact = fact*i;
		}
		
			System.out.println("Factorial of  " + num + "!" + "  is:  " + fact );
		
	}

}
