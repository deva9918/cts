package com;
class v
{
	
}
class MyThread extends v implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
		}
	}
	
}
public class ThreadRunnableExample {
public static void main(String[] args) {
	MyThread r=new MyThread();
	Thread t1=new Thread(r);
	t1.start();
}
}
