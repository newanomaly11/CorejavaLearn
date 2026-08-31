package beanwithotherbean;

import java.util.Scanner;

public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		PersonBean p = new PersonBean();
		
		System.out.println("Enter Person ID:- ");
		p.setPid(sc.nextInt());
		
		System.out.println("Enter Person name");
		p.setPname(sc.next());
		
		System.out.println("Person ID:- "+p.getPid());
		System.out.println("Person Name:- "+p.getPname());
		
		ProfBean pr = new ProfBean();
		
		System.out.println("Enter Prof ID:- ");
		pr.setProfid(sc.nextInt());
		
		System.out.println("Enter Prof Name:- ");
		pr.setProfname(sc.next());
		pr.setPb(p);
		//p is object of PersonBean
		
		System.out.println("Prof ID:- "+pr.getProfid());
		System.out.println("Prof Name:- "+pr.getProfname());
		System.out.println(pr.getPb());
		
	}
	/* 
	 * ASSGN 1 
	 * 
	 * BankBean
	 * bankID
	 * bankName
	 * bankLOC
	 * 
	 * AccountBean:- BankBean should be declared as variable
	 * AccID
	 * AccName
	 * 
	 * CustomerBean:- BankBean should be declared as variable
	 * CustID
	 * CustName
	 * Bank_bal
	 * 
	 */

}
