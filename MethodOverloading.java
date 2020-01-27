package methodcom;

class Addition
{
	int add(int a,int b)
	{
	return a+b;
	}
	double add(double a,int b)
	{
		return a+b;
	}
	double add(double a,double b)
	{
		return a+b;
	}
	double add(int a,double b)
	{
		return a+b;
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition a=new Addition();
		System.out.println(a.add(4, 5));
		System.out.println(a.add(10.0, 20));
		System.out.println(a.add(1.0, 20.0));
		System.out.println(a.add(4, 9.0));
		

	}

}