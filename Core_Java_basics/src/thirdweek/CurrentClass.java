package thirdweek;

import java.util.Scanner;

public class CurrentClass {
	
	//Variables are of 3 types:-
	//1.Global Variables or Instance Variable :- Variables which are declared outside the method
	//                      but inside the class are called as Global variables
	
	/* 2. Local Variables:- Variables which are declared inside the method but not inside the 
	 *                   static method are called as Local Variable.
	 *                   
	 *  3. Static Variable:- Variables which are declared with static keyword or declared
	 *                       inside the static methods or declared inside the main method
	 *                       are called as Static Variable.
	 * 
	 */
	
	//Current Class is a class where we actual implement the program
	//Sub Class is class where we only call those programs with main method
	
	//Global Variables
	int empid;
	String empname;
	double empsal;
	
	
	public void setEmpDetails()
	{
		Scanner God = new Scanner(System.in);
		
		System.out.println("ENTER EMP ID:-  ");
		empid = God.nextInt();
		
		System.out.println("ENTER EMP NAME:-  ");
		empname = God.next();
		
		System.out.println("ENTER EMP SALARY:-  ");
		empsal = God.nextDouble();		
		
	}
	
	public void getEmpDetails()
	{
		System.out.println("EMP ID:- "+empid);
		System.out.println("EMP NAME:- "+empname);
		System.out.println("EMP SALARY:- "+empsal);
	}

}
