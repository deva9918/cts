package methodcom;

abstract class AbstractClass
{
	abstract void add(int a,int b);
	void show()
	{
		System.out.println("this is abstract class");
	}
	
}
abstract class AbstractImp extends AbstractClass
{
	void add(int a,int b)
	{
		System.out.println("hello");
	}
}
public class AbstractExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

}
