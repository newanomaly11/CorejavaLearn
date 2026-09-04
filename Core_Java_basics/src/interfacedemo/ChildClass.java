package interfacedemo;

public class ChildClass implements Inter1, Inter2 {

	@Override
	public void mul(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Mul is:- "+(a*b));
		
	}

	@Override
	public void div(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Div is:- "+(a/b));		
	}

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Add is:- "+(a+b));	
	}

	@Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Sub is :- "+(a-b));
	}
	
	

}
