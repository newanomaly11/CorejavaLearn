package secondweek;

import java.util.Arrays;
import java.util.Scanner;

public class Arraysdemo {

	public static void main(String[] args) {
		
		Scanner God=new Scanner(System.in);
		
		
		//Arrays is collection of multiple elements
		//        0,1,2,3,4,
		int a[]= {12,3,4,5,6,78,8,9};
		
		System.out.println("Length is:- "+a.length + "\n");
		//length is predefined function used to count total number of values
		//      i=2  2<11
		for(int i=0; i<a.length; i++)
		{
			System.out.println("Position "+i+ "  Value "+ a[i]);
		}
		
		
		
		//with the user input
		
		System.out.println("\n Enter the length");
		int h=God.nextInt();
		
		int b[]=new int[h];
				
				System.out.println("\n Enter any " +h+ "  values:- ");
		//b[0]=God.nextInt();
		//b[1]=God.nextInt();
		
		
		for(int i=0; i<b.length; i++)
		{
			b[i]=God.nextInt();			
		}
		
		System.out.println(Arrays.toString(b));
		//Arrays is pre-defined class from java.util package
		//toString is predefined method of Arrays
		//it is used to print all the array values together
		//it is also to prevent garbage value

	}

}


/* 
 * Assgn No. 3 
 * a[]={15,67,34,98,101,200}
 * Find Maximum value from array
 * 
 * 
 * Assgn No. 4 (using loop, without arrays)
 * 1 is Odd number 
 * 2 is Even number 
 * 3 is Odd number
 * .
 * .
 * .
 * 10 is Even number
 */
 
