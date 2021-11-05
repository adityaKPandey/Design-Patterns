package com.coupling.loose;

public class LooseCoupling {

	public static void main(String[] args) {
		
		B b = new B();
		A a = new A(b);

		a.display();
	}

}
