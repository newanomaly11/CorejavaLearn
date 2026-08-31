package secondweek;

public class loopsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Loops are of 3 types:-
	    //1. While loop
		//2. Do While loop
		//3. For loop
		
		System.out.println("--WHILE LOOP---------");
		
		int a=1; //a=3
		
		while(a<=10) //11<=10
		{
			System.out.println(a); //10
			a++; //10+1=11
			
		}
		
		System.out.println("---DO WHILE LOOP-------");
		
		int b=1;
		
		do
		{
			System.out.println(b); //1000
			b++; //1000+1=1001
		}
		while(b<=10); //1001<=1000
		
		
		System.out.println("---FOR LOOP----");
		
		for(int i=10 ; i>=1 ; i--)
		{
			System.out.println(i); //3
		}
			

	}

}
