package institutebean;

import java.util.Scanner;

public class Branch extends Institute {

	@Override
	public void Inst_details() {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter INSTITUTE ID:- ");
		setInst_id(sc.nextInt());
		
		System.out.println("ENTER INSTITUTE NAME:- ");
		setInstname(sc.next());
		
		System.out.println("ENTER  INSTITUTE LOCATION:-  ");
		setInstloc(sc.next());
		
		System.out.println("INSTITUTE ID:- "+getInst_id());
		System.out.println("INSTITUTE NAME:- "+getInstname());
		System.out.println("INSTITUTE LOCATION:- "+getInstloc());
		
		
	}

}
