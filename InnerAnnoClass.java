package inner;
interface Eatable
{
	void eat();
}
public class InnerAnnoClass {
public static void main(String []ar)
{
	Eatable e=new Eatable() {
		
		@Override
		public void eat() {
			// TODO Auto-generated method stub
			System.out.println("eat");
		}
	};
	e.eat();
}
}
