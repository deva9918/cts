package inner;

import java.util.*;

public class number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int n = s.nextInt();
		int sum = 0, p,count=0;
		int z=n;
		
		
		while (z > 9) {
			sum=0;
			int r=z;
			while (r > 0) {
				p = r % 10;
				sum = sum + p;
				r = r / 10;
			
			}
			count++;
			z = sum;
			System.out.println(z);

		}
		System.out.println("count="+count);
		System.out.println("answer="+z);
	}
}
