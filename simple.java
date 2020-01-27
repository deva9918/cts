package com;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();  
		al.add(new employeeEx(101,"Vijay",23));  
		al.add(new employeeEx(106,"Ajay",27));  
		al.add(new employeeEx(105,"Jai",21));  
		  
		System.out.println("Sorting by Name");  
		Collections.sort(al,new NameComparator());  
		Iterator itr=al.iterator();  
		while(itr.hasNext()){  
		employeeEx st=(employeeEx)itr.next();  
		System.out.println(st.empId+" "+st.empName+" "+st.age);
		}
		System.out.println("Sorting by age");  
		  
		Collections.sort(al,new AgeComparator());  
		Iterator itr2=al.iterator();  
		while(itr2.hasNext()){  
		employeeEx st2=(employeeEx)itr2.next();  
		System.out.println(st2.empId+" "+st2.empName+" "+st2.age);  
		}  
	}

}

