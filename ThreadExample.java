package p;

class MyThread extends Thread
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i=0;i<=10;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}
public class ThreadExample {
public static void main(String[] args) {
	//int getPriority=0;
	MyThread t1=new MyThread();
	t1.start();
	
	
	
	
}
}
