package com.cg.polymorphism;

//basic inheritance - function overridding
class Top1 {
	void disp1() {
		System.out.println("Display of top1");
	}
}

//deriving leaf classes from Top1
class Bottom1 extends Top1 {
	void disp1() {
		System.out.println("Display of class Bottom1");
	}
}

class Bottom2 extends Top1 {
	void disp1() {
		System.out.println("Display of class Bottom2");
	}
}

class Bottom3 extends Top1 {
	void disp1() {
		System.out.println("Display of class Bottom3");
	}
}

//the display method displays as per methods of different leaf nodes as per initialization; 
public class Top1Test {
	public static void main(String args[]) {
		Top1 bt = new Bottom1();
		bt.disp1();
		bt = new Bottom2();
		bt.disp1();
		bt = new Bottom3();
		bt.disp1();
	}
}
