package com.cg.basicinheritance.seventh;

//base class is the the parent class
public abstract class Base1{
	public Base1(int i) {
		System.out.println("Base class");
	}
}

//sub class inherits from base class
//sub class has three constructors, each with different parameters
class Sub1 extends Base1 {
	int i,j;
	Sub1(){
		super(20);
		System.out.println("Default constructor of Sub class");
	}

	Sub1(int i) {
		super(i);
		this.i = i;
		System.out.println("one parameter constructor of Sub class with parameter " + i);
	}

	Sub1(int i, int j) {
		super(i);
		this.i = i;
		this.j = j;
		
		System.out.println("two parameter constructor of Sub class with parameters " + i + "," + j);
	}
}