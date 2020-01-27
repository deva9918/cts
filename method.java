class student
{
	int stdid;
	String stdname;
	String stdbran;
	double stdfee;
	void setstudent(int id,String name,String branch,double fees)
	{
		stdid=id;
		stdname=name;
		
		stdbran=branch;
		stdfee=fees;
		
	}
	void getstudent()
	{
		System.out.println("id="+stdid+"\nname="+stdname+"\nbranch="+stdbran+"\nfee="+stdfee);
	}
	public static void main(String ar[])
	{
		student a=new student();
		a.setstudent(10234,"Ajay","cse",234324.2343);
		a.getstudent();
	}
}