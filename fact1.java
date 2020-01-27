class fact1
{
	static int num;
	public static void main(String ar[])
	{
		fact1 f=new fact1();
		f.factorial(5);
		System.out.println(num);
	}
	public static int factorial(int id)
		{
			if(id>0)
			{
				return num=id*factorial(id-1);
			}	
			else
			return 1;
		}
}
