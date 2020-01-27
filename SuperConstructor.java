package com;
class A extends Object
{
	A(int a,int b,int c)
	{
		
		System.out.println("A()");
	}
	
}
class B extends A
{
	B(int a,int b,int c,int d)
	{
	super(a,b,c);
		System.out.println("B()");
	}


	
}
public class SuperConstructor {

	public static void main(String ar[]) {
		//A a=new A();
		B b=new B(10,20,30,40);
		System.out.println(b.getClass());
		System.out.println(b.hashCode());
	}
}
