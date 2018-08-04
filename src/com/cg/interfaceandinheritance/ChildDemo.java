package com.cg.interfaceandinheritance;
/*
 * The child class inherits the method of Parent 2 class 
 * It can also access the method defined in Parent 1 interface
 */
public class ChildDemo {
	public static void main(String args[]) {
		Child child = new Child();
		child.display();
		child.draw();
	}
}
