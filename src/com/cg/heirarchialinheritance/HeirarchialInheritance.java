package com.cg.heirarchialinheritance;

public class HeirarchialInheritance {
	public static void main(String[] args) {
		N n = new N(); // Demonstrating inheritance
		O o = new O();
	}
}
//Parent class with no-arg constructor
class M { 
	M() {
		System.out.println("In class M");
	}
}

//Child of class M with no-arg constructor
class N extends M { 
	N() {
		System.out.println("In class N");
	}
}

//Child of class M with no-arg constructor
class O extends M { 
	O() {
		System.out.println("In class O");
	}
}
