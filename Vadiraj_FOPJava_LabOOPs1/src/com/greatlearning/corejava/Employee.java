package com.greatlearning.corejava;
public class Employee {
	private String fName;
	private String lName;
	private String department;

	public Employee(String fName,String lName)
	{
		this.setfName(fName);
		this.setlName(lName);
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}


}
