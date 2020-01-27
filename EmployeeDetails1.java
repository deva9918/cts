package com;
import java.lang.*;
import java.util.ArrayList;
import java.lang.Object;

public class EmployeeDetails1 implements Comparable<EmployeeDetails1> {
	int empId;
	static int empSalary;
	 String empName,empLocation;
	
	public EmployeeDetails1(int empId, int empSalary, String empName, String empLocation) {
		super();
		this.empId = empId;
		this.empSalary = empSalary;
		this.empName = empName;
		this.empLocation = empLocation;
		
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

	@Override
	public String toString() {
		return "EmployeeDetails [empId=" + empId + ", empSalary=" + empSalary + ", empName=" + empName
				+ ", empLocation=" + empLocation + "]";
	}
/*	public int compareTo(EmployeeDetails1 emp)
	{
		return empLocation.compareTo(emp.empLocation);
	}*/
	public int compareTo(EmployeeDetails1 e1)
	{
		return this.empId-e1.empId;
	}
public static void main(String ar[])
{
	ArrayList<EmployeeDetails1> a1=new ArrayList<EmployeeDetails1>();
	a1.add(new EmployeeDetails1(1,123,"ajay","hyderabad"));
	a1.add(new EmployeeDetails1(3, 456, "vijay", "ban"));
	a1.add(new EmployeeDetails1(2, 234, "deva", "chennai"));
	
	collections.sort(a1);
	/*for(EmployeeDetails1 e1:a1)
	{
		
	}*/
	//retrun empLocation.compareTo(EmployeeDetails1.empLocation);
	for(EmployeeDetails1 e1:a1)
	{
		System.out.println(e1.empLocation);
	}
	collections.sort(a1);
	
	
	
	
	
}


		}

