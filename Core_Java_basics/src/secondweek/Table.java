package secondweek;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		int num;
		System.out.println("Enter any number to print its table:  ");
		Scanner God = new Scanner(System.in);
		num = God.nextInt();
		for(i=1 ; i<=10 ; i++)
		{
			System.out.println(num + "*" + i + "=" + num*i);
		}
	}

}
