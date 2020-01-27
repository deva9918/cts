package com;

public class wageEmployee extends EmployeeDetails
{
	int number,hours;
	@Override
	public String toString() {
		return "wageEmployee [number=" + number + ", hours=" + hours + ", a=" + a + ", empId=" + empId + ", empSalary="
				+ empSalary + ", empName=" + empName + ", empLocation=" + empLocation + "]";
	}

	public wageEmployee(int empId, int empSalary, String empName, String empLocation, Address a, int number, int hours) {
		super(empId, empSalary, empName, empLocation, a);
		this.number = number;
		this.hours = hours;
		
	}
	

public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}



	int calculateSalary()
	{
		return empSalary*hours*number;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
