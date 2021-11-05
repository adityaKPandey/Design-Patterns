package com.structural.decorator;

public class BusinessFilterQuery extends FilterQueryDecorator {

	protected FilterQuery query ;
	
	
	public BusinessFilterQuery(FilterQuery query) {
		super(query);
		this.query = query;
	}


	@Override
	public String createFilterQuery() {
		 
		return query.createFilterQuery() + addBusinessCriteria();
		
	}


	private String addBusinessCriteria() {
		// TODO Auto-generated method stub
		return "\n GCB or ICG ";
	}
	
	

}
