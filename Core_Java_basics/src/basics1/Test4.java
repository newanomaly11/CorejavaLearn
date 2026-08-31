package basics1;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		//for loop program
		
		int i;
		int num;
		System.out.println("Enter a number to print its table");
		Scanner God = new Scanner (System.in);
		num = God.nextInt();
		for( i=1; i<=10 ; i++)
		{
			System.out.println(num + "*" + i +  "=" + num*i);    //(num + "*" +  "=" + num*i); 
		}
			
    }
}
