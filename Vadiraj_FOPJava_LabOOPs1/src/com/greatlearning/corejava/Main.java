package com.greatlearning.corejava;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your First Name:");
		String fName = scanner.next();
		System.out.println("Enter your Last Name:");
		String lName = scanner.next();
		CredentialService e = new CredentialService(fName,lName);
		System.out.println("Please enter the department from the following:");
		System.out.println("1. Techical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		int choice = scanner.nextInt();
		switch(choice) {
			case 1 :
				e.setDepartment("tech");
				e.generateEmailAddress(e.getDepartment());
				e.generatePassword();
				System.out.println("Dear "+e.getfName()+", your generated credentials are as follows");
				e.showCredentials();
			break;
			case 2 : 
				e.setDepartment("adm");
				e.generateEmailAddress(e.getDepartment());
				e.generatePassword();
				System.out.println("Dear "+e.getfName()+", your generated credentials are as follows");
				e.showCredentials();
			break;
			case 3 : 
				e.setDepartment("hr");
				e.generateEmailAddress(e.getDepartment());
				e.generatePassword();
				System.out.println("Dear "+e.getfName()+", your generated credentials are as follows");
				e.showCredentials();
			break;
			case 4: 
				e.setDepartment("lgl");
				e.generateEmailAddress(e.getDepartment());
				e.generatePassword();
				System.out.println("Dear "+e.getfName()+", your generated credentials are as follows");
				e.showCredentials();
			break;
			default:
				System.out.println("Invalid Department!");
		}
		
		scanner.close();


	}

}
