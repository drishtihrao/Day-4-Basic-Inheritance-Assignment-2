package com.cg.basicinheritance.seventh;

//inheritance of parameterized class
//on creating object of the child class, the base class constructor is also invoked
class Sub1Test {
	public static void main(String args[]) {
		Sub1 s = new Sub1();
		Sub1 t = new Sub1(5, 7);
	}
}
