package com.cg.multilevelinheritance;

//leaf node which is inherited from class Mid
public class Leaf extends Mid {
	public Leaf(int j) {
		super(j);
		System.out.println("Leaf");
	}
}
