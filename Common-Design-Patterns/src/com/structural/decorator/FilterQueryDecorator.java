package com.structural.decorator;

public abstract class FilterQueryDecorator implements FilterQuery {

	protected FilterQuery filterQuery ;
	
	
	
	public FilterQueryDecorator(FilterQuery filterQuery) {
		super();
		this.filterQuery = filterQuery;
	}



	@Override
	public String createFilterQuery() {
		 
		return filterQuery.createFilterQuery();
	}

}
