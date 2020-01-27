class A
{
    static sint count=0;
	A()
	{
	count++;
	}	
	public static void main(String ar[])
	{
		A a1=new A();
		A a2=new A();
		A a3=new A();
		System.out.println(count);
	}

	
}