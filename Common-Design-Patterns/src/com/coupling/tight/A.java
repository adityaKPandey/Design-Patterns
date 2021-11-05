package com.coupling.tight;

public class A {

	B b;
	
	public A() {
		// TODO Auto-generated constructor stub
		b = new B();
	}
	
	public void display() {
		System.out.println("A");
		b.display();
	}
	
	

}
