package inner;

public class stringExample {

	 String s=new String("ajay");
	 String s1=new String("krishna");
	 String s2=new String("ajay");
	 //static s3=new String("krish");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringExample a=new stringExample();
		System.out.println(a.s.charAt(2));
		System.out.println(a.s.codePointAt(3));
		System.out.println(a.s1.substring(3));
		System.out.println(a.s2.toLowerCase());
		System.out.println(a.s1.toString());
		System.out.println(a.s1.trim());
	}

}
