package com.coupling.tight;

public class TightCoupling {

	
	public static void main(String[] args) {
		
		A a = new A();
		
		//tight coupling - which object A points to 
		a.display();
		

	}

}
