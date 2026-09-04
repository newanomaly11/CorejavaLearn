package abstraction;

public class ChildClass extends Abs {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		setEmpid(1023);
		setEmpname("Alex");
		setEmpsal(102339);
		
		System.out.println("EMP ID:- "+getEmpid());
		System.out.println("EMP NAME:- "+getEmpname());
		System.out.println("EMP SALARY:- "+getEmpsal());
		
		
		
	}
	
	

}
