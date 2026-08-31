package thirdweek;

public class Methodsdemo {
	
	
	
	//Method should always be created inside the class and outside the main method
	//Methods have 4 types:-
	//1.BASIC METHOD --OR-- NON STATIC METHOD
	//2.METHOD WITH PARAMETERS
	//3.METHOD WITHOUT VOID 
	//4.STATIC METHOD
	
	//1.BASIC METHOD
	public void Add()  //public - access modifier, void - does not return value, Add() - method name
	{
		//body of the method
		int a=5,b=10;
		System.out.println("Addition "+(a+b));
	}
	
	public void Sub()
	{
		int c=4,d=5;
		System.out.println("Subtraction "+(c-d));
	}
	
	
	//2.METHOD WITH PARAMETERS
	public void sub(int a, int b, int c)
	{
		System.out.println("Ans is "+(a-b-c));
	}
	
	//3.METHOD WITH VOID (WE USE A DATA TYPE)
	public int mul()
	{
		return 5*4;  
	}
	
	

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Methodsdemo m = new Methodsdemo();
		//call              execute
		
		m.Add();
		m.Sub();
		m.sub(5,3,2);
		System.out.println("Mul is:- "+m.mul());

	}

}
