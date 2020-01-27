package inner;

public class literals {
	static void add(int... values)
	{
		int sum=0;
		System.out.println("add method");
		for(int i:values)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
add(10,20,30);
add(10,20,30,45,89);
	}

}
