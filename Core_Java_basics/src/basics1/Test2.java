package basics1;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b;
		System.out.println("Enter two numbers = ");
		Scanner God = new Scanner(System.in);
		a = God.nextInt();
		b = God.nextInt();
		
		if(a>b)
		    System.out.println("Greatest value is = " + a);
		else 
			System.out.println("Greatest value is = " + b);
	}

}
