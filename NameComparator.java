package com;
import java.util.Comparator;
public class NameComparator implements Comparator {
public int compare(Object o1,Object o2)
{
	employeeEx e1=(employeeEx)o1;
	employeeEx e2=(employeeEx)o2;
	return e1.empName.compareTo(e2.empName);
}
}
