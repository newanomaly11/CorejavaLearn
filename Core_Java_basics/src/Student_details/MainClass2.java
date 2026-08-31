package Student_details;

import java.util.Scanner;

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner God = new Scanner(System.in);

		StudBean stud = new StudBean();
		
		System.out.println("Enter Student rollno:- ");
		stud.setStudrollno(God.nextInt());
		
		System.out.println("Enter Student name:- ");
		stud.setStudname(God.next());
		
		System.out.println("Enter Student fees:- ");
		stud.setStudfees(God.nextDouble());
	
		System.out.println("Student rollno is:- "+stud.getStudrollno());
		System.out.println("Student name is:- "+stud.getStudname());
		System.out.println("Student fees is:- "+stud.getStudfees());

		
		/*
		 * DeviceBean:- devicedetails
		 * 
		 * deviceID
		 * deviceName
		 * deviceOS
		 * kernelVersion
		 * Manf_Date
		 * IMET_Code
		 * RAM_Details
		 * DeviceType
		 * password
		 * confirm password
		 * 
		 */
	}

}


