package inner;

public class LocalInnerClassExample {
	private int data = 30;// instance variable

	void display() {
		class Local {
			void msg() {
				System.out.println("i am hungry");
			}
		}
		Local l = new Local();
		l.msg();
	}

	public static void main(String args[]) {
		LocalInnerClassExample obj = new LocalInnerClassExample();
		obj.display();
	}
}
