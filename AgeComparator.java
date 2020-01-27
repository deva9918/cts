package com;
import java.util.*;
public class AgeComparator implements Comparator{
public int compare(Object o1,Object o2)
{
	employeeEx e1=(employeeEx)o1;
	employeeEx e2=(employeeEx)o2;
	if(e1.age==e2.age)
		return 0;
	else if(e1.age>e2.age)
		return 1;
	else 
		return -1;
	}
}
