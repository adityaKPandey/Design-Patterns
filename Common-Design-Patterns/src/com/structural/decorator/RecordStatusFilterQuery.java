package com.structural.decorator;

public class RecordStatusFilterQuery extends FilterQueryDecorator {

	protected FilterQuery filterQuery;
	
	
	
	public RecordStatusFilterQuery(FilterQuery filterQuery) {
		super(filterQuery);
		this.filterQuery = filterQuery;
	}



	@Override
	public String createFilterQuery() {
		 
		return filterQuery.createFilterQuery() + addRecordStatusCriteria();
	
	}



	private String addRecordStatusCriteria() {
		 
		return "\n PENDDOC or PENDDOCREJECT";
		
	}

	
	
}
