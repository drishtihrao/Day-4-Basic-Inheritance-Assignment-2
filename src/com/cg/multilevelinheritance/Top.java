package com.cg.multilevelinheritance;

//parent node with a constructor with an integer parameter
public class Top {
	int topvar;

	public Top(int i) {
		this.topvar = i;
		System.out.println("Parent");
	}
}
