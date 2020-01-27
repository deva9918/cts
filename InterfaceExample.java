package methodcom;

class AirAutomobile implements fly 
{
	double speed=100;
	String modelNo;
	void setmodelNo(String modelNo)
	{
		this.modelNo=modelNo;
	}
	String show()
	{
		return modelNo;
	}
	@Override
	public int fly(int a) {
		// TODO Auto-generated method stub
		return a;
	}
}
interface fly
{
	int maxspeed=100;
	int fly(int a);
}
public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AirAutomobile a=new AirAutomobile();
		a.setmodelNo("ajaybus100");
		System.out.println("name of airmobile="+a.show());
		System.out.println("flying with speed="+a.fly(90));
		System.out.println("max speed of airmobile is="+fly.maxspeed);
	}

}
