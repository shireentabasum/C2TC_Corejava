package com.cg.daythree;

public class ConstructorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id = 42;
		String name = "Yazhini";
		ConstructorMethod m = new ConstructorMethod(name,id);
		m.display();
		ConstructorMethod mv = new ConstructorMethod();
		mv.display();
	}

}
