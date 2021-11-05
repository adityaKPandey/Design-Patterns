package com.behavioral.strategy;

public class ProductSelectionStrategy implements SelectionStrategy {

	
	@Override
	public SelectionStrategyOutput select(SelectionStrategyInput input) {
		
		System.out.println("Applied strategy of ProductSelection");
		return new SelectionStrategyOutput() {
		};
		
	}

}
