package com;

public class employeeMain  {

	public static void main(String[] args) {
		wageEmployee e=new wageEmployee(101, 12000, "ajay", "chennai",new Address(507, "near arich", 1), 1000, 10);
		System.out.println(e.calculateSalary());
		System.out.println(e);
		//EmployeeDetails w=new EmployeeDetails(101, 5000, "ajay", "chennai");
		//System.out.println(w);
		// TODO Auto-generated method stub

	}

}
