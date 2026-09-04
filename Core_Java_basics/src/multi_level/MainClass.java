package multi_level;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Student s = new Student();
		
		System.out.println("Enter College ID:- ");
		s.setColid(sc.nextInt());
		
		System.out.println("Enter College Name:- ");
		s.setCname(sc.next());
		
		System.out.println("Enter College Location:- ");
		s.setColloc(sc.next());
		
		System.out.println("Enter Department ID:- ");
		s.setDeptid(sc.nextInt());
		
		System.out.println("Enter Department Name:- ");
		s.setDeptname(sc.next());
		
		System.out.println("Enter Student ID:- ");
		s.setStudid(sc.nextInt());
		
		System.out.println("Enter Student Name:- ");
		s.setStudname(sc.next());
		
		System.out.println("College ID:- "+s.getColid());
		System.out.println("College Name:- "+s.getCname());
		System.out.println("College Location:- "+s.getColloc());
		
		System.out.println("Department ID:- "+s.getDeptid());
		System.out.println("Department Name:- "+s.getDeptname());
		
		System.out.println("Student ID:- "+s.getStudid());
		System.out.println("Student Name:- "+s.getStudname());

	}

}
