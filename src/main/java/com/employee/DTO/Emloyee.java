package com.employee.DTO;


public class Emloyee {
	
	private int empId;
	
	private String employeeName;
	
	private String address;
	
	public Emloyee() {
		System.out.println("Employeee Constructor called");
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
