class StaticBlock
	{
	static int a;
	static 
	{
	a=10;
	System.out.println("static block"+a);
	}
	 static void setA()
	{
	a=56;
	System.out.println("static method"+a);
	}
	public static void main(String ar[])
	{
	System.out.println("AREY AMITH EVADRA VAADU");
	setA();
	}
}