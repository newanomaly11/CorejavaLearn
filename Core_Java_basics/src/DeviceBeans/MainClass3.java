package DeviceBeans;

import java.util.Scanner;

import Student_details.StudBean;

public class MainClass3 {
	
    Scanner sc = new Scanner(System.in);
    
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner God = new Scanner(System.in);

		DeviceDetails dev = new DeviceDetails();
		
		System.out.println("Enter Device ID :- ");
		dev.setDeviceID(God.nextInt());
		
		System.out.println("Enter Device name:- ");
		dev.setDeviceName(God.next());
		
		System.out.println("Enter Device OS:- ");
		dev.setDeviceOS(God.next());
		
		System.out.println("Enter Kernel Version:- ");
		dev.setKernelVersion(God.nextDouble());
		
		System.out.println("Enter Manufacturing date:- ");
		dev.setManfDate(God.next());
		
		System.out.println("Enter IMET Code:- ");
		dev.setIMETcode(God.nextInt());
		
		System.out.println("Enter RAM Details:- ");
		dev.setRAMdet(God.next());
		
		System.out.println("Enter Device Type:- ");
		dev.setDeviceType(God.next());
		
		System.out.println("Enter Password:- ");
		dev.setPassword(God.next());
		
		System.out.println("Confirm Password:- ");
		dev.setConfirm_password(God.next());
		
		if(dev.getPassword().equals(dev.getConfirm_password()))
		{
			System.out.println("Device ID:- "+dev.getDeviceID());
			System.out.println("Device name is:- "+dev.getDeviceName());
			System.out.println("Device OS is:- "+dev.getDeviceOS());
			System.out.println("Kernel Version is:- "+dev.getKernelVersion());
			System.out.println("Manufacturing date is:- "+dev.getManfDate());
			System.out.println("IMT Code is:- "+dev.getIMETcode());
			System.out.println("RAM Details :- "+dev.getRAMdet());
			System.out.println("Device Type :- "+dev.getDeviceType());
			
		}
		else {
			System.err.println("Password entered is incorrect");
		}
	

	}

}
