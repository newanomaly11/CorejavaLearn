package basics1;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b;
		System.out.println("Enter two numbers = ");
		Scanner God = new Scanner(System.in);
		a = God.nextInt();
		b = God.nextInt();
		
		if(a==b)
		{
			System.out.println("Both are same");
		}
		else
		{
		
			if(a>b) {
				System.out.println("Greater number = " + a);
			}
			else {
				System.out.println("Greater number = " + b);
			}
		}
	}

}
