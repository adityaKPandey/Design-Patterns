package com.behavioral.strategy;

public class StrategyContext {

	private SelectionStrategy strategy;
	
	
	
	public void setStrategy(SelectionStrategy strategy) {
		this.strategy = strategy;
	}



	public SelectionStrategyOutput applyStrategy(SelectionStrategyInput strategyInput) {
		return strategy.select(strategyInput);
	}

}
