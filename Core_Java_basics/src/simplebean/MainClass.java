package simplebean;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//POM - PAGE OBJECT MODEL
		
		Empbean emp = new Empbean();
		emp.setEmpid(101);
		emp.setEmpname("Alex");
		emp.setEmpsal(6737.45);
		
		
		System.out.println("EMP ID:- "+emp.getEmpid());
		System.out.println("EMP NAME:- "+emp.getEmpname());
		System.out.println("EMP SALARY:- "+emp.getEmpsal());

	}

}
