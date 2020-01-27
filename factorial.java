class factorial
{
	static int num;
	int fac(int id)
	{
		num=1;
		for( int i=1;i<=id;i++)
		{
		num=num*i;
		}
	return num;
	
	}


	public static void main(String ar[])
	{
	factorial f=new factorial();
	f.fac(4);
	System.out.println(num);
	}
}
