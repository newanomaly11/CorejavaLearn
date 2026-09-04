package abstraction;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClass c = new ChildClass();
		
		c.display();
		
		//For user input, we have to create Scanner in Child Class, where we are creating a method.
		
		//Parent Class - ABSTRACT METHOD IS DEFINED
		
		//CHILD CLASS - CREATING THE METHOD (NOT WITH ABSTRACT KEYWORD BECAUSE ABSTRACT KEYWORD IS 
		//DEINED ONLY IN PARENT CLASS)
		
		//MAIN CLASS - METHOD IS CALL

	}

}
