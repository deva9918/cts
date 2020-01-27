class cal
{
	int a=0,b=0;
       
	void add(int num1,int num2)
	{
		a=num1;
		b=num2;
		System.out.println("adding 2 numbers="+(a+b));
	}
	void sub(int num1,int num2)
	{
		a=num1;
		b=num2;
		System.out.println("sub of 2 numbwers="+(a-b));
	}
	void mul(int num1,int num2)
	{
		a=num1;
		b=num2;
		System.out.println("mul of 2 num="+(a*b));
	}
	void div(int num1,void num2)
	{
		a=num1;
		b=num2;
		System.out.println("div of 2 num ="+(a/b));
	}
	public static void main(String arg[])
	{
		cal c=new cal();
		int ch;
		System.out.println("enter the 2 numbers");
		Scanner s=new Scanner(System.in);
		l=s.nextInt();
		m=s.nextInt();
		System.out.println("1.adding");
		System.out.println("2.substraction");
		System.out.println("3.multiplication");
		System.out.println("4division");
		System.out.println("enter the number");
		ch=s.nextInt();
		switch(ch)
			{
				case 1:add(l,m);
					break;
				case 2:sub(l,m);
					break;
				case 3:mul(l,m);
					break;
				case 4:div(l,m);
					break;
				default:System.out.println("enter anothr number");
					break;
			}
	}
}


	
		



