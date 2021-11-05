package com.behavioral.strategy;

public class ModuleSelectionStrategy implements SelectionStrategy {

	 

	@Override
	public SelectionStrategyOutput select(SelectionStrategyInput input) {
		
		System.out.println("Applied strategy of ModuleSelection");
		
		return new SelectionStrategyOutput() {
			 
		};
	}

}
