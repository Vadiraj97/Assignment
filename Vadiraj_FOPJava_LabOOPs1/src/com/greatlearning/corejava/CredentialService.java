package com.greatlearning.corejava;

import java.util.Random;

public class CredentialService extends Employee
{
	private char[] password;
	private String eMail;
	
	
	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	
	public CredentialService(String fName, String lName) {
		super(fName, lName);
	}
	

	public void generatePassword() 
	{
		  Random random = new Random();
	      String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	      String lowerCase = "abcdefghijklmnopqrstuvwxyz";
	      String specialCharacters = "_%*&!@#$";
	      String numbers = "1234567890";
	      String combinedChars = upperCase + lowerCase + specialCharacters + numbers;
	      
	      char[] password = new char[9];
	      

	      password[0] = lowerCase.charAt(random.nextInt(lowerCase.length()));
	      password[1] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
	      password[2] = upperCase.charAt(random.nextInt(upperCase.length()));
	      password[3] = numbers.charAt(random.nextInt(numbers.length()));;
	   
	      for(int i = 4; i< 9 ; i++) {
	         password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
	      }
	      this.setPassword(password);
	     
	     
	}

	public void generateEmailAddress(String choice)
	{
		 this.seteMail(super.getfName()+super.getlName()+"@"+ (String)choice+".GreatLearning.com");
	}

	public void showCredentials()
	{
		System.out.println("Email ->"+this.geteMail());
		System.out.print("Password ->");
		System.out.print(this.getPassword());
	}

	public char[] getPassword() {
		return this.password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}
	
}
