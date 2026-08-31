package Bank_Details;

import java.util.Scanner;

public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner God = new Scanner(System.in);
		
		//BANK BEAN
		Bankbean b = new Bankbean();
		
		System.out.println("Enter Bank ID:- ");
		b.setBankid(God.nextInt());
		
		System.out.println("Enter Bank Name:- ");
		b.setBankname(God.next());
		
		System.out.println("Enter Bank LOC:- ");
		b.setBankloc(God.nextDouble());
		
		System.out.println("Bank ID:- "+b.getBankid());
		System.out.println("Bank Name:- "+b.getBankname());
		System.out.println("Bank LOC:- "+b.getBankloc());
		
		
		//CUSTOMER BEAN
		CustomerBean c = new CustomerBean();
		
		System.out.println("\n Enter Customer ID:- ");
		c.setCustID(God.nextInt());
		
		System.out.println("Enter Customer Name:- ");
		c.setCustName(God.next());
		
		System.out.println("Enter Bank Balance:- ");
		c.setBank_bal(God.nextDouble());
		
		c.setBb(b);
		
		System.out.println("Customer ID:- "+c.getCustID());
		System.out.println("Customer Name:- "+c.getCustName());
		System.out.println("Bank Balance:- "+c.getBank_bal());
		System.out.println(c.getBb());
		
		
		// ACCOUNT BEAN
		AccountBean a = new AccountBean();
		
		System.out.println("\n Enter Account ID:- ");
		a.setAccID(God.nextInt());
		
		System.out.println("Enter Account Name:- ");
		a.setAccName(God.next());
		
		a.setBb(b);
		
		System.out.println("Account ID:- "+a.getAccID());
		System.out.println("Account Name:- "+a.getAccName());
		System.out.println(a.getBb());
		

	}

}
