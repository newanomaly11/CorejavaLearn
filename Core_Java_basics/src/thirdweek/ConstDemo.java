package thirdweek;

public class ConstDemo {
	
	//Constructor name should be same as that of class name
	//Constructor does not have any return statement
	//We can create only one contructor in same class
	
	//Constructor has 2 types:-
	//1.Default Constructor
	//2.Parameterized Constructor
	
	
	//1.Default Constructor 
	
	ConstDemo()
	{
		int a=5,b=10;
		System.out.println("Addition "+(a+b));
	}

	public void sub()
	{
		int a=10,b=5;
		System.out.println("Sub is "+(a-b));
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstDemo c=new ConstDemo();
//      call            constructor call
		
		c.sub();
	}

}


 /*
  * ConstDemo(int a, int b)
	{
		
		System.out.println("Addition "+(a+b));
	}

	public void sub()
	{
		int a=10,b=5;
		System.out.println("Sub is "+(a-b));
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstDemo c=new ConstDemo(15,5);
//      call            constructor call
		
		c.sub();
	}
  */
  
