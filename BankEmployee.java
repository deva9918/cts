import java.util.*;
class BankEmployee
{
	int empId;
	String empName;
	int empSalary;
	BankEmployee()
	{
	
	System.out.println("id="+empId+"\nname="+empName+"\nsalary="+empSalary);
	}
	public BankEmployee(int empId,String empName,int empSalary)
	{
		this.empId=empId;
		this.empName=empName;
		this.empSalary=empSalary;	
		System.out.println("id="+empId+"\nname="+empName+"\nsalary="+empSalary);
	}
	/* void setEmployee(int id,String name,int salary)
	{
		this.empId=empId;
		this.empName=empName;
		this.empSalary=empSalary;	
	}
	void getEmployee()

	{
		System.out.println("id="+empId+"\nname="+empName+"\nsalary="+empSalary);
	}*/
}
