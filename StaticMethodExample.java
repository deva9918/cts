class StaticMethodExample
{
	static int num;//static variable
	int c;//non static variable and instance variable
	void setNum(int a)//non static
	{
	num=a;
	System.out.println(num);
	}
	static void setStatic(int a)//static
	{
	num=a;
	System.out.println(num);
	}
	public static void main(String ar[])
	{
	StaticMethodExample s=new StaticMethodExample();
	s.setNum(10);
	setStatic(20);
	}
}
	