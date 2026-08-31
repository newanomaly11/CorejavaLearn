package secondweek;

import java.util.Scanner;

public class Assgn6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner God = new Scanner(System.in);
		
		String a = "aeiou";
		
		
	    System.out.println(" Enter any Characters: ");
	    String b=God.next();
	    
		for(int i=0 ; i<=a.length() ; i++)
		{
			
		if(b.equalsIgnoreCase(a))
		{
			System.out.println(" Vowels Detected ");
		}
		else 
		{
			System.out.println(" Vowels not detected ");
		}
	}
	
	}

}
