package com.cg.interfaceandinheritance;

public class Child extends Parent2 implements Parent1 {
	// Overriding interface method in parent1
	@Override
	public void display() {
		System.out.println("Overriding interface method");
	}

	// overriding draw function of parent2 class
	public void draw() {
		System.out.println("overriding draw function of parent2 class");
	}
}
