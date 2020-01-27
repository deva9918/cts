package com;

public class EmployeeDetails {
	int empId;
	int empSalary;
	 String empName,empLocation;
		Address a;
	public EmployeeDetails(int empId, int empSalary, String empName, String empLocation, Address a) {
		super();
		this.empId = empId;
		this.empSalary = empSalary;
		this.empName = empName;
		this.empLocation = empLocation;
		this.a = a;
	}


	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpLocation() {
		return empLocation;
	}
	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}
	public Address getA() {
		return a;
	}
	public void setA(Address a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [empId=" + empId + ", empSalary=" + empSalary + ", empName=" + empName
				+ ", empLocation=" + empLocation + ", a=" + a + "]";
	}



		}

