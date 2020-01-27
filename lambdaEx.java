package com;

import java.util.ArrayList;

interface Drawable {
	public void draw();
}

interface Sayable {
	public String say();

}

interface Sayable2 {
	public String say(String name);
}

interface Addable {
	int add(int a, int b);
}

public class lambdaEx {

	public static void main(String[] args) {
		int width = 10;
		// without lambda, Drawable implementation using anonymous class
		Drawable d = new Drawable() {
			public void draw() {
				System.out.println("Drawing " + width);
			}
		};
		d.draw();
		Sayable s = () -> {
			return "hello";
		};
		System.out.println(s.say());
		Sayable2 s1 = (name) -> {
			return "hello" + name;
		};
		System.out.println(s1.say("Ajay"));
		//
		Addable p = (a, b) -> (a + b);
		System.out.println(p.add(3, 4));
		Addable p1=(a,b)->{
			return a+b;
		};
		System.out.println(p1.add(7, 18));
		//
		List<String> l=new ArrayList<String>();
		
	}
}
