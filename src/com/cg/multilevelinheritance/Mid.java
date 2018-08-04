package com.cg.multilevelinheritance;

//class with parameter which invokes the parent class
public class Mid extends Top {
	public Mid(int j) {
		super(j);
		System.out.println("Mid");
	}
}
