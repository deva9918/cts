package methodcom;

class A1 {
	static final double pi = 3.14;

	void display() {
		System.out.println("class A1");
	}
}

class B1 extends A1 {
	@Override
	void display() {
		// TODO Auto-generated method stub
		super.display();
	}
}

public class FinalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A1.pi=4.5;// cannot assign constant
		System.out.println(A1.pi);
	}

}
