package com.structural.decorator;

public class MandatoryFilterQuery implements FilterQuery {

	@Override
	public String createFilterQuery() {
		 
		return "\n Group ID , " + "Cycle ID , " + "Review ID , " ;
	}

}
