package com;

public class recmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
rectangle r=new rectangle(1,"rectangle", 2, 4);
System.out.println(r.area());
System.out.println(r);
circle c=new circle(2, "circle", 2);
System.out.println(c.area());
System.out.println(c);

square s=new square(3, "square", 4);
System.out.println(s.area());
System.out.println(s);

	}

}
