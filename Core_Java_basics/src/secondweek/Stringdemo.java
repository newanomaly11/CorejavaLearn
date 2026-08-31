package secondweek;

import java.util.Scanner;

public class Stringdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner God = new Scanner(System.in);
		//String is non primitive data type
		//max length is 2'32-2
		
		
		String a = "have a good day";
		String b = "Have a Good Day";
		
		//string is char array
		
				for(int i=0 ; i<a.length(); i++)
				{
					System.out.println("Position "+i+" Value "+a.charAt(i));
				}
				
				//charAt() is predefined method of string 
				//it is used to print string value of position wise
				
		if(a.equals(b))
		{
			System.out.println("Match Found");
		}
		else
		{
			System.out.println("Match Not Found..");
		}
		
		if(a.equalsIgnoreCase(b))
		{
			System.out.println("Match Found");
		}
		else
		{
			System.out.println("Match Not Found..");
		}
		
		System.out.println("Enter your name:-  ");
        String n=God.next();
        //next() is predefined method of Scanner Class 
        //it is used to store only first single word inside the variable
        
        //nextLine() is predefined method of scanner class
        //it is used to store multiple words and paragraph inside the variable 
        
        
        
        System.out.println("Welcome "+n);
        
        
        
        String str="Job placement at Mumbai";
        
        System.out.println(str.replace("Mumbai","Pune"));
        
        
        //trim is predefined method of string
        //it is used to remove extra space given at the start from the string
        String str1="            Core Java with Automation";
        System.out.println(str1);
        System.out.println(str1.trim());
        
        
        /*
         * Assgn 5:- Pin Verify
         * 
         * Enter your pin number
         * 234
         * Pin is invalid please try again
         * 456
         * Pin is invalid please try again
         * Your Acc is blocked
         * 
         * Assgn 6 -
         * Vowels Detect:- a,e,i,o,u 
         * 
         * Enter any characters 
         * Pen
         * Vowels not detected
         */
        
       
        
	}

}
