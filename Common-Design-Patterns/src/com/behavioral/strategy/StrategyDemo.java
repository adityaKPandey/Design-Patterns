package com.behavioral.strategy;

/*

https://howtodoinjava.com/design-patterns/behavioral/strategy-design-pattern/

*/

public class StrategyDemo {

	 

	public static void main(String[] args) {
		 StrategyContext strategyContext = new StrategyContext() ;
		 strategyContext.setStrategy(new ProductSelectionStrategy());
		 SelectionStrategyOutput productSelectionOutput = strategyContext.applyStrategy(new SelectionStrategyInput() {
		});
		 
		 strategyContext.setStrategy(new ModuleSelectionStrategy());
		 SelectionStrategyOutput moduleSelectionOutput  = strategyContext.applyStrategy(new SelectionStrategyInput() {
		});

	}

}
