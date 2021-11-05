package com.coupling.loose;

public class A {

	Show show;
	
	public A(Show show) {
		// TODO Auto-generated constructor stub
		this.show = show;
	}
	
	public void display() {
		System.out.println("A");
		show.display();
	}
	
	

}
