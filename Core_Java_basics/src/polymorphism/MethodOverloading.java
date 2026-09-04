package polymorphism;

public class MethodOverloading {
	
	//Same Multiple method names with different parameters are called Method Overloading
	
	public void Arithmetic_Operation(int a,int b)
	{
		System.out.println("Addition is: "+(a+b));
	}
	
	public void Arithmetic_Operation(double a, double b) 
	{
		System.out.println("Subtraction is: "+(a-b));
	}
	public void Arithmetic_Operation(float a, float b)
	{
		System.out.println("Mul is:- "+(a*b));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading m = new MethodOverloading();
		m.Arithmetic_Operation(12, 23);
		m.Arithmetic_Operation(23.4, 34.2);
		m.Arithmetic_Operation(2.3f, 3.4f);

	}

}
