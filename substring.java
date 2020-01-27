package com;

import java.util.*;

public class substring {
	public static void main(String[] ar) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter the pan number");
		String p = s.nextLine();
		char[] ch = p.toCharArray();
		// System.out.println(ch);
		int count = 0, count1 = 0, count3 = 0;
		if (p.length() == 10) {
			String a = p.substring(0, 5);
			// ABCDEESystem.out.println(a);
			char[] ch1 = a.toCharArray();

			for (int i = 0; i <= 4; i++) {
				if ((int) ch1[i] >= 65 && (int) ch1[i] <= 90) {
					count++;
				}
			}
			if (count == 5) {
				System.out.println(a);
			}
			String b = p.substring(5, 9);
			System.out.println(b);
			char[] ch2 = b.toCharArray();
			for (int j = 0; j <= 3; j++) {

				if (((int) ch2[j] >= 0) && ((int) ch2[j] <= 9)) {
					count1++;
				}
			}
			if (count1 == 4) {
				System.out.println(b);
			}
			char ch4 = p.charAt(9);
			// System.out.println("ajay"+ch4);
			if ((int) ch4 >= 65 && (int) ch4 <= 90) {
				count3=1;
			}
			System.out.println(ch4);
			/*
			 * String c = p.substring(9, 10); System.out.println(c); char[] ch3 =
			 * c.toCharArray(); for (int k = 0; k < 1; k++) { if ((int) ch3[k] >= 65 &&
			 * (int) ch3[k] <= 90) { count3++; } }
			 */
			// System.out.println(count3);
			
			
			
			  if (count == 5) { if (count1 == 4) { if (count3 == 1) {
			  System.out.println("valid"); } else System.out.println("not"); } }
			 
		}
		

	}
}
