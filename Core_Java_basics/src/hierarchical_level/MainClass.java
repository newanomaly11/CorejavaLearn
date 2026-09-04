package hierarchical_level;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Dept d = new Dept();
		Student s = new Student();
		
		System.out.println("Enter College ID:- ");
		d.setColid(sc.nextInt());
		
		System.out.println("Enter College Name:- ");
		d.setCname(sc.next());
		
		System.out.println("Enter Department ID:- ");
		d.setDeptid(sc.nextInt());
		
		System.out.println("Enter Department Name:- ");
		d.setDeptname(sc.next());
		
		System.out.println("Enter Student ID:- ");
		s.setStudid(sc.nextInt());
		
		System.out.println("Enter Student Name:- ");
		s.setStudname(sc.next());
		
		System.out.println("College ID:- "+d.getColid());
		System.out.println("College Name:- "+d.getCname());
		
		System.out.println("Department ID:- "+d.getDeptid());
		System.out.println("Department Name:- "+d.getDeptname());
		
		System.out.println("Student ID:- "+s.getStudid());
		System.out.println("Student Name:- "+s.getStudname());

	}

}
