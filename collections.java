package com;
import java.util.*;
public class collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AbstractList< String> e=new ArrayList<String>();
e.add("ajay");
e.add("vijay");
e.add("deva");
e.add("shiva");
System.out.println(e);
ArrayList<String> e1=new  ArrayList<String>();
e1.add("d");
e1.add("e");
e1.add("f");
System.out.println(e1);
e.removeAll(e);
System.out.println(e);
System.out.println(e.isEmpty());
e1.clear();
System.out.println(e1);
	}

	public static void sort(ArrayList<EmployeeDetails1> a1) {
		// TODO Auto-generated method stub
		
	}

}
